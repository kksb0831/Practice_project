

class Utc06 {
    public String[] solution(String[] logs) {
        int count = 0;
        String[] answer = new String[logs.length];
        String[] code = new String[logs.length];
        String[] num = new String[logs.length];
        String[] grade = new String[logs.length];
        String[][]arry = new String[logs.length][3];

        for (int i =0 ; i<logs.length ; i++){
            arry[i] = logs[i].split(" ");


        }

        for (int i = 0 ; i< arry.length ; i++) {
            code[i] = arry[i][0];
            num[i] = arry[i][1];
            grade[i] = arry[i][2];
        }

        for(int i = 0 ; i< logs.length ; i++ ){
            for (int j = 0 ; j< logs.length ; j++){
                if (code[i] == code[j]) {
                    count += 1;

                    if (num[i]== num[j]){
                        if (grade[i]==grade[j]){
                            if(count>=5){
                                answer[i] = answer + code[i];
                            }else {
                                answer[0] = "None";
                            }
                        }


                    }

                }
            }
        }

        return answer;
    }
}