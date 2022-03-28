package lesson3;

import java.util.Scanner;

public class Calculator {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        do {
            System.out.println(" Enter 1 to continue or 2 to exit calculator");
            int tittle = scanner.nextInt();
            if (tittle == 1) {
                double numberOne = getInput();
                double numberTwo = getInput();
                char operation = getOperation();
                double result = calc(numberOne, numberTwo, operation);
                System.out.println(result);

            } else if (tittle == 2) {
                "exit".equalsIgnoreCase(scanner.nextLine());
                scanner.close();
                System.exit(0);
            }
        }
        while (true);
    }

    public static double getInput() {

        double number;
        System.out.println(" Input number ");
        if (scanner.hasNextDouble()) {
            number = scanner.nextDouble();
        } else {
            System.out.println("Error!!! Input number please");
            scanner.nextDouble();
            number = scanner.nextDouble();
        }
        return number;
    }

    public static char getOperation() {
        System.out.println("Input operation (+, -, * , / )");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Error!!! Input operation please (+, -, * , / )");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static double calc(double numberOne, double numberTwo, char operation) {
        double result;
        switch (operation) {
            case '+':
                result = numberOne + numberTwo;
                break;
            case '-':
                result = numberOne - numberTwo;
                break;
            case '*':
                result = numberOne * numberTwo;
                break;
            case '/':
                result = numberOne / numberTwo;
                break;
            default:
                System.out.println("Error.Input operation please (+, -, * , / ) please ");
                result = calc(numberOne, numberTwo, getOperation());
        }
        return result;
    }
}
