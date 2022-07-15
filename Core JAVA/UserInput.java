import java.util.Scanner; // compulsory for user input

public class UserInput {
    public static void main(String[] args) {
        Scanner kuch_bhi = new Scanner(System.in); // System.in means keyboard input
        System.out.println("Kuch bhi likh");
        // String input = kuch_bhi.nextLine();
        // String input = kuch_bhi.next(); // doesnot print anything after space
        int inputt = kuch_bhi.nextInt(); // to input integers only
        // System.out.println(input);
        System.out.println(inputt);

    }
}
