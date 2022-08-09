//Cannot use Constructor

interface phone {
    int battery = 1000; // remains public static and final by defailt
    // void vibrate(); // remains public and abstract by default

    public void ring();
}

interface tablet {

}

class nokia implements phone, tablet {
    public void ring() {
        System.out.println("Rings on a call");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        nokia n1 = new nokia();
        n1.ring();
    }
}
