public class TryCatch {
    public static void main(String[] args) {
        // Using Try Catch the program does not stop even if an error occurs

        int[] on = { 20, 30, 10 };

        try {
            System.out.println(on[3]); // here is an error
        } catch (Exception e) {
            System.out.println("Ram is a Good Boy"); // still the program will run and print
        }
    }
}