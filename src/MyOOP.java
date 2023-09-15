public class MyOOP {
    public static String delimiter ="";

    public static void main(String[] args) {
        delimiter="----";
        printA();
        printA();
        printA();
        printA();

        delimiter="****";
        printA();
        printA();
        printA();
        printA();


    }

    private static void printA() {
        System.out.println(delimiter);
        System.out.println("A");
        System.out.println("A");
    }
    private static void printB(String delimier) {
        System.out.println(delimier);
        System.out.println("A");
        System.out.println("A");
    }
}
