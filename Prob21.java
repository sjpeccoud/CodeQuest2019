package CodeQuest2019;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;


public class Prob21
{
    public static void main(String[] args)
    {
        DecimalFormat df = new DecimalFormat("#");
        Scanner s = new Scanner(System.in);
        int numInputs = Integer.parseInt(s.nextLine());
        for (int q = 0; q < numInputs; q++)
        {
            String[] spyData = s.nextLine().split(" ");
            String[] wallData = s.nextLine().split(" ");

            ArrayList<Double> intersectX = new ArrayList<Double>();
            ArrayList<Double> intersectY = new ArrayList<Double>();
            int spyX = Integer.parseInt(spyData[0]);
            int spyY = Integer.parseInt(spyData[1]);
            int camX = Integer.parseInt(spyData[2]);
            int camY = Integer.parseInt(spyData[3]);
            int numWalls = Integer.parseInt(spyData[4]);

            double slope = (spyY - camY) / (spyX - camX);
            double c = spyY - (slope * spyX);

            ArrayList<Wall> walls = new ArrayList<>();

            for(int w = 0; w < numWalls; w++)
            {
                String[] ln = s.nextLine().split(" ");
                walls.add(new Wall(Integer.parseInt(ln[0]), Integer.parseInt(ln[1]),
                        Integer.parseInt(ln[2]), Integer.parseInt(ln[3])));

                intersectX.add((c - walls.get(w).c) / (walls.get(w).slope - slope));
                intersectY.add(slope * intersectX.get(w) + c);
            }





        }
    }
}

class Wall
{
    int startX, startY, endX, endY;

    double slope, c;



    public Wall(int startX, int startY, int endX, int endY)
    {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        slope = (startY - endY) / (startX - endX);
        c = startY - (slope * startX);
    }

    public double getSlope()
    {
        return slope;
    }

    public double getC()
    {
        return c;
    }

    public int getStartX()
    {
        return startX;
    }

    public void setStartX(int startX)
    {
        this.startX = startX;
    }

    public int getStartY()
    {
        return startY;
    }

    public void setStartY(int startY)
    {
        this.startY = startY;
    }

    public int getEndX()
    {
        return endX;
    }

    public void setEndX(int endX)
    {
        this.endX = endX;
    }

    public int getEndY()
    {
        return endY;
    }

    public void setEndY(int endY)
    {
        this.endY = endY;
    }
}