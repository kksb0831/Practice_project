package Baseball;

import java.util.Scanner;

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
        if (choice == 1) {
            Baseball.introduce();
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
