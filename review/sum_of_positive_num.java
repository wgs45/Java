import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int sum = 0;

        // object scanner class
        Scanner input = new Scanner (System.in);

        // take user input 
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        // while loop continues until num is positive
        while (number >= 0) {
            sum += number;

            System.out.println("Enter a number: ");
            number = input.nextInt();
        }
        System.out.println("Sum = " + sum);
        input.close();
    }
}
