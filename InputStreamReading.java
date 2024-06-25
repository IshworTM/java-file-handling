//Write a Java program to read a file using InputStream and print the content of file in console.

package ChapterEight;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamReading {
    public static void main(String[] args) {
        byte[] array = new byte[30];
        InputStream input = null;
        try {
            input = new FileInputStream("Java/src/Chapter8Lab/test.txt");
            System.out.println("The available byte in the file: " + input.available());
            input.read(array);
            System.out.println("Data on the file: ");
            String data = new String(array);
            System.out.println(data);
            input.close();
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}