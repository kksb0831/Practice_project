import java.util.Scanner;
public class Ex4 {

    public static void main(String atgs[]){
//        Quiz. 1~100사이 난수를 생성 사용자가 수를 맞추면 정답을 알려줌

        int input =0, answer =0;

        answer = (int)(Math.random()*100)+1;
        Scanner scanner = new Scanner(System.in);


        do {
            System.out.print("1~100 사이의 정수를 입력하세요 : ");
            input = scanner.nextInt();
            if (input < answer){
                System.out.println("더 큰 수입니다!");
            }else if (input > answer){
                System.out.println("더 작은 수 입니다!");
            }
        }while (input != answer);
        System.out.println("정답입니다!!");




    }
}
