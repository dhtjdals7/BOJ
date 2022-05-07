package conditional;

import java.util.Scanner;

// BOJ 2884
public class AlarmClock {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();

        if(H == 0 && M < 45) H = 24;

        if(M >= 45) System.out.println(String.valueOf(H) + " "  + String.valueOf(M - 45));
        else System.out.println(String.valueOf(H - 1) + " " + String.valueOf(M + 15));
    }
}
