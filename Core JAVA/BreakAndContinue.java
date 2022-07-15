public class BreakAndContinue {
    public static void main(String[] args) {

        for (int l = 3; l <= 8; l++) {
            System.out.println(l);
            break; // break causes the loop to print the initial value and stop further execution.
        }

        for (int m = 0; m <= 10; m++) {

            if (m >= 5) {
                break; // will break the loop if the value reaches >= 5.
            } else {
                System.out.println(m);
            }
        }

        for (int n = 0; n <= 11; n++) {

            if (n == 5) {
                continue; // will skip the given iteration value in the if statement i.e. n==5.
            } else {
                System.out.println(n);
            }
        }
    }
}