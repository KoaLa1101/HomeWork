package SecondHW;

import java.io.*;

public class Ex8 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Xiaomi\\IdeaProjects\\HomeWork\\gg.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write('ю');
        FileInputStream fileInputStream = new FileInputStream(file);
        int i;
        while((i=fileInputStream.read())!=-1){
            System.out.print((char)i);
        }
        fileInputStream.close();
        fileOutputStream.close();

    }
}
