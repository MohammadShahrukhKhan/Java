public class Methods {

    static int mul(int a, int b) { // static means it belongs to "Methods" class only...
        return a * b;
    }

    public static void main(String[] args) {
        System.out.println(mul(4, 6));
    }
}
