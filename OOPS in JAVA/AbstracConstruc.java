// Constructor Chaining

abstract class book {
    book() {
        System.out.println("Your are reading a book");
    }
}

class maths extends book {
    maths() {
        System.out.println("You are reading a maths book");
    }
}

class physics extends book {
    physics() {

    }
}

public class AbstracConstruc {
    public static void main(String[] args) {
        maths m1 = new maths();
    }
}
