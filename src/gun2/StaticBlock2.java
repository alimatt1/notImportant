package gun2;

public class StaticBlock2 {
    public static void main(String[] args) {
        System.out.println("You are using Windows_NT operating system.");
    }
    static {
        String os = System.getenv("OS");
        if (!os.equals("Windows_NT")) {
            System.exit(1);
        }
    }
}

