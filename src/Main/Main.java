package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Entre com um valor inteiro: ");

        double n = input.nextInt();
        double fat = 1;

        if (n >= 0) {
            for (int i = 1; i <= n; i++) {
                fat = fat * i;

                System.out.println("O número fatorial de " + n + " é " + fat + ".");

                input.close();
            }
        }
    }
}