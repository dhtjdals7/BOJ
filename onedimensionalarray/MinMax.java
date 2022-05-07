package onedimensionalarray;

import java.util.*;

// BOJ 10818
public class MinMax {
    static int[] arr;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        arr = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        System.out.println(arr[0] + " " + arr[arr.length - 1]);
    }
}
