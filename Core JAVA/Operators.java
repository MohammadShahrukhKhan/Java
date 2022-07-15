/* 
Operators in JAVA:
RULE: operand operator operand for example, 7 + 3
Here 7 is operand , + is operator and 3 is operand. 
*/

/* 
Types of Operators:
1. Arithematic Operators
2. Assignment Operators
3. Logical Operators
4. Comparison Operators
*/

public class Operators {
    public static void main(String[] args) {

        int n1 = 78, n2 = 2;
        n1 += 2; // i.e. n1 = n1 + 2; and same for "-="
        System.out.println(n1 + n2);
        System.out.println(n1 - n2);
        System.out.println(n1 * n2);
        System.out.println(n1 / n2);
        System.out.println(n1 % n2); // gives remainder
        System.out.println(n1++); // first prints the original value of n1 and then increments by 1
        System.out.println(n1--); // prints the incremented value of n1 and then decrements by 1
        System.out.println(++n1); // increments the previous value by 1 and then prints it
        System.out.println(--n1); // Decrements the previous value and prints further
    }
}
