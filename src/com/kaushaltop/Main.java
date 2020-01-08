package com.kaushaltop;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        rotateArray();
    }

    private static void rotateArray() {

        int position;
        int count;
        int original = 0;

        int tracker = 1;
        boolean notFound = true;

        System.out.println("Enter number of test cases: ");
        int testCases = scanner.nextInt();
        scanner.nextLine();

        do {

            System.out.println("Define array size: ");
            int size = scanner.nextInt();
            //scanner.nextLine();

            int[] a = new int[size];
            int[] b = new int[size];

            System.out.println("Enter the array elements: ");
            for (int i=0; i<a.length; i++)
                    a[i] = scanner.nextInt();

            System.out.println("Enter point element of rotation: ");
            int R = scanner.nextInt();
            scanner.nextLine();

            for (int i=0; i<a.length; i++) {

                if (a[i] == R) {
                    //System.out.println("Point of rotation: "+i);
                    position = i;
                    count = i;

                    rotationArray(position, count, a, b, original);
                    tracker++;

                    notFound = false;
                }
            }
            if (notFound) {

                System.out.println("Invalid Input");
            }

        } while (tracker <= testCases);

        scanner.close();
    }

    private static void rotationArray(int position, int count, int[] a, int[] b, int original){

        for (int i=0; i<b.length; i++) {

            position++;

            if (position < a.length) b[i] = a[position];
            else { if (original <= count) {
                b[i] = a[original];
                original++;
            } }
        }
        System.out.println();
        System.out.println("Before Rotation: ");
        System.out.println(Arrays.toString(a));
        System.out.println();
        System.out.println("After Rotation: ");
        System.out.println(Arrays.toString(b));
    }
}
