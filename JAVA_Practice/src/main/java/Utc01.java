
class Utc01 {
    public int solution(String[] grades, int[] weights, int threshold) {
        int answer = -1234567890;
        int gra = 0;
        int[] sum = new int[grades.length];

        for (int i =0 ;i<grades.length;i++){
            if (grades[i].equals("A+")){
                sum[i] = 10;
            }else if (grades[i].equals("A0")){
                sum[i] = 9;
            }else if (grades[i].equals("B+")){
                sum[i] = 8;
            }else if (grades[i].equals("B0")){
                sum[i] = 7;
            }else if (grades[i].equals("C+")){
                sum[i] = 6;
            }else if (grades[i].equals("C0")){
                sum[i] = 5;
            }else if (grades[i].equals("D+")){
                sum[i] = 4;
            }else if (grades[i].equals("D0")){
                sum[i] = 3;
            }else if (grades[i].equals("F")){
                sum[i] = 0;
            }else{
                System.out.println("성적을 잘못입력하셨습니다.");
            }
        }

        if (grades.length != weights.length) {
            System.out.println("grade수와 weights수가 일치하지 않습니다.");
        }else {
            for (int i=0;i<grades.length;i++){
                gra += sum[i] * weights[i];
            }
        }
        
        answer = gra - threshold;



        return answer;
    }
}