package Baseball;

import java.util.Arrays;
import java.util.Scanner;

//숫자 입력, 게임시작
class Gamego {
    public static void main(String[] args) {
        Gamego.insertnum();
    }


    static int[] gamego(int[] answer) {
        System.out.println("게임을 시작합니다!!");
        int[] correct = Gamego.insertnum();
        Calculate.calculate(correct,answer);
        return correct;
    }

    static int[] insertnum() {
        int[] correct = new int[3];
        Scanner scanner = new Scanner(System.in);


        System.out.print("서로 다른 숫자 세자리를 입력하세요 : ");
        String num = scanner.nextLine();
        System.out.println(Integer.parseInt(num));

        num = Gamego.numcheck(num);
        if (num != null) {
            correct[2] = Integer.parseInt(num) % 10;
            correct[1] = ((Integer.parseInt(num) % 100) - correct[2]) / 10;
            correct[0] = (Integer.parseInt(num) - (correct[1] * 10) + correct[2]) / 100;

            System.out.println(Arrays.toString(correct));
        }
        return correct;
    }

    static String numcheck(String num) {
        if (num.length() != 3) {
            System.out.println("숫자는 세자리만 가능합니다");
            num = null;
            Gamego.insertnum();
        }
        return num;
    }
}