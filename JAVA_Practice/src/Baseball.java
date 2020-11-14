import java.util.Arrays;
import java.util.Scanner;

public class Baseball {
    public static void main(String args[]){
        int[] random = {1,2,3,4,5,6,7,8,9};
        int[] answer = new int[3];
        int[] isitcorrect = new int[3];
        int strike = 0;
        int ball = 0;

        System.out.println("*숫자 야구게임*");
        System.out.println("규칙 : 랜덤한 숫자 3개를 맞추는 게임입니다.\n\t" +
                "1. 플레이어는 공백으로 구분되는 숫자 3개를 제시\n\t" +
                "2. 같은 수가 같은 자리에 있으면 스트라이크, 다른 자리에 있으면 볼, 같은 수가 전혀없으면 낫싱이라는 힌트를 얻습니다\n\t" +
                "3. 해당 힌트들을 이용해 맞추면 승리하게 됩니다.");
        System.out.println("게임을 시작합니다!!");


        for (int i=0 ; i<random.length ; i++){
            int n = (int)(Math.random()*random.length);
            int tmp = random[i];
            random[i] = random[n];
            random[n] = tmp;
        }
        for (int i = 0 ; i<answer.length ; i++){
            answer[i] = random[i];
        }
        System.out.println(Arrays.toString(answer));
        System.out.print("숫자를 세개 입력하세요 : ");



        Scanner sc = new Scanner(System.in);


        do {
            for (int i = 0; i < isitcorrect.length; i++) {
                isitcorrect[i] = sc.nextInt();
                strike = 0;
                ball = 0;
            }

            for (int i = 0; i < isitcorrect.length; i++) {
                if (isitcorrect[i] == answer[i]) {
                    strike += 1;
                }else{
                    for (int j = 0; j < isitcorrect.length; j++) {
                        if (isitcorrect[i] == answer[j]) {
                            ball += 1;
                        }
                    }
                }
            }
            if (strike == 0 && ball == 0) {
                System.out.println("낫싱");
            } else if (strike != 0 && ball != 0){
                System.out.println(strike + "스트라이크 " + ball + " 볼");
            } else if (strike != 0){
                System.out.println(strike + "스트라이크");
            } else if (ball!=0){
                System.out.println(ball + "볼");
            }

        }while (strike < 3);
        System.out.println("정답을 맞추셨습니다. 승리!!");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요 *미구현*");




    }
}

