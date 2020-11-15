package Baseball;


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