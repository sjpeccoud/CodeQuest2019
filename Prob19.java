package CodeQuest2019;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;


public class Prob19
{
    public static void main(String[] args)
    {
        DecimalFormat df = new DecimalFormat("#");
        Scanner s = new Scanner(System.in);
        int numInputs = Integer.parseInt(s.nextLine());
        for (int i = 0; i < numInputs; i++)
        {
            int numOfAddresses = Integer.parseInt(s.nextLine());

            //Puts all the addresses into an arraylist
            ArrayList<String> addresses = new ArrayList<>();
            for (int j = 0; j < numOfAddresses; j++)
            {
                addresses.add(s.nextLine());
            }

            // Proccesing the arraylist
            for(int a = 0; a < addresses.size(); a ++)
            {
                String newAddress = "";
                for(int d = 0; d < addresses.get(a).length(); d++)
                {
                    if(addresses.get(a).charAt(d) != '.')
                    {
                        newAddress += (addresses.get(a).charAt(d);
                    }
                }
            }

            //Finds the lowest common bit
            int lowestCommonBitCount = 0;
            for(int packetNum = 0; packetNum < 4; packetNum++)
            {
                int lastLow = 10000000;
                for(int q = 0; q < addresses.size() - 1; q++)
                {
                    String bin1 = Integer.toBinaryString(Integer.parseInt(addresses.get(q).substring(packetNum * 8, (packetNum + 1)*8)));
                    String bin2 = Integer.toBinaryString(Integer.parseInt(addresses.get(q+1).substring(packetNum * 8, (packetNum + 1) * 8)));

                    for(int l = 0; l < bin1.length(); l++)
                    {
                        if(bin1.charAt(l) == bin2.charAt(l))
                        {
                            lowestCommonBitCount++;
                        }
                    }

                    if(lowestCommonBitCount == 0)
                    {
                        break;
                    }

                    if(lowestCommonBitCount > lastLow)
                    {
                        lowestCommonBitCount = lastLow;
                    }

                    lastLow = lowestCommonBitCount;
                }
                if(lowestCommonBitCount < (8*(packetNum+1)))
                {
                    break;
                }
            }

            for(int w = 0; w < 4; w++)
            {
                int lowestAddress = 0;
                for(int r = 0; r < addresses.size() -1; r++)
                {
                    if (addresses.get(r).substring(w * 8, (w + 1)*8) != addresses.get(r + 1).substring(w * 8, (w + 1)*8))
                    {

                    }
                }
            }



        }
    }
}