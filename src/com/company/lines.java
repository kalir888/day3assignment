package com.company;

import java.util.Arrays;
import java.util.Scanner;


public class lines {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int[] line1PointA = new int[2];
        for (int i = 0; i < line1PointA.length; i++){
            System.out.println("Enter the coordinate" + i + " of the pointA of line1");
            line1PointA[i] = in.nextInt();
        }
        int[] line1PointB = new int[2];
        for (int i = 0; i < line1PointB.length; i++){
            System.out.println("Enter the coordinate" + i + " of the pointB of line1");
            line1PointB[i] = in.nextInt();
        }
        Double line1Length = Math.pow((Math.pow((line1PointB[0]-line1PointA[0]),2)+Math.pow((line1PointB[1]-line1PointA[1]),2)),2);
        System.out.println("coordinates of your line1PointA = " + Arrays.toString(line1PointA));
        System.out.println("coordinates of your line1PointB = " + Arrays.toString(line1PointB));
        System.out.println("length of the line1 is = " + line1Length);
        int[] line2PointA = new int[2];
        for (int i = 0; i < line2PointA.length; i++){
            System.out.println("Enter the coordinate" + i + " of the pointA of line2");
            line2PointA[i] = in.nextInt();
        }
        int[] line2PointB = new int[2];
        for (int i = 0; i < line2PointB.length; i++){
            System.out.println("Enter the coordinate" + i + " of the pointB of line1");
            line2PointB[i] = in.nextInt();
        }
        Double line2Length = Math.pow((Math.pow((line2PointB[0]- line2PointA[0]),2)+Math.pow((line2PointB[1]- line2PointA[1]),2)),2);
        System.out.println("coordinates of your line2PointA = " + Arrays.toString(line2PointA));
        System.out.println("coordinates of your line2PointB = " + Arrays.toString(line2PointB));
        System.out.println("length of the line2 is = " + line2Length);
        if (line1Length.equals(line2Length))
            System.out.println("Both lines have equal length");
        else
            System.out.println("Both lines not have equal length");
        int compare = line1Length.compareTo(line2Length);
        if (compare > 0)
            System.out.println("line1 is greater than line2");
        else if (compare < 0)
            System.out.println("line1 is lesser than line2");
        else
            System.out.println("line1 is equal to line2");
    }
}
