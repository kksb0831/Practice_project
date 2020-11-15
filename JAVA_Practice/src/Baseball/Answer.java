package Baseball;
//정답생성
class Answer {
    static int[] answer() {
        int[] random = {1,2,3,4,5,6,7,8,9};
        int[] answer = new int[3];

        for (int i = 0; i < random.length; i++) {
            int n = (int)(Math.random()*random.length);
            int tmp = random[i];
            random[i] = random[n];
            random[n] = tmp;
        }
        System.arraycopy(random, 0, answer, 0, answer.length);
        return answer;
    }
}
