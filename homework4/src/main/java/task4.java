import java.io.*;

public class task4 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = null;
        FileReader fr = null;

        fr = new FileReader("files/newPage.txt");
        br = new BufferedReader(fr);

        String currentStr;

        long t = System.currentTimeMillis();
        while ((currentStr = br.readLine()) != null) {
            System.out.println(currentStr);
        }
        System.out.println(System.currentTimeMillis() - t);

        br.close();
        fr.close();

    }
}
