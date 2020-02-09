package CodeQuest2019;

import java.util.Scanner;

public class Prob02
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int numInputs = Integer.parseInt(s.nextLine());
        for (int i = 0; i < numInputs; i++)
        {
            int num1 = s.nextInt();
            int num2 = s.nextInt();

            if (num1 == num2)
            {
                System.out.println(num1 * 4);
            }
            else
            {
                System.out.println(num1 + num2);
            }
            //s.next();

        }
    }
}
