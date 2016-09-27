package main;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("try");
            a();
        } catch (Exception e) {
            System.out.println("Cathed");
        }
        finally {
            System.out.println("final");
        }
    }

    private static void a() throws IOException {
        System.out.println("thrown");
        throw new IOException();
    }
}
