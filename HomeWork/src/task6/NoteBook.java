package task6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NoteBook {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private Record [] records =new Record[100];


    public void getAll() {
        for (int i=0;i<100;i++)
            System.out.println(i+" "+records[i]);
    }

    public void addRecords() throws IOException {
        int string = 0;
        System.out.println("Введите новую запись:");
        records[string] = new Record(reader.readLine());
    }

    public void delRecords() throws IOException {
        System.out.println("Выберите строку для удаления");
        getAll();
        records[Integer.parseInt(reader.readLine())]=null;
    }

    public void modification () throws IOException {
        System.out.println("Выберите строку для изменения");
        getAll();
        int string = Integer.parseInt(reader.readLine());
        System.out.println("Введите новузапись:");
        records[string]= new Record(reader.readLine());
    }
    private static void select() {
        System.out.println("Выберите:");
        System.out.println("0-просмотр");
        System.out.println("1-новая запись");
        System.out.println("2-изменение");
        System.out.println("3-удаление");
        System.out.println("4-закончить");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        NoteBook notebook = new NoteBook();
        select();
        while (Integer.parseInt(reader.readLine()) != 4) {
            int k = Integer.parseInt(reader.readLine());
            if (k == 1) {
                notebook.addRecords();
                System.out.println();
                select();


            }
            if (k == 0) {
                notebook.getAll();
                System.out.println();
                select();
            }
            if (k == 2) {
                notebook.modification();
                System.out.println();
                select();
            }
            if (k == 3) {
                notebook.delRecords();
                System.out.println();
                select();
            }

        }


    }
}

