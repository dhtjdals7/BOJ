package basicmath1;

import java.util.Scanner;

public class BreakEvenPoint {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if(B >= C) System.out.println(-1);
        else{
            int cnt = 1;
            while(true){
                if((C - B) * cnt > A){
                    System.out.println(cnt);
                    break;
                }
                cnt++;
            }
        }

    }
}
