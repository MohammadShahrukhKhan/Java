import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Roll Number");
        int input = scan.nextInt();

        switch (input) {
            case 10:
                System.out.println("He is Aaloo");
                break;
            case 12:
                System.out.println("He is Boree");
                break;
            default:
                System.out.println("He is Godaam");
        }
    }
}
