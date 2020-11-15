package Baseball;

import java.util.Scanner;

//숫자 입력, 게임시작
class Gamego {
    static int[] gamego(int[] answer) {
        int[] correct = new int[3];
        Scanner scanner = new Scanner(System.in);

        System.out.println("게임을 시작합니다!!");
        System.out.print("숫자를 입력해주세요 : ");

        for (int i = 0; i < correct.length; i++){
            correct[i] = scanner.nextInt();
        }

        Calculate.calculate(correct,answer);
        return correct;
    }
}