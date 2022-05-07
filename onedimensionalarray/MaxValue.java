package onedimensionalarray;

import java.util.Scanner;

// BOJ 2562
public class MaxValue {
    static int MAX_VALUE = Integer.MIN_VALUE;
    static int idx;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        for(int i = 0; i < 9; i++){
            arr[i] = sc.nextInt();
            if(arr[i] >= MAX_VALUE){
                MAX_VALUE = arr[i];
                idx = i + 1;
            }
        }

        System.out.println(MAX_VALUE + "\n" + idx);
    }
}
