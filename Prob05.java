package CodeQuest2019;

import java.util.Scanner;

public class Prob05
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int noTicket = 60;
        int smTicket = 80;
        int lgTicket = 81;

        int numInputs = Integer.parseInt(s.nextLine());
        for (int i = 0; i < numInputs; i++)
        {
            int smBricks = s.nextInt();
            int lgBricks = s.nextInt();
            int target = s.nextInt();

            if ((target-(lgBricks*5)) <= smBricks)
                System.out.println("true");
            else
                System.out.println("false");

        }
    }
}
