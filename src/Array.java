
public class Array {
    public static void main(String[] args) {
        String[] jang = {"장성우", "최동건", "장민경"};
        System.out.println(jang.length);


        String[] jang2 = new String[2];
        jang2[0] = "장성우2";
        System.out.println(jang2.length);

        jang2[1] = "최동건2";
        System.out.println(jang2.length);


        String[] members = {"장성우", "최동건", "장민경"};
        for (int j = 0; j < members.length; j++) {
            String member = members[j];
            System.out.println(member + "이 상담 받았습니다.");

        }
        System.out.println("***********");
        for (String e : members) {
            System.out.println(e + "이 상담 받았습니다.");

        }


    }
}
