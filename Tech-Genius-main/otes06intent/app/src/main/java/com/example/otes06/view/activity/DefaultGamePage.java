package com.example.otes06.view.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.otes06.R;
import com.example.otes06.controllers.GameController;
import com.example.otes06.models.Answer;
import com.example.otes06.models.Question;
import com.example.otes06.models.User;
import com.example.otes06.view.fragment.FinishFragment;
import com.example.otes06.view.fragment.QuestionFragment;

import java.util.ArrayList;
import java.util.List;

public class DefaultGamePage extends AppCompatActivity {
    User user = null;
    private QuestionFragment questionFragment;
    private FinishFragment finishFragment;
    private AppCompatButton btnNext;
    private AppCompatButton btnPrev;

    private int currentQuestion = 19;
    private TextView qtdQuestoes;
    private ProgressBar progressBar;
    private int score;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_default_game_page);

        GameController gc = new GameController();
        Intent intent = getIntent();
        try {
            user = (User) intent.getSerializableExtra("user");
            Log.i("player",user.getName());
        }
        catch (Exception e){
            Log.i("player",e.toString());

        }
        qtdQuestoes = findViewById(R.id.qtdQuestoes);
        qtdQuestoes.setText(currentQuestion + " de 20");
        progressBar = findViewById(R.id.progressBar);
        progressBar.setProgress(currentQuestion);

       List<Question> question = gc.getQuestions();
        questionFragment = new QuestionFragment(question.get(0));

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.frameQuestion,questionFragment);

        transaction.commit();

        btnNext = findViewById(R.id.btn_next);
        btnPrev = findViewById(R.id.btn_prev);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentQuestion == 20){
                    currentQuestion = 20;
                    try {
                        finishFragment = new FinishFragment(user);
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.frameQuestion,finishFragment);

                        transaction.commit();
                    } catch (Exception e){
                        Log.i("player", e.toString());
                    }

                }else {
                    currentQuestion++;

                    questionFragment = new QuestionFragment(question.get(currentQuestion));

                    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frameQuestion,questionFragment);

                    transaction.commit();
                    qtdQuestoes.setText(currentQuestion + " de 20");
                    progressBar.setProgress(currentQuestion);
                }


            }
        });

        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentQuestion == 0){
                    currentQuestion = 0;

                }else {
                    currentQuestion--;

                }
                questionFragment = new QuestionFragment(question.get(currentQuestion));


                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameQuestion,questionFragment);

                transaction.commit();
                qtdQuestoes.setText(currentQuestion + " de 20");
                progressBar.setProgress(currentQuestion);

            }
        });

    }
}