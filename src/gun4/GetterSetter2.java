package gun4;

public class GetterSetter2 {

    private String laf="kabzimal";

    private boolean atPilat=true;

    public String getLaf() {
        return laf;
    }

    public void setLaf(String laf) {
        this.laf = laf;
    }

    public boolean isAtPilat() {
        return atPilat;
    }

    public boolean setAtPilat() {
        this.atPilat = atPilat;
        return false;
    }
}
