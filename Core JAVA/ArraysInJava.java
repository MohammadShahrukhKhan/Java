public class ArraysInJava {
    public static void main(String[] args) {

        // An Array is a collection of Values
        // we can store more than one value in a single Vatriable Using Array

        // #1
        int[] marks = { 1, 4, 6, 8, 7, 2 };
        System.out.println(marks);
        System.out.println(marks[2]); // marks at nth index (Index is written in the square [] Bracket)

        // #2
        int[] numb = { 45, 78, 12, 32, 65, 98, 74, 14, 28, 56, 93 };
        numb[0] = 25; // to update the value of nth index
        System.out.println(numb[0]);

        // #3
        int[] bun = { 15, 24, 35, 26, 57, 48, 68, 59 };
        // Classical way to iterate an Array using for loop
        for (int a = 0; a < bun.length; a++) {
            System.out.println(bun[a]);
        }

        // #4
        // Iterating an Array using ForEach Loop ( Alternate of #3)
        int[] gun = { 12, 54, 89, 73 };
        for (int value : gun) { // Prints all the values in the Array
            System.out.println(value);
        }

        // #5
        // 2D Array
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 } };
        System.out.println(matrix[0][2]); // nth index of nth matrix

        // #6
        String[] fruits = { "Apple", "Banana", "Mango", "Orange", "Guava" };
        System.out.println(fruits[2]);
        for (String bhaloo : fruits) { // prints the name of all fruits
            System.out.println(bhaloo);
        }
    }
}
