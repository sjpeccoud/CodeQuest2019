package CodeQuest2019;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;


public class Prob17
{

    public static void main(String[] args)
    {
        DecimalFormat df = new DecimalFormat("#");
        Scanner s = new Scanner(System.in);

        int numInputs = Integer.parseInt(s.nextLine());
        Cell[][] board = new Cell[12][12];

        for (int i = 0; i < numInputs; i++)
        {

            //gets the number of generations
            int numOfGenerations = Integer.parseInt(s.nextLine());
            //System.out.println(numOfGenerations);

            //Initializes a Blank board of dead cells
            for (int initR = 0; initR < 12; initR++)
            {
                for (int initC = 0; initC < 12; initC++)
                {
                    board[initR][initC] = new Cell(initR, initC);
                }
            }
            //System.out.println("Test Before input Loop");

            //Takes the input
            for (int r = 1; r < 11; r++)
            {
                //System.out.println("Test in row loop of input- number: " + r);

                String line = s.nextLine();
                //System.out.println(line.length());
                for (int ch = 0; ch < line.length(); ch++)
                {

                    if (line.substring(ch, ch + 1).equals("1"))
                    {
                        board[r][ch].setLife(true);
                    }

                }

            }


            //System.out.println("Test before gen Loop");
            //Repeat for number of generations
            for (int g = 0; g < numOfGenerations; g++)
            {
                //System.out.println("Test in gen Loop");
                //Find adjacent Life
                for (int x = 1; x < 11; x++)
                {
                    for (int y = 1; y < 11; y++)
                    {
                        Cell cell = board[x][y];

                        //Checks the eight boxes around the cell
                        if (board[x-1][y - 1].getLife())
                            cell.setAdjacentLife(cell.getAdjacentLife() + 1);

                        if (board[x - 1][y].getLife())
                            cell.setAdjacentLife(cell.getAdjacentLife() + 1);

                        if (board[x - 1][y + 1].getLife())
                            cell.setAdjacentLife(cell.getAdjacentLife() + 1);

                        if (board[x][y - 1].getLife())
                            cell.setAdjacentLife(cell.getAdjacentLife() + 1);

                        if (board[x][y + 1].getLife())
                            cell.setAdjacentLife(cell.getAdjacentLife() + 1);

                        if (board[x + 1][y + 1].getLife())
                            cell.setAdjacentLife(cell.getAdjacentLife() + 1);

                        if (board[x + 1][y - 1].getLife())
                            cell.setAdjacentLife(cell.getAdjacentLife() + 1);

                        if (board[x + 1][y].getLife())
                            cell.setAdjacentLife(cell.getAdjacentLife() + 1);

                        /*

                        if(cell.getAdjacentLife() > 1)
                        {
                            System.out.println("Cell at Row: " + (x - 1) + " Colum: " + (y - 1) + " adjacent life = " + cell.getAdjacentLife());
                        }

                         */
                    }
                }

                //change the board
                for (int v = 1; v < 11; v++)
                {
                    for (int h = 1; h < 11; h++)
                    {
                        Cell cell = board[v][h];
                        if (cell.getLife())
                        {
                            if (cell.getAdjacentLife() <= 1)
                            {
                                cell.setLife(false);
                            } else if (cell.getAdjacentLife() >= 2 && cell.getAdjacentLife() <= 3)
                            {
                                cell.setLife(true);
                            } else if (cell.getAdjacentLife() >= 4)
                            {
                                cell.setLife(false);
                            }
                        }
                        else
                        {
                            if (cell.getAdjacentLife() == 3)
                            {
                                cell.setLife(true);
                            }
                        }

                        cell.setAdjacentLife(0);

                    }
                }

                /*
                System.out.println("Board at gen " + g);
                //prints out the board
                for (int pR = 1; pR < 11; pR++)
                {
                    for (int pC = 1; pC < 11; pC++)
                    {
                        Cell cell = board[pR][pC];
                        if (cell.getLife())
                            System.out.print(1);
                        else
                            System.out.print(0);
                    }
                    System.out.println();
                }
                System.out.println();

                 */
            }


            //prints out the board
            for (int pR = 1; pR < 11; pR++)
            {
                for (int pC = 1; pC < 11; pC++)
                {
                    Cell cell = board[pR][pC];
                    if (cell.getLife())
                        System.out.print(1);
                    else
                        System.out.print(0);

                    cell.setAdjacentLife(0);
                }
                System.out.println();
            }




        }

    }
}

class Cell
{
    private int x, y;
    private int adjacentLife;

    private boolean life;

    public Cell(int x, int y)
    {
        this.life = false;
        this.x = x;
        this.y = y;
        adjacentLife = 0;
    }

    public boolean getLife()
    {
        return life;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public int getAdjacentLife()
    {
        return adjacentLife;
    }

    public void setAdjacentLife(int adjacentLife)
    {
        this.adjacentLife = adjacentLife;
    }

    public void setLife(boolean life)
    {
        this.life = life;
    }
}