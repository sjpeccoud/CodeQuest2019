package CodeQuest2019;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Prob09
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("00");

        int numInputs = Integer.parseInt(s.nextLine());

        for (int i = 0; i < numInputs; i++)
        {
            int secs = 0;
            int mins = 0;
            int hrs = 0;
            String str = s.nextLine();
            for (int j = 0; j < str.length(); j++)
            {
                if (str.charAt(j) == 's')
                {
                    if (j > 1)
                    {
                        secs = Integer.parseInt(str.substring(j - 2, j));
                    }
                    else
                    {
                        secs = Integer.parseInt(str.substring(j-1, j));
                    }
                }
                else if (str.charAt(j) == 'm')
                {
                    if (j > 1)
                    {
                        mins = Integer.parseInt(str.substring(j - 2, j));
                    }
                    else
                    {
                        mins = Integer.parseInt(str.substring(j-1, j));
                    }
                }
                else if (str.charAt(j) == 'h')
                {
                    if (j > 1)
                    {
                        hrs = Integer.parseInt(str.substring(j - 2, j));
                    }
                    else
                    {
                        hrs = Integer.parseInt(str.substring(j-1, j));
                    }
                }
            }
            System.out.println(df.format(hrs) + ":" + df.format(mins) + ":" + df.format(secs));
        }
    }
}
