package designpatterns.decorator.io;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        int c;

        InputStream in = new LowerCaseInputStream(
                new BufferedInputStream(
                        new FileInputStream("src/designpatterns/decorator/io/test.txt")
                )
        );

        while((c = in.read()) >= 0) {
            System.out.print((char)c);
        }

        System.out.println();

        in.close();
    }

}
