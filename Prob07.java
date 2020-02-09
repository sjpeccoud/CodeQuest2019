import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Prob07
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("#");

        int numInputs = Integer.parseInt(s.nextLine());

        for (int i = 0; i < numInputs; i++)
        {
            int numOfValues = s.nextInt();

            double[] values = new double[numOfValues];

            for (int j = 0; j < numOfValues; j++)
            {
                values[j] = s.nextDouble();
            }

            double max = values[0];
            double min = values[0];
            for (int r = 0; r < values.length; r++)
            {
                if (values[r] > max)
                {
                    max = values[r];
                }
                else if (values[r] < min)
                {
                    min = values[r];
                }
            }

            for (int k = 0; k < values.length; k++)
            {
                System.out.println((int)(((values[k] - min) / (max - min) * 255) + 0.5));
            }

        }
    }
}
