public class ins {
    public static void main(String[] args) {
        Print2 p1 = new Print2();
        p1.delimiter ="-----";
        p1.A();
        p1.A();
        p1.B();
        p1.B();
        System.out.println("------------");

        Print2 p2 = new Print2();
        p2.delimiter ="****";
        p2.A();
        p2.A();
        p2.B();
        p2.B();

        System.out.println("------------");

        p1.A();
        p2.A();
        p1.A();
        p2.A();
    }
}
