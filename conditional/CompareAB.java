package conditional;

import java.util.Scanner;

// BOJ 1330
public class CompareAB {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        if(A > B) System.out.println(">");
        else if(A < B) System.out.println("<");
        else System.out.println("==");
    }
}
