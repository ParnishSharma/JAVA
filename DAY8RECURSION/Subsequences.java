package DAY8RECURSION;

public class Subsequences {

    // Method to find all subsequences of the given string
    public static void subsequences(String str, int i, String newstr) {
        // Base case: If the current index 'i' reaches the end of the string 'str'
        if (i == str.length()) {
            // Print the subsequence stored in 'newstr' as it represents one possible
            // subsequence
            System.out.println(newstr);
            return;
        }

        // Get the current character at index 'i' in the string 'str'
        char currChar = str.charAt(i);

        // Include the current character in the subsequence (want to be in)
        subsequences(str, i + 1, newstr + currChar);

        // Exclude the current character from the subsequence (don't want to be in)
        subsequences(str, i + 1, newstr);
    }

    public static void main(String args[]) {
        String str = "aaa";
        subsequences(str, 0, ""); // Call the subsequences function with initial index and an empty string
    }
}
