class Ex2 {
    public static void main(String args[]){
        int num = 0;

        System.out.println("Quiz1. 1~10사이의 난수를 20개 생성");

        for (int i=1;i<=20;i++){
            System.out.println((int)(Math.random()*10)+1);
        }

        System.out.println("Quiz2. -5~5사이의 난수를 20개 생성");

        for (int i=1;i<=20;i++){
            System.out.println((int)(Math.random()*11)-5);
        }
    }
}
