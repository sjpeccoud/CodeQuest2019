package CodeQuest2019;

import java.util.Scanner;

public class Prob03
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int numInputs = Integer.parseInt(s.nextLine());
        for (int i = 0; i < numInputs; i++)
        {
            boolean g1 = s.nextBoolean();
            boolean g2 = s.nextBoolean();

            if (g1 == g2)
            {
                System.out.println("true");
            }
            else
            {
                System.out.println("false");
            }

        }
    }
}
