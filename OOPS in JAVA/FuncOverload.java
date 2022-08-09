class fish {
    String biceps;
    int triceps;
    boolean shoulder;

    public void FishInfo(String biceps) {
        System.out.println(biceps);
    }

    public void FishInfo(int triceps) {
        System.out.println(triceps);
    }

    public void FishInfo(boolean shoulder) {
        System.out.println(shoulder);
    }

}

public class FuncOverload {
    public static void main(String[] args) {
        fish f1 = new fish();
        f1.biceps = "Flower";
        f1.triceps = 44;
        f1.shoulder = false;

        f1.FishInfo(f1.biceps);
        f1.FishInfo(f1.triceps);
        f1.FishInfo(f1.shoulder);

    }
}
