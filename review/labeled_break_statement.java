class Main {
    public static void main (String[] args) {
        int i = 0, j = 0;
        // the first loop is labeled as first
        first:
        for (i = 1; i < 5; i++) {
            second:
            for (j = 1; j < 3; j++) {
                System.out.println("i = " + i + " j = " + j);
                if (i == 2)
                    break second;  
             }
        }
    }
}
