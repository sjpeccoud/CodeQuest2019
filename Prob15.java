package CodeQuest2019;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;


public class Prob15
{
    public static void main(String[] args)
    {
        DecimalFormat df = new DecimalFormat("#");
        Scanner s = new Scanner(System.in);
        int numInputs = Integer.parseInt(s.nextLine());
        for (int i = 0; i < numInputs; i++)
        {
            String[] data = s.nextLine().split(" ");
            String[] timeStr = s.nextLine().split(" ");
            int numBlocks = data.length;
            double[] timeStamp = new double[numBlocks];
            Prob15Block[] blocks = new Prob15Block[numBlocks];

            for (int j = 0; j < numBlocks; j++)
            {
                timeStamp[j] = Double.parseDouble(timeStr[j]);
                //System.out.println(timeStamp[j]);
                if (j == 0)
                {
                    blocks[j] = new Prob15Block(timeStamp[j], data[j]);
                } else
                {
                    blocks[j] = new Prob15Block(j + 1, timeStamp[j], data[j], blocks[j - 1].hash);
                }
            }

            System.out.println(df.format(blocks[blocks.length - 1].hash));

        }
    }
}

class Prob15Block
{
    int index;
    double timeStamp;
    String data;
    double prevHash;
    double hash;

    public Prob15Block(int index, double timeStamp, String data, double prevHash)
    {
        this.index = index;
        this.timeStamp = timeStamp;
        this.data = data;
        this.prevHash = prevHash;
        hash = calculateHash();
    }

    public Prob15Block(double timeStamp, String data)
    {
        this.index = 0;
        this.timeStamp = timeStamp;
        this.data = data;
        this.prevHash = 0;
        this.hash = ((index + timeStamp + prevHash + dataValue()) * 50) / 147;

    }

    public double calculateHash()
    {
        //System.out.println("Block:" + index+ " " + dataValue());
        return (((index + timeStamp + prevHash + dataValue()) * 50) / 147);
    }

    private int dataValue()
    {
        int value = 0;
        char[] alphabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        for (int i = 0; i < data.length(); i++)
        {
            for (int j = 0; j < alphabet.length; j++)
            {
                if (data.charAt(i) == alphabet[j])
                {
                    // System.out.println(j+1);
                    value += j + 1;
                }
            }
        }
        return value;
    }
}