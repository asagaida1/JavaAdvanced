package work_with_files;

import java.io.*;

public class DataStreamsEx {
    public static void main(String[] args) {
        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("my_test.bin"));
             DataInputStream inputStream = new DataInputStream(new FileInputStream("my_test.bin"))) {
             outputStream.writeBoolean(true);
             outputStream.writeByte(5);
             outputStream.writeChar(120);
             outputStream.writeShort(500);
             outputStream.writeInt(1_000_000);
             outputStream.writeDouble(3.14);
             outputStream.writeFloat(123.456f);

            System.out.println(inputStream.readBoolean());
            System.out.println(inputStream.readByte());
            System.out.println(inputStream.readChar());
            System.out.println(inputStream.readShort());
            System.out.println(inputStream.readInt());
            System.out.println(inputStream.readDouble());
            System.out.println(inputStream.readFloat());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
