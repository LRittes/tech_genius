package models;

public class Question {
    private int id;

    private String question_text;

    private int difficult;

    public Question() {
    }

    public Question(int id, String question_text, int difficult) {
        this.id = id;
        this.question_text = question_text;
        this.difficult = difficult;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion_text() {
        return question_text;
    }

    public void setQuestion_text(String question_text) {
        this.question_text = question_text;
    }

    public int getDifficult() {
        return difficult;
    }

    public void setDifficult(int difficult) {
        this.difficult = difficult;
    }
}
