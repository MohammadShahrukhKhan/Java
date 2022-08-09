class priva {
    private boolean bulla;

    public boolean getbulla() {
        setbulla(true); // to set a private and unchangeable boolean. Also known as Data Hiding.
        return this.bulla;
    }

    private void setbulla(boolean bool) {
        this.bulla = bool;
    }
}

public class AccessMod2 {
    public static void main(String[] args) {
        priva p1 = new priva();
        System.out.println(p1.getbulla());
    }
}
