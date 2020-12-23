package work_with_files;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChanelBufferEx1 {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("test10.txt", "rw");
             FileChannel channel = file.getChannel();) {
            ByteBuffer buffer = ByteBuffer.allocate(25);
            StringBuilder strix = new StringBuilder();
            int byteRead = channel.read(buffer);
            while (byteRead>0){
                System.out.println("Read " + byteRead);
            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
