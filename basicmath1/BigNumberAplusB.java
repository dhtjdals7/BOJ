package basicmath1;

import java.util.Scanner;

// BOJ 10757
public class BigNumberAplusB {
    static String result;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        System.out.println(reverseNum(calAplusB(reverseNum(A), reverseNum(B))));
    }

    static String reverseNum(String num){
        StringBuilder sb = new StringBuilder();
        for(int i = num.length() - 1 ; i >= 0; i--){
            sb.append(num.charAt(i));
        }

        return sb.toString();
    }

    static String calAplusB(String str1, String str2){
        StringBuilder sb = new StringBuilder();
        int length = Math.max(str1.length(), str2.length());

        int paddingLength;
        if(str1.length() > str2.length()){
            paddingLength = str1.length() - str2.length();
            for(int i = 0;i< paddingLength; i++){
                str2 += "0";
            }
        } else if(str2.length() > str1.length()){
            paddingLength = str2.length() - str1.length();
            for(int i = 0;i<paddingLength; i++){
                str1 += "0";
            }
        }

        int ceil = 0;
        for(int i = 0;i<length;i++){
            int a = str1.charAt(i) - '0';
            int b = str2.charAt(i) - '0';

            if(i == length - 1){
                sb.append(reverseNum(String.valueOf(a + b + ceil)));
                break;
            }

            if(a+b+ceil >= 10){
                sb.append( (a+b+ceil) % 10);
                ceil = 1;
            } else{
                sb.append(a + b + ceil);
                ceil = 0;
            }
        }

        return sb.toString();
    }
}
