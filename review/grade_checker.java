import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter score: ");
        double score = input.nextDouble();

        String result = (score > 40) ? "pass" : "fail";
        System.out.println("You " + result + " the exam.");
        input.close();
    }
}
