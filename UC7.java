public class UC7 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        System.out.println("Hello, " + String.join(", ", args) + "!");
    }
}