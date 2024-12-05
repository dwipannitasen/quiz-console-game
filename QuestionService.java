import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String selection[] = new String[5];
    public QuestionService() {
        questions[0] = new Question(1, "size of int", "2", "6", "4", "8", "4");
        questions[1] = new Question(2, "size of double", "2", "6", "4", "8", "8");
        questions[2] = new Question(3, "size of char", "2", "6", "4", "8", "2");
        questions[3] = new Question(4, "size of long", "2", "6", "4", "8", "8");
        questions[4] = new Question(5, "size of boolean", "1", "2", "4", "8", "1");
    }

    public void playQuiz() {
        int i = 0;
        for (Question q : questions) {
            System.out.println("Question no. " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println("Option 1 : " + q.getOtp1());
            System.out.println("Option 2 : " + q.getOtp2());
            System.out.println("Option 3 : " + q.getOtp3());
            System.out.println("Option 4 : " + q.getOtp4());
            System.err.println();
            Scanner sc = new Scanner(System.in);
            selection[i++] = sc.nextLine();
            sc.close();
        }
    }

    public void printScore() {
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            Question q = questions[i];
            String actualAns = q.getAns();
            String userAns = selection[i];

            if (actualAns.equals(userAns))
                score++;
        }
        System.out.println("Your score is: " + score);
    }
    

}