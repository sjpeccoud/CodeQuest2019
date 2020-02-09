package CodeQuest2019;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;


public class Prob16
{
    public static void main(String[] args)
    {
        DecimalFormat df = new DecimalFormat("#");
        Scanner s = new Scanner(System.in);
        int numInputs = Integer.parseInt(s.nextLine());
        for (int i = 0; i < numInputs; i++)
        {
            int numOfCiphers = Integer.parseInt(s.nextLine());
            String cipherText = s.nextLine();

            for (int j = 0; j < numOfCiphers; j++)
            {
                String cipherKey = s.nextLine();
                String unCipheredText = "";

                for (int c = 0; c < cipherKey.length(); c = c + 2)
                {
                    String hexKey = cipherKey.substring(c, c+2);
                    int decimalKey = Integer.parseInt(hexKey, 16);
                    String binaryKey = Integer.toBinaryString(decimalKey);

                    String hexText = cipherText.substring(c, c+2);
                    int decimalText = Integer.parseInt(hexText, 16);
                    String binaryText = Integer.toBinaryString(decimalText);
                    String asciiBinary = "";

                    //System.out.println("Bin1: " + binary1);
                    //System.out.println("Bin2: " + binary2);

                    //Makes the Binaries the same length incase one is zero
                    if(binaryKey.length() < binaryText.length())
                    {
                        while(binaryKey.length() != binaryText.length())
                        {
                            binaryKey = "0" + binaryKey;
                        }
                    }
                    else
                    {
                        while(binaryKey.length() != binaryText.length())
                        {
                            binaryText = "0" + binaryText;
                        }
                    }

                    //System.out.println();
                    //System.out.println("Bin1: " + binary1);
                    //System.out.println("Bin2: " + binary2);

                    //XOR Proccess
                    for(int b = 0; b < binaryText.length(); b++)
                    {
                        if (binaryText.charAt(b) == binaryKey.charAt(b))
                        {
                            asciiBinary += "0";
                        }
                        else
                            asciiBinary += "1";
                    }

                    //System.out.println("Bin1: " + binary1);
                    //System.out.println("Bin2: " + binary2);
                    //System.out.println("Ascii Bin : " + asciiBinary);
                    int asciiDecimal = Integer.parseInt(asciiBinary, 2);

                    String decodedLetter = Character.toString((char) asciiDecimal);
                    unCipheredText += decodedLetter;
                    //System.out.println(asciiDecimal);
                    //System.out.println(decodedLetter);
                }
                //prints the answer
                System.out.println("[" + unCipheredText + "]");
            }
        }
    }
}