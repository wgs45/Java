// Name: 葉逢森, ID: 412416082, No: 5
import java.util.Random;
import java.util.Scanner;

public class Encryptor {
    private char[] originalAlphabet;
    private char[] encryptedAlphabet;

    // Constructor to generate original and encrypted alphabets
    public Encryptor() {
        originalAlphabet = new char[26];
        encryptedAlphabet = new char[26];
        initializeAlphabets();
    }

    // Initialize the original alphabet and create a random encrypted alphabet
    private void initializeAlphabets() {
        for (int i = 0; i < 26; i++) {
            originalAlphabet[i] = (char) ('a' + i);
        }

        // Create a shuffled encrypted alphabet
        Random random = new Random();
        boolean[] used = new boolean[26];
        for (int i = 0; i < 26; i++) {
            int randomIndex;
            do {
                randomIndex = random.nextInt(26);
            } while (used[randomIndex]);
            encryptedAlphabet[i] = (char) ('a' + randomIndex);
            used[randomIndex] = true;
        }
    }

    // Encrypt a sentence
    public String encrypt(String sentence) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                boolean isUpperCase = Character.isUpperCase(c);
                char lowerChar = Character.toLowerCase(c);
                int index = lowerChar - 'a';
                char encryptedChar = encryptedAlphabet[index];
                encrypted.append(isUpperCase ? Character.toUpperCase(encryptedChar) : encryptedChar);
            } else {
                encrypted.append(c); // Keep non-alphabetic characters unchanged
            }
        }
        return encrypted.toString();
    }

    // Decrypt a sentence
    public String decrypt(String sentence) {
        StringBuilder decrypted = new StringBuilder();
        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                boolean isUpperCase = Character.isUpperCase(c);
                char lowerChar = Character.toLowerCase(c);
                int index = findIndex(encryptedAlphabet, lowerChar);
                char decryptedChar = originalAlphabet[index];
                decrypted.append(isUpperCase ? Character.toUpperCase(decryptedChar) : decryptedChar);
            } else {
                decrypted.append(c); // Keep non-alphabetic characters unchanged
            }
        }
        return decrypted.toString();
    }

    // Find the index of a character in an array
    private int findIndex(char[] array, char target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        throw new IllegalArgumentException("Character not found in array");
    }

    // Display the original and encrypted alphabets
    public void displayAlphabets() {
        System.out.println("Original Alphabet:  " + new String(originalAlphabet));
        System.out.println("Encrypted Alphabet: " + new String(encryptedAlphabet));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize the Encryptor
        Encryptor encryptor = new Encryptor();
        encryptor.displayAlphabets();

        // Prompt the user for input
        System.out.print("Enter a sentence to encrypt: ");
        String sentence = scanner.nextLine();

        // Encrypt the sentence
        String encryptedSentence = encryptor.encrypt(sentence);
        System.out.println("Encrypted Sentence: " + encryptedSentence);

        // Decrypt the sentence
        String decryptedSentence = encryptor.decrypt(encryptedSentence);
        System.out.println("Decrypted Sentence: " + decryptedSentence);

        scanner.close();
    }
}

