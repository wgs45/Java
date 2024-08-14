class Main {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 5, -5, 0, 12};
        int sum = 0, i = 0;

        for (int number: numbers) {
            sum += number;
        }

        System.out.println("Sum: " + sum);

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        // iterate through array using looping
        for (i = 0; i < vowels.length; ++i) {
            System.out.println(vowels[i]);
        }
    }
}
