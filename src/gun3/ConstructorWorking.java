package gun3;

public class ConstructorWorking {


    String marka="girilmedi";
    String model="girilmedi";
    int yil;

    @Override
    public String toString() {
        return "ConstructorWorking{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yil='" + yil + '\'' +
                '}';
    }

    public ConstructorWorking(){

    }

    public ConstructorWorking(String marka ){
        this();
        this.marka=marka;


    }

    public ConstructorWorking (String marka,String model,int yil){

        this.marka=marka;
        this.model=model;
        this.yil=yil;
    }
}
