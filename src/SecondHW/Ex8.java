package SecondHW;

import java.io.*;

public class Ex8 {
    public static void main(String[] args) throws IOException {
        int a = 123;
        char b = 'ю';
        File file = new File("C:\\Users\\Xiaomi\\IdeaProjects\\HomeWork\\gg.txt");
        try (FileOutputStream fileOutputStream = new FileOutputStream(file)) {
            for (int i = 3; i >= 0; i--) {
                fileOutputStream.write(a >> i * 8);
            }
            for (int i = 1; i >= 0; i--) {
                fileOutputStream.write(b >> i * 8);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            a = 0;
            for (int i = 3; i >= 0; i--) {
                a = (fileInputStream.read() << i * 8) | a;
            }
            System.out.println(a);
            a = 0;
            for (int i = 1; i >= 0; i--) {
                a = (fileInputStream.read() << i * 8) | a;
            }
            System.out.println((char) a);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

