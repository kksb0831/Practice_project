import java.util.Scanner;

public class Ex7 {
    public static void main(String args[]){

        int[] sqr1 = new int[2];
        int[] sqr2 = new int[2];
        int[] sqr3 = new int[2];
        int[] answer1 = new int[3];
        int[] answer2 = new int[3];

        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 배열을 입력하세요");
        for (int i = 0 ; i<sqr1.length ; i++) {
            sqr1[i] = scanner.nextInt();
        }
        System.out.println("두번째 배열을 입력하세요");
        for (int i = 0 ; i<sqr2.length ; i++){
            sqr2[i] = scanner.nextInt();
        }
        System.out.println("세번째 배열을 입력하세요");
        for (int i = 0 ; i<sqr3.length ; i++){
            sqr3[i] = scanner.nextInt();
        }


        System.out.print("사각형을 이룰 네번째 배열의 위치는 ");

        for (int i = 0 ; i<answer1.length ; i++){
            answer1[i] = sqr1[0];
        }





    }
}
