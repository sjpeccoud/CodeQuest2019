package CodeQuest2019;

import java.util.Scanner;

public class Prob01
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int numInputs = Integer.parseInt(s.nextLine());

        for (int i = 0; i < numInputs; i++)
        {
            String str = s.nextLine();
            System.out.println(str.toLowerCase());
        }
    }
}
