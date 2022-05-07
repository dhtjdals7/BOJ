package conditional;

import java.util.Scanner;

// BOJ 2525
public class OvenClcok {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        int workMinute = sc.nextInt();

        if(M + workMinute >= 60){
            int plusH = (M + workMinute) / 60;
            M = (M + workMinute) % 60;
            if(H + plusH >= 24){
                System.out.println(String.valueOf(H + plusH - 24) + " " + M);
            } else {
                System.out.println(String.valueOf(H + plusH ) + " " + M);
            }
        } else{
            System.out.println(String.valueOf(H) + " " + String.valueOf(M + workMinute));
        }

    }
}
