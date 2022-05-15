package basicmath1;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

// BOJ 2869
public class Snail {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str;
        str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        int days = (V-A) / (A-B);
        if((V - A) % (A-B) != 0)
            days++;
        bw.write(String.valueOf(days + 1));
        bw.flush();
        bw.close();
    }
}
