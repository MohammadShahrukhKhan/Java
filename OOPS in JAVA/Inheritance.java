class school {
    String medium;
}

class standard extends school {

}

class section extends standard {

    public void inpho() {
        System.out.println(this.medium);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        section sec = new section();
        sec.medium = "English";
        sec.inpho();
    }
}
