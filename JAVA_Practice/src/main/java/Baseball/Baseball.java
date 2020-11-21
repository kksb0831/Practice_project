package Baseball;

import java.util.Arrays;

public class Baseball {
    public static void main(String[] args) {

        Baseball.introduce();

    }
    static void introduce(){

        int[] answer2;
        int[] correct2;

        answer2 = Answer.answer();
        System.out.println(Arrays.toString(answer2)); //정답생성확인
        System.out.println("*숫자 야구게임*");
        System.out.println("규칙 : 랜덤한 숫자 3개를 맞추는 게임입니다.\n" +
                           "\t1. 플레이어는 공백으로 구분되는 숫자 3개를 제시합니다.\n" +
                           "\t2. 같은 수가 같은 자리에 있으면 스트라이크, 다른 자리에 있으면 볼, 같은 수가 전혀없으면 낫싱이라는 힌트를 얻습니다\n" +
                           "\t3. 해당 힌트들을 이용해 숫자를 맞추면 승리하게 됩니다.");

        correct2 = Gamego.gamego(answer2);
        System.out.println(Arrays.toString(correct2));    //입력한 값 확인

    }
}


