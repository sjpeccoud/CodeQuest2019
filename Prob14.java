import java.util.ArrayList;
import java.util.Scanner;

public class Prob14
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int numInputs = Integer.parseInt(s.nextLine());
        for (int i = 0; i < numInputs; i++)
        {
            int numLines = Integer.parseInt(s.nextLine());
            String[][] cities = new String[numLines][2];
            ArrayList<String> orderedCities = new ArrayList<>();
            for(int j = 0; j < numLines; j++)
            {
                String[] line = s.nextLine().split(" ");
                cities[j][0] = line[0];
                cities[j][1] = line[1];
            }
            for(int r1 = 0; r1 < cities.length; r1++)
            {
                boolean has_Match = false;
                for(int r2 = 0; r2 < cities.length; r2++)
                {
                    if(cities[r1][0].equals(cities[r2][1]))
                    {
                        has_Match = true;
                    }
                }
                if(!has_Match)
                {
                    orderedCities.add(cities[r1][0]);
                    orderedCities.add(cities[r1][1]);
                }
            }
            for(int or = 1; or < orderedCities.size(); or++)
            {
                for(int k = 0; k < cities.length; k++)
                {
                    if(orderedCities.get(or).equals(cities[k][0]))
                    {
                        orderedCities.add(cities[k][1]);
                    }
                }
            }
            for(int p = orderedCities.size()-1; p >= 0; p--)
            {
                System.out.println(orderedCities.get(p));
            }
        }
    }
}
