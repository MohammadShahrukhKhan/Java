class copi {
    String page;
    String color;
    String size;

    public void printcopy() {
        System.out.println(this.page);
        System.out.println(this.color);
        System.out.println(this.size);
    }

    copi(copi c2) {
        this.page = c2.page;
        this.page = c2.color;
        this.color = c2.size;
    }

    copi() {

    }
}

public class CopyCon {
    public static void main(String[] args) {
        copi c1 = new copi();
        c1.page = "1000";
        c1.color = "white";
        c1.size = "A4";

        // c1.printcopy();

        copi c2 = new copi(c1);
        c2.printcopy();
    }
}
