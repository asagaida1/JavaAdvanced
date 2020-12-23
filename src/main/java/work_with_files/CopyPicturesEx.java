package work_with_files;

import java.io.*;

public class CopyPicturesEx {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Tmp\\CV_Sagayda_Alexandr_Java.pdf"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("CV_Sagayda_Alexandr_Java.pdf"))) {

//            String line;
//            while ((line = reader.readLine()) != null) {
//                writer.write(line);
//                writer.write("\n");
//            }

            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
        }


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
