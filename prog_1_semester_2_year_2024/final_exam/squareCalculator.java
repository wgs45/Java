// Name: 葉逢森, ID: 412416082, No: 1
import java.util.Scanner;

public class SquareCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        double square = Math.pow(number, 2);
        System.out.println("The square of " + number + " is: " + square);

        scanner.close();
    }
}

