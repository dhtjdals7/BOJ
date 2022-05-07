package onedimensionalarray;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// BOJ 3052
public class Remainder {
    static Set<Integer> set = new HashSet<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 10; i++){
            set.add(sc.nextInt() % 42);
        }

        System.out.println(set.size());
    }
}
