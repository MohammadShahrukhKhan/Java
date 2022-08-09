class student {
    String name;
    static String School;

    public static void MakeChange() {
        School = "BPS";
    }
}

public class StaticKeyWord {
    public static void main(String[] args) {
        // student.School = "De Nobili"; // not necesaary to define a variable
        student s1 = new student();
        s1.name = "Shahrukh";
        s1.MakeChange();
        System.out.println(s1.School);
    }
}
