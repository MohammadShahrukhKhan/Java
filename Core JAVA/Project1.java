import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        double input1 = scan.nextDouble();
        System.out.print("Enter the Second Number: ");
        double input2 = scan.nextDouble();
        System.out.print("Enter the Operator: ");
        String input3 = scan.next();
        System.out.print(input1);
        System.out.print(input3);
        System.out.println(input2);

        switch (input3) {
            case "+":
                System.out.println(input1 + input2);
                break;
            case "-":
                System.out.println(input1 - input2);
                break;
            case "*":
                System.out.println(input1 * input2);
                break;
            case "/":
                System.out.println(input1 / input2);
                break;
            case "%":
                System.out.println(input1 % input2);
            default:
                System.out.println("Invalid input");
        }
    }
}