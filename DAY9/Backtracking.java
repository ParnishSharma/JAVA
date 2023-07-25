package DAY9;

//Definition:pehle istemal krein fir vishwass krein "find all possible solutions and use the one which u want"

//let we have 3 children and we have to arrange then them who will be at 1 or 2 or 3 this is basically permutation problem
//now to arrange them in the line and let us assume we have three spaces . foe the first position we can make A to be there and for position 
//secont we let B to stand and last given to C {A B C} now other possibility {A C B} another is {B A C} ..... so on
// for n childer we have n! ways os for 3 we have 6 ways 
//if we have to find all the posssible arrangements we need to check the backtracking

public class Backtracking {
    public static void backtracking(String str, String perm, int index) {
        if (str.length() == 0) {
            System.out.println(perm);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char currchar = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i + 1);

            backtracking(newstr, perm + currchar, index + 1);
        }

    }

    public static void main(String[] args) {
        String str = "ABC";
        backtracking(str, "", 0);

    }

}
