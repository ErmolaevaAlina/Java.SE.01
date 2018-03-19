package task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array1 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("введите количество чисел");
        int num = Integer.parseInt(reader.readLine());

        int [] arr = new int [2*num];
        System.out.println("Вводите числа");
        for (int i=0; i<2*num;i++){
            arr[i] = Integer.parseInt(reader.readLine());
        }

        int [] sum = new int[num];

        for (int i=0; i<num;i++){
            sum[i] = arr[i]+arr[2*num-1-i];
            System.out.println(sum[i]);
        }
        int max = sum[0];
        for (int i = 0; i< num; i++){
            if (sum[i]>max){
                max = sum[i];
            }
        }
        System.out.println("Maximum is "+ max);
    }
}
