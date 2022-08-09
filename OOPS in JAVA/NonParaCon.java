class stu {
    String name;
    int age;

    public void write() {
        System.out.println("Writing Something");
    }

    public void printinfo() {
        System.out.println(this.name);
        System.out.println(this.age);

    }

    stu() { // this is a non parameterized constructor
        System.out.println("lassan");
    } // objects are called after the constructor
}

public class NonParaCon {
    public static void main(String[] args) {
        stu s = new stu();
        s.name = "Reddy";
        s.age = 20;

        // pen1.write();
        s.printinfo();

        stu s2 = new stu();
        s2.name = "lallan";
        s2.age = 5;

        s2.printinfo();

    }
}
