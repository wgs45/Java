// Name: 葉逢森, ID: 412416082, No: 2
import java.awt.Point;
import java.util.Scanner;

public class pointCoordinates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the first point
        System.out.print("Enter the x-coordinate for the first point: ");
        int x1 = scanner.nextInt();
        System.out.print("Enter the y-coordinate for the first point: ");
        int y1 = scanner.nextInt();

        // Create the first Point object
        Point point1 = new Point(x1, y1);

        // Read the second point
        System.out.print("Enter the x-coordinate for the second point: ");
        int x2 = scanner.nextInt();
        System.out.print("Enter the y-coordinate for the second point: ");
        int y2 = scanner.nextInt();

        // Create the second Point object
        Point point2 = new Point(x2, y2);

        // Output the data for both points
        System.out.println("First point: " + point1);
        System.out.println("Second point: " + point2);

        scanner.close();
    }
}

