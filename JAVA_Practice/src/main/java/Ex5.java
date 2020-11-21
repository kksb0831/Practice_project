import java.util.Scanner;
public class Ex5 {
    public static void main(String args[]){
//        Quiz. 메뉴 생성 숫자 입력으로 메뉴이동을 하게하고 각 메뉴의 기능은 제곱,제곱근(루트), 로그의 값을 계산하는 것이다.
        int input =0;

        Scanner scanner = new Scanner(System.in);


        outer:
        while (true){
            System.out.println("메뉴을 고르세요 (종료는 0을 입력)");
            System.out.println("1. 제곱");
            System.out.println("2. 제곱근");
            System.out.println("3. 로그");
            System.out.println("==============================");
            System.out.print("입력 : ");
            input = scanner.nextInt();

            if (input == 0){
                System.out.println("종료하겠습니다.");
                break ;
            }else if (input < 0 || input > 3){
                System.out.println("잘못된 값을 입력하셨습니다. (종료는 0번)");
                continue;
            }


            inner :
            while (true){
                System.out.print("메뉴로 돌아가기는 0번을 입력\n프로그램 종료하기는 -1번을 입력\n계산할 값을 입력하세요 : ");
                int tmp = scanner.nextInt();

                if (tmp == 0){
                    System.out.println("메뉸로 돌아갑니다.");
                    break;
                }else if (tmp == -1){
                    System.out.println("종료하겠습니다.");
                    break outer;
                }

                switch (input){
                    case 1:
                        System.out.println("제곱을 계산한 값은 : " + (tmp * tmp)+ "\n");
                        System.out.print("메뉴로 돌아갈까요? (예 : y, 아니오 :n) :");
                        String y1 = scanner.next();
                        if (y1.equals("y")){
                            break inner;
                        }else if (y1.equals("n")){
                             break;
                        }

                    case 2:
                        System.out.println("제곱근을 계산한 값은 : " + Math.sqrt(tmp)+ "\n");
                        System.out.print("메뉴로 돌아갈까요? (예 : y, 아니오 :n) :");
                        String y2 = scanner.next();
                        if (y2.equals("y")){
                            break inner;
                        }else if (y2.equals("n")){
                            break;
                        }


                    case 3:
                        System.out.println("로그로 계산한 값은 : " + Math.log(tmp)+ "\n");
                        System.out.print("메뉴로 돌아갈까요? (예 : y, 아니오 :n) :");
                        String y3 = scanner.next();
                        if (y3.equals("y")){
                            break inner;
                        }else if (y3.equals("n")){
                            break;
                        }
                }
            }
        }
    }
}
