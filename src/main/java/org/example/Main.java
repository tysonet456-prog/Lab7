package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file path: ");
        String filePath = scanner.next();
        ListReader listReader = new ListReader(filePath);
    }
}