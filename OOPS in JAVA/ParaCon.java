class goo {
    String branch;
    int sub;

    public void printo() {
        System.out.println(this.branch + " " + this.sub);
    }

    goo(String branch, int sub) { // this is a parameterized constructor
        this.branch = branch;
        this.sub = sub;
    }
}

public class ParaCon {
    public static void main(String[] args) {
        goo g1 = new goo("Mechanical", 10);
        g1.printo();
    }
}
