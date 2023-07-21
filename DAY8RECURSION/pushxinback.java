package DAY8RECURSION;

public class pushxinback {

    // Recursive method to push all occurrences of 'x' to the end of the string
    public static void shiftX(String str, int i, int count) {
        // Base case: If the current index 'i' reaches the end of the string 'str'
        if (i == str.length()) {
            // Print 'x' count times to push all occurrences of 'x' to the end
            for (int k = 0; k < count; k++) {
                System.out.print("x");
            }
            return;
        }

        // Check if the current character at index 'i' is 'x'
        if (str.charAt(i) == 'x') {
            // If it is 'x', increment the count and make a recursive call to process the
            // rest of the string
            shiftX(str, i + 1, count + 1);
        } else {
            // If it is not 'x', print the current character and make a recursive call
            // without incrementing the count
            System.out.print(str.charAt(i));
            shiftX(str, i + 1, count);
        }
    }

    public static void main(String args[]) {
        String str = "abxcdxudd";
        shiftX(str, 0, 0); // Call the shiftX function with initial index and count as 0
    }
}
