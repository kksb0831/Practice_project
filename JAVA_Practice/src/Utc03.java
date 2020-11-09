class Solution3 {
    public int solution(int money, String[] expected, String[] actual) {
        int answer = -1;
        int sum = 100;


        for (int i = 0; i < expected.length; i++) {

            if ((money - sum)>0){
                money -= sum;
            }else if ((money - sum)<=0){
                sum = money;
                money = 0;
            }
            if (expected[i].equals(actual[i])) {
                money += sum*2;
                sum = 100;
            }else {

                if (money<0){
                    money = 0;
                    break;
                }
                sum *=2;

            }
        }
        answer = money;
        return answer;
    }

}

