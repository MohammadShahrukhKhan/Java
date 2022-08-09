class pen {
    String color;
    String price;

    public void write() {
        System.out.println("Writing Something");
    }

    public void printcolor() {
        System.out.println(this.color);
    }
}

public class ClassesObject {
    public static void main(String[] args) {
        pen pen1 = new pen();
        pen1.color = "Red";
        pen1.price = "Twenty";

        // pen1.write();
        pen1.printcolor();

        pen pen2 = new pen();
        pen2.color = "blue";

        pen2.printcolor();

    }
}
