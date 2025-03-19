package org.lafed;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        StringBuilder output = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            output.append(n).append(" x ").append(i).append(" = ").append(n * i).append("\n");
        }

        System.out.print(output.toString().trim());

        bufferedReader.close();
    }
}
