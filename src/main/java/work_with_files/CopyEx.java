package work_with_files;

import java.io.*;

public class CopyEx {
    public static void main(String[] args) {
        String s;

        try (BufferedReader reader = new BufferedReader(new FileReader("test2.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("test3.txt"))) {

            String line;


            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.write("\n");

            }
//            int character;
//            while ((character = reader.read()) != -1) {
//                writer.write(character);
//        }


            System.out.println("done");
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}
