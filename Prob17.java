package CodeQuest2019;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

//public Cell[][] board = new Cell[10][10];

public class Prob17 {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#");
        Scanner s = new Scanner(System.in);

        int numInputs = Integer.parseInt(s.nextLine());
        Cell[][] board = new Cell[12][12];

        for (int i = 0; i < numInputs; i++) {
            int numOfGenerations = Integer.parseInt(s.nextLine());

            //Takes the input
            for (int r = 1; r < 11; r++) {
                for (int c = 1; c < 11; c++) {
                    String line = s.nextLine();
                    //System.out.println(line.length());
                    for (int ch = 0; ch < line.length(); ch++)

                        if (line.substring(ch, ch + 1).equals("0"))
                            board[r][c] = new Cell(false, r, c);
                        else
                            board[r][c] = new Cell(true, r, c);
                }
            }


            //Repeat for number of generations
            for (int g = 0; g < numOfGenerations; g++) {
                //Find adjacent Life
                for (int x = 1; x < 11; x++) {
                    for (int y = 1; y < 11; y++) {
                        Cell cell = board[x][y];

                        if (board[x - 1][y - 1].getLife())
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
                    }
                }

                //change the board
                for (int v = 1; v < 11; v++) {
                    for (int h = 1; h < 11; h++) {
                        Cell cell = board[v][h];
                        if (cell.getLife()) {
                            if (cell.getAdjacentLife() <= 1) {
                                cell.setLife(false);
                            } else if (cell.getAdjacentLife() >= 2 && cell.getAdjacentLife() <= 3) {
                                cell.setLife(true);
                            } else if (cell.getAdjacentLife() >= 4) {
                                cell.setLife(false);
                            }
                        } else {
                            if (cell.getAdjacentLife() == 3) {
                                cell.setLife(true);
                            }
                        }

                    }
                }
            }

            for (int pX = 1; pX < 11; pX++) {
                for (int pY = 1; pY < 11; pY++) {
                    Cell cell = board[pX][pY];
                    if (cell.getLife())
                        System.out.print(1);
                    else
                        System.out.print(0);
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

           public Cell(boolean life, int x, int y)
           {
               this.life = life;
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

    public int getAdjacentLife() {
        return adjacentLife;
    }

    public void setAdjacentLife(int adjacentLife) {
        this.adjacentLife = adjacentLife;
    }

    public void setLife(boolean life) {
        this.life = life;
    }
}