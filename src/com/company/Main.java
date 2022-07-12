package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Suma  numerelor cumprinse intr-un interval de 2 numere

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti primul numar :");   // test comment
        int a = scanner.nextInt();
        System.out.println("Introduceti al2lea numar :");
        int b = scanner.nextInt();

        if (a < b) {
            int sum = 0;

            for (int i = a; i <= b; i++) {
                sum += i;

            }

            System.out.println("Suma numerelor cuprinse intre " + a + " si " + b + " este = " + sum);
        } else {
            System.out.println("ERROR!!!");
        }

    }
}


