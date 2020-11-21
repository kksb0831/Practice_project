class Utc04 {
    public String solution(String penter, String pexit, String pescape, String data) {
        String answer = "";
        String cut;

        answer = penter;
        for(int i=0;i<data.length();i+=penter.length()){
            cut = data.substring(i,i+penter.length());

            if (cut.equals(penter) || cut.equals(pexit) || cut.equals(pescape)){
                answer = answer + pescape + cut;
            }else{
                answer = answer + cut;
            }
        }

        answer = answer + pexit;


        return answer;
    }
}