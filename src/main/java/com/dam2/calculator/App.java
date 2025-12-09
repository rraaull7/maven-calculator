package com.dam2.calculator;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Calculator CLI ===");
        System.out.println("Escribe 'help' o 'exit'.");

        while (true) {
            System.out.print("\noperacion> ");
            String op = sc.nextLine().trim();
            if (op.equalsIgnoreCase("exit")) break;

            if (op.equalsIgnoreCase("help")) {
                System.out.println(OperationRouter.help());
                continue;
            }

            System.out.print("numeros> ");
            String input = sc.nextLine();

            String out = OperationRouter.run(op, input);
            System.out.println("salida> " + out);
        }
        System.out.println("Bye!");
    }
}