import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the first string
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        // Prompt the user for the second string
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Calling the areAnagrams method from AnagramChecker class
        if (AnagramChecker.areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }

        // Close the scanner
        scanner.close();
    }
}
