package work_with_files;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("test10.txt", "rw")) {
            int a;
            String s;

            a = file.read();
            System.out.println((char) a);

            s=file.readLine();
            System.out.println(s);

            file.seek(101);
            String s2 = file.readLine();
            System.out.println(s2);

            long position = file.getFilePointer();
            System.out.println(position);

//            file.seek(0);
//            file.writeBytes("privet");

            file.seek(file.length()-1);
            file.writeBytes("\n \t\t\t\t\t William Butler Yeats");



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
