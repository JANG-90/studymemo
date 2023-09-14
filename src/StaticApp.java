class Foo {
    public static String classVar = "I class var";

    public String instanceVar = "I instanse var"; // changed by f1

    public static void classMethod() {
        System.out.println(classVar); //OK
        //System.out.println(instanceVar);
    }

    public void instanceMethod() {
        System.out.println(classVar);  //OK
        System.out.println(instanceVar);  //OK
    }

}

public class StaticApp {

    public static void main(String[] args) {
        System.out.println(Foo.classVar);
        //System.out.println(Foo.instanceVar);
        //Foo.instanceMethod();


        Foo f1 = new Foo();
        Foo f2 = new Foo();

        System.out.println("----------------1");

        System.out.println(f1.classVar);
        System.out.println(f1.instanceVar);

        System.out.println("----------------2");
        f1.classVar = "changed by f1";
        System.out.println(Foo.classVar);
        System.out.println(f2.classVar);

        System.out.println("----------------3");
        f1.instanceVar = "changed by f1";
        System.out.println(f1.instanceVar);
        System.out.println(f2.instanceVar);

        System.out.println("----------------4");

        f2.instanceVar = "진짜바뀌나?";
        System.out.println(f2.instanceVar);
        System.out.println(f1.instanceVar);

    }
}

