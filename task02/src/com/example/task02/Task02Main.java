package com.example.task02;

import java.io.IOException;
import java.io.InputStream;

public class Task02Main {
    public static void main(String[] args) throws IOException {

        InputStream inputStream = System.in;
        int prev = inputStream.read();
        int curr = inputStream.read();

        while (prev != -1){
            if(prev != 13 || curr != 10){
                System.out.write(prev);
            }
            prev = curr;
            curr = inputStream.read();
        }
        System.out.flush();
    }
}
