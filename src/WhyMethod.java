public class WhyMethod {
    public static void main(String[] args) {

        System.out.println(twoTimes("a","-"));


    }

    public static String twoTimes(String text, String delimiter) {
        String out = "";
        out = out + delimiter + "\n";
        out = out + text + "\n";
        out = out + text + "\n";
        return out;

    }

    }

