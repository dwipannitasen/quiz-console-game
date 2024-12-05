public class Question {
    private int id;
    private String question;
    private String otp1;
    private String otp2;
    private String otp3;
    private String otp4;
    private String ans;

    public Question(int id, String question, String otp1, String otp2, String otp3, String otp4, String ans) {
        this.id = id;
        this.question = question;
        this.otp1 = otp1;
        this.otp2 = otp2;
        this.otp3 = otp3;
        this.otp4 = otp4;
        this.ans = ans;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public String getOtp1() {
        return otp1;
    }
    public void setOtp1(String otp1) {
        this.otp1 = otp1;
    }
    public String getOtp2() {
        return otp2;
    }
    public void setOtp2(String otp2) {
        this.otp2 = otp2;
    }
    public String getOtp3() {
        return otp3;
    }
    public void setOtp3(String otp3) {
        this.otp3 = otp3;
    }
    public String getOtp4() {
        return otp4;
    }
    public void setOtp4(String otp4) {
        this.otp4 = otp4;
    }
    public String getAns() {
        return ans;
    }
    public void setAns(String ans) {
        this.ans = ans;
    }

    @Override
    public String toString() {
        return "Question [id=" + id + ", question=" + question + ", otp1=" + otp1 + ", otp2=" + otp2 + ", otp3=" + otp3
                + ", otp4=" + otp4 + ", ans=" + ans + "]";
    }




    
    
}
