package DAY8RECURSION;

public class PermutationOfString {
    // Function to generate and print all permutations of a given string
    public static void printpermutation(String str, String permutation) {
        // Base case: If the length of the input string is 0, we have generated a
        // complete permutation
        if (str.length() == 0) {
            // Print the permutation
            System.out.println(permutation);
            return;
        }

        // Iterate through each character of the input string
        for (int i = 0; i < str.length(); i++) {
            // Pick the current character from the string
            char currchar = str.charAt(i);
            // Create a new string (newstr) without the picked character by removing it from
            // the original string
            String newstr = str.substring(0, i) + str.substring(i + 1);
            // Recursively call the printpermutation function with the new string and the
            // updated permutation
            printpermutation(newstr, permutation + currchar);
        }
    }

    public static void main(String args[]) {
        String str = "abc";
        // Call the printpermutation function with the input string and an empty
        // permutation string
        printpermutation(str, "");
    }
}
