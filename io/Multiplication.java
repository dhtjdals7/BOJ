package io;

import java.util.Scanner;

// BOJ 2588
public class Multiplication {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int b1 = B / 100;
        int b2 = (B / 10) % 10;
        int b3 = B % 10;
        System.out.println(A * b3);
        System.out.println(A * b2);
        System.out.println(A * b1);
        System.out.println(A*B);
    }
}
