import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Prob13
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("00");

        int numInputs = Integer.parseInt(s.nextLine());

        for (int i = 0; i < numInputs; i++)
        {
            int rows = s.nextInt();
            int cols = s.nextInt();
            String[][] game = new String[rows+2][cols+2];

            int bombs = s.nextInt();

            initBoard(game);

            for(int j = 0; j < bombs; j++)
            {
                int x = s.nextInt();
                int y = s.nextInt();
                game[x+1][y+1] = "*";
            }

            for(int r = 1; r < game.length - 1; r++)
            {
                for(int c = 1; c < game[r].length -1; c++)
                {
                    if(!(game[r][c].equals("*")))
                    {
                        int num = 0;
                        if(game[r-1][c-1].equals("*"))
                        {
                            num++;
                        }
                        if(game[r-1][c].equals("*"))
                        {
                            num++;
                        }
                        if(game[r-1][c+1].equals("*"))
                        {
                            num++;
                        }
                        if(game[r][c-1].equals("*"))
                        {
                            num++;
                        }
                        if(game[r][c+1].equals("*"))
                        {
                            num++;
                        }
                        if(game[r+1][c-1].equals("*"))
                        {
                            num++;
                        }
                        if(game[r+1][c].equals("*"))
                        {
                            num++;
                        }
                        if(game[r+1][c+1].equals("*"))
                        {
                            num++;
                        }
                        game[r][c] = Integer.toString(num);
                    }
                }
            }
            printBoard(game);
        }
    }

    public static void printBoard(String[][] b)
    {
        for (int r = 1; r < b.length - 1; r++)
        {
            for (int c = 1; c < b[r].length - 1; c++)
            {
                System.out.print(b[r][c]);
            }
            System.out.println();
        }
    }

    public static void initBoard(String[][] b)
    {
        for (int r = 0; r < b.length; r++)
        {
            for (int c = 0; c < b[r].length; c++)
            {
                b[r][c] = "";
            }
        }
    }
}
