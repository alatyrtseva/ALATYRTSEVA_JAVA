package ru.alatyrtseva;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        MyScanner scanner = new MyScanner("input.txt");
        int number = scanner.nextInt();
        System.out.println(number);
        number = scanner.nextInt();
        System.out.println(number);
        number = scanner.nextInt();
        System.out.println(number);
        number = scanner.nextInt();
        System.out.println(number);
        number = scanner.nextInt();
        System.out.println(number);
        number = scanner.nextInt();
        System.out.println(number);
        number = scanner.nextInt();
        System.out.println(number);
        number = scanner.nextInt();
        System.out.println(number);
        number = scanner.nextInt();
        System.out.println(number);
    }
}
