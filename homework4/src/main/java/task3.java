import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class task3 {
    public static void main(String[] args) throws IOException {

        ArrayList<InputStream> alis = new ArrayList<>();
        alis.add(new FileInputStream("files/file2.txt"));
        alis.add(new FileInputStream("files/file3.txt"));
        alis.add(new FileInputStream("files/file4.txt"));
        alis.add(new FileInputStream("files/file5.txt"));

        File file = new File("files/rezultFile.txt");
        file.createNewFile();
        FileOutputStream out = new FileOutputStream("files/rezultFile.txt");

        SequenceInputStream in = new SequenceInputStream(Collections.enumeration(alis));

        int x;
        while ((x = in.read()) != -1) {
            out.write(x);
        }

        in.close();
    }
}
