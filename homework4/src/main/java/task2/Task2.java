package task2;

import java.io.*;

public class Task2 {
    public static void main(String[] args) throws IOException {

        try (FileInputStream in = new FileInputStream("files/file1.txt")) {
            byte[] arr = new byte[512];
            int x;

            while ((x = in.read(arr)) != -1) {
                System.out.print(new String(arr, 0, x));
            }
        }
    }

}
