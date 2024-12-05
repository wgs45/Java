import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        String[] topics = {"Opinion", "Tech", "Science", "Health"};
        String[] favoriteArticles = new String[10];

        System.out.println(Arrays.toString(topics));
        System.out.println(topics[0]);
        System.out.println(topics.length);

        String[] students = {"Sade", "Alexus", "Sam", "Koma"};

        int[] mathScores = new int[4];
        mathScores[0] = 64;
        mathScores[2] = 76;
        mathScores[1] = 57;
        mathScores[3] = 98;

        for(int i = 0; i < students.length; i++) {
            System.out.println(students[i] + ": " + mathScores[i]);
        }
    }
}
