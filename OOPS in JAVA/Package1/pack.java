package Package1;

class Box {
    public String name;
    String size; // this is Default
    protected String Color;
    private String feature;

    // getters and setters to access the private classes
    public String getfeature() {
        return this.feature;
    }

    public void setfeature(String feat) {
        this.feature = feat;
    }
}

public class pack {
    public static void main(String[] args) {
        Box Box1 = new Box();
        Box1.name = "Vase";
        Box1.size = "4x5";
        Box1.Color = "yellow";
        Box1.setfeature("Glass");
        System.out.println(Box1.getfeature());
    }
}
