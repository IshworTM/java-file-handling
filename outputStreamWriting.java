package ChapterEight;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class outputStreamWriting {
    public static void main(String[] args) {
        String data = "Hello !!!\nThis is BCA Class\nThis is not so very exciting";
        try {
            OutputStream output = new FileOutputStream("Java/src/Chapter8Lab/output.txt");
            // Convert string into bytes
            byte[] dataToBytes = data.getBytes();
            // Write data into output stream
            output.write(dataToBytes);
            System.out.println(data.toString() + "\nhas been successfully written to the file.");
            output.close();
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
