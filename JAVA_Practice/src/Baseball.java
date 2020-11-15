import java.util.Arrays;
import java.util.Scanner;

public class Baseball {
    public static void main(String[] args) {
        int[] answer2;
        int[] correct2;

        answer2 = Answer.answer();
        System.out.println(Arrays.toString(answer2)); //정답생성확인

        System.out.println("*숫자 야구게임*");
        System.out.println("""
                규칙 : 랜덤한 숫자 3개를 맞추는 게임입니다.
                \t1. 플레이어는 공백으로 구분되는 숫자 3개를 제시합니다.
                \t2. 같은 수가 같은 자리에 있으면 스트라이크, 다른 자리에 있으면 볼, 같은 수가 전혀없으면 낫싱이라는 힌트를 얻습니다
                \t3. 해당 힌트들을 이용해 숫자를 맞추면 승리하게 됩니다.""");

        correct2 = Gamego.gamego(answer2);
        System.out.println(Arrays.toString(correct2));    //입력한 값 확인
    }
}
//정답 생성
class Answer {
    static int[] answer() {
        int[] random = {1,2,3,4,5,6,7,8,9};
        int[] answer = new int[3];

        for (int i = 0; i < random.length; i++) {
            int n = (int)(Math.random()*random.length);
            int tmp = random[i];
            random[i] = random[n];
            random[n] = tmp;
        }
        System.arraycopy(random, 0, answer, 0, answer.length);
        return answer;
    }
}
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
//스트라이크,볼 계산
class Calculate {
    static void calculate(int[] correct, int[] answer) {
        int[] end = new int[2];
        int strike = 0;
        int ball = 0;

        for (int i = 0; i < correct.length; i++) {
            strike = Calculate.strike(i,strike,correct,answer);
            ball = Calculate.ball(i,ball,correct,answer);

        }
        ball -= strike;
        end[0] = strike;
        end[1] = ball;
        System.out.println(Arrays.toString(end));  //스트라이크, 볼 계산 확인
        Print.print(end,answer);
    }

    static int strike(int i,int strike,int[] correct, int[] answer) {
        if (correct[i] == answer[i]) {
            strike += 1;
        }
        return strike;
    }

    static int ball(int i, int ball,int[] correct, int[] answer) {
        for (int j = 0; j < correct.length; j++) {
            ball = Calculate.ballcal(ball,i,j,correct,answer);
        }
        return ball;
    }

    static int ballcal(int ball, int i, int j,int[] correct, int[] answer) {
        if (correct[i] == answer[j]) {
            ball += 1;
        }
        return ball;
    }
}
//결과 출력
class Print {
    static void print(int[] end,int[] answer) {
        if (end[0] == 3){
            Goorstop.goorstop();
        }
        Print.nothing(end,answer);
        Print.strikeandball(end,answer);
        Print.strike(end,answer);
        Print.ball(end,answer);
        Goorstop.goorstop();
    }
    static void nothing(int[]end, int[]answer) {
        if (end[0] == 0 && end[1] == 0) {
            System.out.println("낫싱");
            Gamego.gamego(answer);
        }
    }
    static void strikeandball(int[]end, int[] answer) {
        if (end[0] != 0 && end[1] != 0) {
            System.out.println(end[0] + "스트라이크 " + end[1] + " 볼");
            Gamego.gamego(answer);
        }
    }
    static void strike(int[] end, int[] answer) {
        if (end[0] != 0) {
            System.out.println(end[0] + "스트라이크");
            Gamego.gamego(answer);
        }
    }
    static void ball(int[] end, int[] answer) {
        if (end[1] != 0) {
            System.out.println(end[1] + "볼");
            Gamego.gamego(answer);
        }
    }
}
//시작 종료 선택
class Goorstop {
    static void goorstop() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("정답을 맞추셨습니다. 승리!!");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요");
        int choice = scanner.nextInt();
        Goorstop.go(choice);
        Goorstop.stop(choice);
        Goorstop.error(choice);
    }

    static void go(int choice) {
        String[] args = {"restart"};
        if (choice == 1) {
            Baseball.main(args);
        }
    }

    static void stop(int choice) {
        if (choice == 2) {
            System.exit(0);
        }
    }

    static void error(int choice) {
        if (choice != 1 && choice != 2) {
            System.out.println("1이나 2를 입력해주세요!");
            Goorstop.goorstop();
        }
    }
}
