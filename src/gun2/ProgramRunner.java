package gun2;

public class ProgramRunner {

    String name="windows";

    int year=2015;

    public ProgramRunner(String name, int year){
        this.name=name;
        this.year=year;
    }

    public ProgramRunner() {

    }

    public static void main(String[] args) {
        ProgramRunner obj= new ProgramRunner("ios",2023);

        System.out.println("name ="+ obj.name + "\n" +
                            "year =" + obj.year );

    }
}




