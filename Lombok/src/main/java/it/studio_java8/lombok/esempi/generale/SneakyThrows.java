package it.studio_java8.lombok.esempi.generale;

import java.io.UnsupportedEncodingException;

// https://projectlombok.org/features/SneakyThrows

public class SneakyThrows {
    @lombok.SneakyThrows(UnsupportedEncodingException.class)
    public String utf8ToString(byte[] bytes) {
        return new String(bytes, "UTF-8");
    }

    @lombok.SneakyThrows
    public void run() {
        throw new Throwable();
    }
}
