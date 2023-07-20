package DAY8RECURSION;

public class recursion3 {
    public static int startnumbers(int n) {
        if (n == 6) {
            return 0;
        } else {
            System.out.print(n);
            startnumbers(n + 1);
            return 0;
        }

    }

    public static void main(String args[]) {
        int n = 1;
        startnumbers(n);

    }

}

// stackoverflow condition raises usually in recursion first a main function is
// created in the memory
// now start numbers layer is created in stack and then further calls are done
// by strat numbers and so on so forth till 6