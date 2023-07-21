package DAY8RECURSION;

public class RemoveDuplictes {
    public static void removeDuplicates(String str, int i, StringBuilder result) {
        // Base case: If the current index 'i' reaches the end of the string 'str'
        if (i == str.length()) {
            System.out.println(result.toString());
            return;
        }

        // Check if the current character at index 'i' is the same as the next character
        if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
            // If it is a duplicate character, increment the index 'i' without adding the
            // character to the result
            removeDuplicates(str, i + 1, result);
        } else {
            // If it is not a duplicate character, add the current character to the result
            // and move to the next index
            result.append(str.charAt(i));
            removeDuplicates(str, i + 1, result);
        }
    }

    public static void main(String args[]) {
        String str = "awasdsadauaahdau";
        removeDuplicates(str, 0, new StringBuilder());
    }
}
