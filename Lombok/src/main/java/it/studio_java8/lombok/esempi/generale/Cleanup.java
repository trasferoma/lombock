package it.studio_java8.lombok.esempi.generale;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// https://projectlombok.org/features/Cleanup

public class Cleanup {
    public static void main(String[] args) throws IOException {
        @lombok.Cleanup
        InputStream in = new FileInputStream(args[0]);
        @lombok.Cleanup
        OutputStream out = new FileOutputStream(args[1]);
        byte[] b = new byte[10000];
        while (true) {
            int r = in.read(b);
            if (r == -1)
                break;
            out.write(b, 0, r);
        }
    }
}
