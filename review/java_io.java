import java.util.Scanner;

class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // getting int input
        System.out.print("Enter an integer: ");
        int myInt = input.nextInt();
        System.out.println("You entered " + myInt);

        // getting float input
        System.out.print("Enter float: ");
        float myFloat = input.nextFloat();
        System.out.println("You entered: " + myFloat);

        // getting double input
        System.out.print("Enter double: ");
        double myDouble = input.nextDouble();
        System.out.println("You entered: " + myDouble);

        // getting string input
        System.out.print("Enter string: ");
        String myString = input.next();
        System.out.println("You entered: " + myString);

        // close the scanner object
        input.close();
    }
}
