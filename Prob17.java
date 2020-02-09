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
        int[][] board = new int[10][10];

        for (int i = 0; i < numInputs; i++)
        {
            int numOfGenerations = Integer.parseInt(s.nextLine());
            String cipherText = s.nextLine();

            //Takes the input
            for(int r = 0; r < 10; r++)
            {
                for(int c = 0; c < 10; c++)
                {
                    String line = s.nextLine();
                    for (int ch = 0; ch < 10; ch++)
                    {
                        board[r][c] = Integer.parseInt((Character.toString(line.charAt(ch))));
                    }
                }
            }

            //Repeat for number of generations
            for (int g = 0; g < numOfGenerations; g++)
            {

            }

        }
    }
}