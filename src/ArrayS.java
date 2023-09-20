import java.util.Scanner;

public class ArrayS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] score = new int[5];

        for (int i = 0; i < score.length; i++) {
            System.out.println(i + "번 인텍스에 넣을 숫자를 입력해주세요");
            int inputNum = sc.nextInt();
            score[i] = inputNum;
            System.out.println("입력된 값은" + inputNum + "입니다");

        }

        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum = sum + score[i];
        }

        System.out.println("배열에 입력된 총합은 " + sum + "입니다.");
    }

}
