package test;

public class QuestionRepositoryTest {

    public static void main(String[] args) {
        var qr = new repository.QuestionRepository();
        try {

            System.out.println(qr.getQuestions());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
