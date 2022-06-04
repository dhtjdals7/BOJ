package basicmath2;

import java.util.*;

// BOJ 9020
public class GoldBachGuess {
    static Queue<Integer> queue = new PriorityQueue<>();
    static Map<Integer, Integer> map = new HashMap<>();
    static int[] prime = new int[10001];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = 2; i <= 10000; i++ ){
            if(isPrime(i)){
                prime[i] = 1;
            }
        }

        for(int i = 0; i < T; i++){
            int MIN_VALUE = Integer.MAX_VALUE;
            int n = sc.nextInt();

            for(int j = 2 ; j < n; j++){
                if(prime[j] == 1){
                    map.put(j,j);
                }
            }

            for (int key : map.keySet()) {
                if (map.containsKey(n - key)) {
                    int absNum = Math.abs(key - (n - key));
                    if (absNum < MIN_VALUE) {
                        MIN_VALUE = absNum;
                        queue.clear();
                        queue.add(key);
                        queue.add(n - key);
                    }
                }
            }
            System.out.println(queue.poll() + " " + queue.poll());
            map.clear();

        }
    }

    static boolean isPrime(int num){
        int cnt = 0;
        for(int i = 1; i <= Math.sqrt(num); i++){
            if(num % i == 0) cnt++;
        }

       return cnt == 1;
    }
}
