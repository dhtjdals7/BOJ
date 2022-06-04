package basicmath2;

import java.util.Scanner;

// BOJ 11653
public class Factorization {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        boolean flag = true;
        while(flag){
            if(N == 1) break;
            for(int i = 2; i <= N; i++){
                if(N == i){
                    System.out.println(i);
                    flag = false;
                    break;

                }
                if(N % i == 0){
                    N = N / i;
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
