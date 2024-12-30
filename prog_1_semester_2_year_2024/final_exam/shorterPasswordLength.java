// Name: 葉逢森, ID: 412416082, No: 3
import java.util.Scanner;

public class shorterPasswordLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the first password
        System.out.print("Enter the first password: ");
        String password1 = scanner.nextLine();

        // Read the second password
        System.out.print("Enter the second password: ");
        String password2 = scanner.nextLine();

        // Determine the length of the shorter password
        int shorterLength = Math.min(password1.length(), password2.length());

        // Output the result
        System.out.println("The number of characters in the smaller password is: " + shorterLength);

        scanner.close();
    }
}

