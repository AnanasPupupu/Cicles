package org.example;

//Вывести на экран числа от 1 до 100
//Вывести на экран числа от 100 до 1
//Вывести четные числа от 1 до 20
//Написать метод, который выводит на экран результат - "четное" или "нечетное".
//
public class Main {
    public static void main(String[] args) {

        for (int a = 1; a < 101; a++) {
            System.out.print(" " + a);
        }
        System.out.println();
        for (int b = 100; b > 0; b--) {
            System.out.print(" " + b);
        }
        System.out.println();
        for (int c = 1; c < 21; c++) {
            if (c % 2 == 0) {
                System.out.print(" " + c);
            }
        }
        System.out.println();
        Main.chetNechet(3);
        chetNechet(-6);
        chetNechet(0);


    }

    public static void chetNechet(int d) {
        if (d % 2 == 0) {
            System.out.println(d + " - четное");
        } else {
            System.out.println(d + " - нечетное");
        }
    }
}