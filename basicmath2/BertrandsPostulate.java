package basicmath2;

import java.io.*;
import java.util.Scanner;

// BOJ 4948
public class BertrandsPostulate{
    static int[] prime = new int[250000];
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        for(int i = 1; i < prime.length; i++){
            if(isPrime(i)) prime[i] = 1;
        }

        while (true) {
            int n = sc.nextInt();
            if(n == 0) {
                break;
            }

            int cnt = 0;
            for(int i = n + 1; i <= 2*n ; i++){
                if(prime[i] == 1) cnt++;
            }

            System.out.println(cnt);
        }
    }

    static boolean isPrime(int num){
        int cnt = 0;
        for(int i = 1; i <= Math.sqrt(num); i++){
            if(num % i == 0) cnt++;
        }

        if(cnt == 1) return true;
        return false;
    }
}
