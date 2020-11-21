package Baseball;


import java.util.Arrays;

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