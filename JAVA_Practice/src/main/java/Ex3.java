import java.util.Scanner;
public class Ex3 {
    public static void main(String args[]){


        //Quiz. 입력받은 수에서 각자리수의 합을 구하시오

        int num = 0, i=1,sum =0;

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        num = Integer.parseInt(tmp);

        while (num!=0){

            sum += num%10;
            System.out.println(i+"의 자리수는 : " + (num%10));
            i*=10;
            System.out.println("자리수의 합계는 :" + sum);
            num /= 10;
        }

    }

}
