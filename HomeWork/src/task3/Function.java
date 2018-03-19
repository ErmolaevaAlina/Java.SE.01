package task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Function {
    public static void main (String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("введите первую границу");
        double a = Double.parseDouble(reader.readLine());
        System.out.println("введите вторую границу");
        double b = Double.parseDouble(reader.readLine());
        System.out.println("введите шаг");
        double h = Double.parseDouble(reader.readLine());

        double x=a;
        while (x<=b){
            double f = Math.tan(2*x)-3;
            System.out.print(x + " ");
            System.out.println(f);
            x = x+h;

        }

    }

}
