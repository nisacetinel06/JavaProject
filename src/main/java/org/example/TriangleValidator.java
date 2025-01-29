package org.example;

import java.util.Scanner;

public class TriangleValidator {
    public static void main(String[] args) {
        Scanner oku =new Scanner(System.in);
        System.out.print("1. kenar: ");
        int kenar1 = oku.nextInt();
        System.out.print("2. kenar: ");
        int kenar2 = oku.nextInt();
        System.out.print("3. kenar: ");
        int kenar3 = oku.nextInt();
        if (kenar1+kenar2 > kenar3 && kenar1+kenar3 > kenar2 && kenar2+kenar3 > kenar1){ System.out.println("Bir üçgen oluşturulabilir.");}
        else {System.out.println("Bir üçgen oluşturulamaz.");
        }
    }
}
