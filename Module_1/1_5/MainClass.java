public class MainClass {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        if (args.length > 0) {
            System.out.println("Arguments:");
            for (String arg : args) {
                System.out.println(arg);
            }
        }
    }
}