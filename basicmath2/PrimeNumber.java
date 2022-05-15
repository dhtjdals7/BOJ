package basicmath2;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

// BOJ 2581
public class PrimeNumber {
    static int sum = 0;
    static Queue<Integer> queue = new PriorityQueue<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        for(int i = M; i <= N; i++){
            if(isPrime(i)) queue.add(i);
        }

        if(queue.isEmpty()) System.out.println(-1);
        else{
            for(int i : queue){
                sum += i;
            }
            System.out.println(sum +"\n" + queue.peek());
        }
    }

    static boolean isPrime(int n){
        int cnt = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                cnt++;
            }
        }
        if(cnt == 2) return true;
        return false;
    }
}
