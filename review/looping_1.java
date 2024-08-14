class Main {
    public static void main(String[] args) {
        // int n = 5, i = 0;
        // for (i = 1; i <= n; i++) {
            // System.out.println(i);   
        // }

        int sum = 0, n = 1000, i = 0;
        for (i = 1; i <= n; ++i) {
            sum += i;
        }
        System.out.println("Sum: " + sum);

        int[] numbers = {3, 7, 5, -5};
        for (int number: numbers) {
            System.out.println(number);
        }
    }
}
