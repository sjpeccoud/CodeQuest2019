package CodeQuest2019;

import java.util.Scanner;

public class Prob04
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
            int speed = s.nextInt();
            boolean isBirthday = s.nextBoolean();

            if (isBirthday)
            {
                noTicket += 5;
                smTicket += 5;
                lgTicket += 5;
            }

            if (speed <= noTicket)
            {
                System.out.println("no ticket");
            }
            else if (speed > noTicket && speed <=smTicket)
            {
                System.out.println("small ticket");
            }
            else
            {
                System.out.println("big ticket");
            }

        }
    }
}
