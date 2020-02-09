package CodeQuest2019;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Prob08
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("#");

        int numInputs = Integer.parseInt(s.nextLine());

        for (int i = 0; i < numInputs; i++)
        {
            int x = s.nextInt() + 3;
            int y = s.nextInt() + 3;

            int[][] screen = new int[26][26];

            screen[x][y] = 100;

            for (int j = 3; j < screen.length - 3; j++)
            {
                for (int k = 3; k < screen.length - 3; k++)
                {

                    if ((screen[j + 1][k + 1] == 100 || screen[j + 1][k] == 100 || screen[j + 1][k - 1] == 100
                            || screen[j][k + 1] == 100 || screen[j][k - 1] == 100
                            || screen[j - 1][k - 1] == 100 || screen[j - 1][k] == 100 || screen[j - 1][k + 1] == 100)
                            && (screen[j][k] <= 10))
                    {
                        screen[j][k] = 50;

                    }

                }
            }

            for (int j = 3; j < screen.length - 3; j++)
            {
                for (int k = 3; k < screen.length - 3; k++)
                {
                    if ((screen[j + 1][k + 1] == 50 || screen[j + 1][k] == 50 || screen[j + 1][k - 1] == 50
                            || screen[j][k + 1] == 50 || screen[j][k - 1] == 50
                            || screen[j - 1][k - 1] == 50 || screen[j - 1][k] == 50 || screen[j - 1][k + 1] == 50)
                            && (screen[j][k] <= 10))
                    {
                        screen[j][k] = 25;

                    } else if (screen[j][k] == 0)
                    {
                        screen[j][k] = 10;
                    }
                }
            }

            for (int a = 3; a < screen.length - 3; a++)
            {
                for (int b = 3; b < screen.length - 3; b++)
                {
                    System.out.print(screen[a][b] + " ");
                }
                System.out.println();
            }
        }
    }
}
