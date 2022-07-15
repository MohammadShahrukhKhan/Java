import java.util.Scanner;

// if else statement

public class IfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // System.in means keyboard input
        System.out.println("Enter your Age");
        double age = input.nextDouble();
        System.out.println("So you are " + age);

        if (age >= 18) {
            System.out.println("You can ENTER");
        } else if (age < 18 && age > 5) {
            System.out.println("You cannot ENTER");
        } else {
            System.out.println("WTF! Leave that phone/iPad or whatever you have little PERVERT");
        }

    }
}