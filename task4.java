import java.util.ArrayList;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть текст:");
        String text = scanner.nextLine();

        String[] words = text.split("[\\s,.;:!?()\"'\\[\\]{}]+");

        ArrayList<String> doubledLetterWords = new ArrayList<>();
        ArrayList<String> remainingWords = new ArrayList<>();

        for (String word : words) {
            if (hasDoubledLetters(word)) {
                doubledLetterWords.add(word);
            } else {
                remainingWords.add(word);
            }
        }

        String removedWords = String.join(" ", doubledLetterWords);
        String remainingText = String.join(" ", remainingWords);

        System.out.println("Слова з подвоєнням літер: " + removedWords);
        System.out.println("Текст після вилучення слів: " + remainingText);

        scanner.close();
    }

    public static boolean hasDoubledLetters(String word) {
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) == word.charAt(i + 1)) {
                return true;
            }
        }
        return false;
    }
}
