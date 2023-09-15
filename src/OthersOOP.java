public class OthersOOP {
    public static void main(String[] args) {
        int a = 3;
        float b = 4.0F;
        double c = 2.0;

        double d = a + b + c;

        System.out.println(d);

        if (true || true) {
            System.out.println(1);
        }
        if (true || false) {
            System.out.println(2);
        }
        if (false || true) {
            System.out.println(3);
        }
        if (false || false) {
            System.out.println(4);
        }

        if (!true) {
            System.out.println(101);
        }
        if (!false) {
            System.out.println(102);
        }


        int jang = 0;

        while (jang <= 20) {
            System.out.println(jang);
            jang++;
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            if (i == 5)
                break;


        }
        System.out.println("------------");
        for (int j = 0; j <= 10; j++) {

            if (j == 5)
                continue;
            System.out.println(j);


        }
        System.out.println("-------");

        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + "*" + j + "=" +i*j);
            }

        }

    }

}
