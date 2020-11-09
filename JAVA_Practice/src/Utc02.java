class Solution2 {
    public long[] solution(String s, String op) {
        long[] answer = new long[s.length()-1];
        int a,b;



        for (int i =1,j=0 ;i<s.length();i++,j++){


            a = Integer.parseInt(s.substring(0,i));
            b = Integer.parseInt(s.substring(i));

            if (op.equals("+")){
                answer[j] = a+b;
            }else if (op.equals("-")){
                answer[j] = a-b;
            }else if (op.equals("*")){
                answer[j] = a*b;
            }else{
                System.out.println("부호를 잘못 입력하셨습니다.");
            }


        }




        return answer;
    }
}