package DAY8RECURSION;

public class Keypadmap {
    // Keypad mapping for digits 0 to 9 (index 0 is not used)
    public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void mainPrint(String str, int i, String combination) {
        // Base case: If the current index 'i' reaches the end of the string 'str'
        if (i == str.length()) {
            // Print the combination as it represents one possible mapping
            System.out.println(combination);
            return;
        }

        // Get the current character at index 'i' in the string 'str'
        char currChar = str.charAt(i);

        // Find the mapping for the current digit from the keypad
        String mapping = keypad[currChar - '0'];

        // Iterate through each character in the mapping and include it in the
        // combination
        for (int j = 0; j < mapping.length(); j++) {
            // Make a recursive call to process the next digit and append the mapped
            // character to the combination
            mainPrint(str, i + 1, combination + mapping.charAt(j));
        }
    }

    public static void main(String args[]) {
        String str = "23";
        mainPrint(str, 0, ""); // Call the mainPrint function with initial index and an empty combination
    }
}
