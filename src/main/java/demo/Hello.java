package demo;

import java.nio.charset.StandardCharsets;

public class Hello {

    public static void main(String[] args) {
        byte[] bytes = {0, 1, 2, 126, 127};

        String str = new String(bytes, StandardCharsets.ISO_8859_1);
        System.out.println(str);
        byte[] bytes2 = str.getBytes(StandardCharsets.ISO_8859_1);
        for (byte b : bytes2) {
            System.out.println(b);
        }
    }

}
