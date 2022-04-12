package monobank;

import java.util.Scanner;

public class Monobank {

    static String name;
    static String surname;
    static double deposit;
    static double sumPercent;
    static final double percent = 10.5;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name depositor:");
        name =scanner.nextLine();

        System.out.println("Input surname depositor:");
        surname =scanner.nextLine();

        System.out.println("Input deposit amount:");
        deposit =scanner.nextDouble();
        scanner.close();

        System.out.println("---------------");
        System.out.println ("Name: "+ name+ "\n"+ "Surname: "+ surname+ "\n"+ "Deposit: "+ deposit +(" uan"));
        sumPercent = deposit * percent /100 * 1;
        System.out.println("For one year your sum deposit: " + (deposit + sumPercent ) + " (uan)");
        sumPercent = deposit * percent /100 * 5;
        System.out.println("For five year your sum deposit: " + (deposit + sumPercent) + " (uan)");
        sumPercent = deposit * percent /100 * 10;
        System.out.println("For ten year your sum deposit: " + (deposit + sumPercent) + " (uan)");
    }
}
