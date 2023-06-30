package models;

public class Answer {
    private int id;

    private Question question;

    private boolean correct_answer;

    private String answer_text;

    public Answer() {
    }

    public Answer(int id, Question question, boolean correct_answer, String answer_text) {
        this.id = id;
        this.question = question;
        this.correct_answer = correct_answer;
        this.answer_text = answer_text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public boolean isCorrect_answer() {
        return correct_answer;
    }

    public void setCorrect_answer(boolean correct_answer) {
        this.correct_answer = correct_answer;
    }

    public String getAnswer_text() {
        return answer_text;
    }

    public void setAnswer_text(String answer_text) {
        this.answer_text = answer_text;
    }
}
