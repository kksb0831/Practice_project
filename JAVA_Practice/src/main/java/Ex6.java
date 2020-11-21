import java.util.Arrays;
import java.util.Scanner;

public class Ex6 {


    public static void main(String args[]){
        int sum = 0;
        int x;
        double avg;
        Scanner scanner = new Scanner(System.in);

        System.out.print("배열의 길이를 입력하세요 : ");
        x = scanner.nextInt();


        int[]Arr = new int[x];


        for (int i=0 ; i<Arr.length;i++){
            Arr[i] = (int)(Math.random()*100+1);
        }
        System.out.println("생성된 배열 : " + Arrays.toString(Arr));


        for (int i=0 ; i<Arr.length;i++){
            sum += Arr[i];
        }
        avg = (double) sum / Arr.length;
        System.out.println("배열 원소의 총합 : " + sum);
        System.out.println("배열 원소의 평균 : " + avg);





    }
}
