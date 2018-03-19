package task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array2 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите i");
        int i = Integer.parseInt(reader.readLine());
        System.out.println("Введите j");
        int j = Integer.parseInt(reader.readLine());

        int[][] arr = new int[i][j];

        for (int n = 0, m = 0; n < i; n++, m++) {
            arr[n][m] = 1;
        }
        for (int n = 0, m = j-1; n < i; n++, m--) {
            arr[n][m] = 1;
        }

        for (int l = 0; l < i; l++) {
            for (int k = 0; k < j; k++) {
                System.out.print(arr[l][k]);
            }
            System.out.println();
        }
    }
}
