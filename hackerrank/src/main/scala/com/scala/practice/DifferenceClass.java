package com.scala.practice;

import java.util.Arrays;
import java.util.Scanner;

public class DifferenceClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
class Difference {
    private int[] elements;
    public int maximumDifference;
    Difference(int[] elements1){
        this.elements = elements1;
    }
    void computeDifference(){
        Arrays.sort(elements);
        int min =elements[0];
        int max= elements[elements.length-1];
        maximumDifference = max-min;
    }
}
