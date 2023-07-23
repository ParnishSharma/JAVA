package DAY8RECURSION;

import java.util.HashSet;

public class UniqueSubsequences {

    public static void subsequences(String str, int i, String newstr, HashSet<String> set) {
        // Base case: If the current index 'i' reaches the end of the string 'str'
        if (i == str.length()) {
            // Check if the 'newstr' is already present in the 'set'
            if (set.contains(newstr)) {
                return; // If it's already present, return and don't print it again
            } else {
                set.add(newstr); // If it's not present, add it to the 'set' and print it
                System.out.println(newstr);
                return;
            }
        }

        // Include the current character in the subsequence
        subsequences(str, i + 1, newstr + str.charAt(i), set);

        // Exclude the current character from the subsequence
        subsequences(str, i + 1, newstr, set);
    }

    public static void main(String args[]) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        subsequences(str, 0, "", set);
    }

}
