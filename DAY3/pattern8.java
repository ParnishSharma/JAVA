public class pattern8 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            if (i == 1 || i == 4) {
                for (int j = 1; j <= 5; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*   *");
            }
            System.out.println();
        }
    }
}
