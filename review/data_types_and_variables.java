class Main {
    public static void main(String[] args) {
        // floating point
        double myDouble = 3.4;
        float myFloat = 3.4F;
        double myDoubleScientific = 3.445e2;

        System.out.println(myDouble);
        System.out.println(myFloat);
        System.out.println(myDoubleScientific);

        // character manipulation
        char letter_1 = '\u0051';
        char letter_2 = '9';
        char letter_3 = 65;

        System.out.println(letter_1);
        System.out.println(letter_2);
        System.out.println(letter_3);

        // bitwise 
        String str_1 = "Alpha";
        boolean result_1;
        result_1 = str_1 instanceof String;
        System.out.println("Is this a string? " + result_1);
    }
}
