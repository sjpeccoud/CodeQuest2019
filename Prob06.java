package CodeQuest2019;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Prob06
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("#.0");
        double earthRad = (40075)/(2 * Math.PI);

        int numInputs = Integer.parseInt(s.nextLine());
        for (int i = 0; i < numInputs; i++)
        {
            double alt = s.nextDouble();

            System.out.println(df.format((alt + earthRad)*2*Math.PI));

        }
    }
}
