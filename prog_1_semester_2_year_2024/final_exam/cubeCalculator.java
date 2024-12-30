// Name: 葉逢森, ID: 412416082, No: 4
import java.util.Scanner;

public class cubeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        // Compute the cube of the number
        double cube = Math.pow(number, 3);

        // Output the result
        System.out.println("The cube of " + number + " is: " + cube);

        scanner.close();
    }
}

