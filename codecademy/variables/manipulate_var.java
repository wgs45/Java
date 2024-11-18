public class manipulate_var {
    public static void main(String[] args) {
        int mystery1 = 8 + 6;
        int mystery2 = 8 - 6;
        System.out.println(mystery2);

        int zebrasInZoo = 8;
        int giraffesInZoo = 4;
        int animalsInZoo = zebrasInZoo + giraffesInZoo;
        System.out.println(animalsInZoo);
        int numZebrasAfterTrade = zebrasInZoo - 2;
        System.out.println(numZebrasAfterTrade);

        double subtotal = 30;
        double tax = 0.0875;
        double total = subtotal + subtotal * tax;
        System.out.println(total);
        double perPerson = total / 4;
        System.out.println(perPerson);

        int students = 26;
        int leftOut = 26 % 3;
        System.out.println(leftOut);

        int numCookies = 17;
        numCookies -= 3;
        numCookies /= 2;
        System.out.println(numCookies);

        double creditsEarned = 176.5;
        double creditsOfSeminar = 8;
        double creditsToGraduate = 180;

        System.out.println(creditsEarned > creditsToGraduate);
        double creditsAfterSeminar = creditsEarned + creditsOfSeminar;
        System.out.println(creditsToGraduate < creditsAfterSeminar);

        int songsA = 9;
        int songsB = 9;
        int albumLengthA = 41;
        int albumLengthB = 53;

        boolean sameNumberOfSongs = songsA == songsB;
        boolean differentLength = albumLengthA != albumLengthB;

        double recommendedWaterIntake = 8;
        double daysInChallenge = 30;
        double yourWaterIntake = 235.5;
        double totalRecommendedAmount = recommendedWaterIntake * daysInChallenge;

        boolean isChallengeComplete = yourWaterIntake >= totalRecommendedAmount;
        System.out.println(isChallengeComplete);

        String line1 = "Nah nah nah nah nah nah nah nah nah yeah";
        String line2 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";
        String line3 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";

        System.out.println(line1 == line2);
        System.out.println(line2 == line3);

        int animals = 12;
        String species = "zebra";
        String zooDescription = "Our zoo has " + animals + " " + species + "s!";

        System.out.println(zooDescription);

        // Constant variable in Java (Similar to const in other programming language)
        final double pi = 3.14;
        System.out.println(pi);

        // Review
        double balance = 1000.75;
        double amountToWithdraw = 250;

        double updatedBalance = balance - amountToWithdraw;

        double amountForEachFriend = updatedBalance / 3;

        boolean canPurchaseTicket = amountForEachFriend >= 250;
        System.out.println(canPurchaseTicket);

        System.out.println("I gave each friend " + amountForEachFriend + "...");
    }
}
