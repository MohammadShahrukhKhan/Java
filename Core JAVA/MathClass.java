public class MathClass {
    public static void main(String[] args) {

        int a = 49, b = 45;

        System.out.println(Math.max(a, b));
        System.out.println(Math.min(a, b));
        System.out.println(Math.sqrt(a));
        System.out.println(Math.pow(5, 5));
        System.out.println(Math.abs(-5)); // gives the absolute value (without sign + or -)
        System.out.println(Math.abs(5));
        System.out.println(Math.E); // to get Eular's number
        System.out.println(Math.random()); // gives a random number between zero and one ( number can be zero but not
                                           // one )

        int x = 5, y = 10;

        System.out.println(x + (y - x) * Math.random()); // gives a random number between any two numbers
    }
}
