package work_with_files;

import java.io.*;
import java.util.stream.Stream;

public class CopyEx2 {
    public static void main(String[] args) {
        try (FileInputStream reader = new FileInputStream(new File("C:\\Tmp\\CV_Sagayda_Alexandr_Java.pdf"));
             FileOutputStream writer = new FileOutputStream(new File("CV_Sagayda_Alexandr_Java.pdf"))) {
            int i;

            while ((i=reader.read())!=-1) {
                writer.write(i);

            }
//            String line;
//            while ((line = reader.readLine()) != null) {
//                writer.write(line);
//                writer.write("\n");
//            }

//            int character;
//            while ((character = reader.read()) != -1) {
//                writer.write(character);
//            }


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
