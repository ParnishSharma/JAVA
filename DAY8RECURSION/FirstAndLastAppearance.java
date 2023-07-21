package DAY8RECURSION;

public class FirstAndLastAppearance {

    // Static variables to store the indices of the first and last occurrences of
    // 'a'
    public static int first = -1;
    public static int last = -1;

    // Method to find the first and last occurrences of 'element' in the string
    // 'str'
    public static void findFirstAndLastOccurrences(String str, int i, char element) {
        // Base case: if the current index 'i' reaches the length of the string 'str'
        if (i == str.length()) {
            // Print the indices of the first and last occurrences of 'a' (if found)
            System.out.println("First occurrence of '" + element + "' at index: " + first);
            System.out.println("Last occurrence of '" + element + "' at index: " + last);
            return;
        }

        // Get the character at the current index 'i' in the string 'str'
        char currChar = str.charAt(i);

        // Check if the current character is equal to 'element' (the character we want
        // to find)
        if (currChar == element) {
            // If it is, update the 'first' and 'last' variables accordingly
            if (first == -1) {
                first = i; // Set 'first' to the current index if it's the first occurrence
            } else {
                last = i; // Set 'last' to the current index if it's not the first occurrence
            }
        }

        // Make a recursive call, incrementing the index 'i', to continue searching for
        // 'element' in the rest of the string
        findFirstAndLastOccurrences(str, i + 1, element);
    }

    public static void main(String args[]) {
        String name = "hshysosioaiaooaiaaoaonjj";
        char targetChar = 'a'; // The character we want to find the occurrences of
        findFirstAndLastOccurrences(name, 0, targetChar);
    }
}
