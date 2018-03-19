package task2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cycle {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите e");
        double e = Double.parseDouble(reader.readLine());

        System.out.println("Введине n");
        int n = Integer.parseInt(reader.readLine());

        for (int i = 1; i<=n; i++) {
            double a;
            double den;
            den=(i+1)*(i+1);
            a=1/den;

            if (a<e){
                System.out.println("Наименьший номер элемента " + i);
                break;
            }
            else System.out.println(a);
        }
    }
}

