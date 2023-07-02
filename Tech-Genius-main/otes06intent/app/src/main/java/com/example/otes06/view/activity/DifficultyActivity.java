package com.example.otes06.view.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.otes06.R;
import com.example.otes06.controllers.GameController;
import com.example.otes06.models.User;

public class DifficultyActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        User user = (User) intent.getSerializableExtra("user");
        GameController gc = new GameController();

        // Cria um layout principal
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);

        // Cria o TextView com o texto "Dificuldade"
        TextView textView = new TextView(this);
        textView.setText("Dificuldade");
        textView.setTextSize(32);

        // Adiciona o TextView ao layout principal com configurações de layout
        LinearLayout.LayoutParams textParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        textParams.gravity = Gravity.CENTER;
        textParams.setMargins(0,0,0,200);
        layout.addView(textView, textParams);

        // Cria os botões em estilo de hambúrguer
        Button button1 = new Button(this);
        button1.setText("Fácil");
        button1.setBackgroundResource(R.drawable.button_background);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Inicia a tela de seleção de dificuldade e passa o nome de usuário como extra
                Intent quizIntent = new Intent(DifficultyActivity.this, DefaultGamePage.class);
                Intent intent = getIntent();
                User user = (User) intent.getSerializableExtra("user");
                quizIntent.putExtra("user",user);
                Log.i("player",user.getName());
                startActivity(quizIntent);
            }
        });

        Button button2 = new Button(this);
        button2.setText("Médio");
        button2.setBackgroundResource(R.drawable.button_background);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Inicia a tela de seleção de dificuldade e passa o nome de usuário como extra
                Intent quizIntent = new Intent(DifficultyActivity.this, DefaultGamePage.class);
                Intent intent = getIntent();
                User user = (User) intent.getSerializableExtra("user");
                quizIntent.putExtra("user",user);
                Log.i("player",user.getName());
                startActivity(quizIntent);
            }
        });

        Button button3 = new Button(this);
        button3.setText("Difícil");
        button3.setBackgroundResource(R.drawable.button_background);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Inicia a tela de seleção de dificuldade e passa o nome de usuário como extra
                Intent quizIntent = new Intent(DifficultyActivity.this, DefaultGamePage.class);
                Intent intent = getIntent();
                User user = (User) intent.getSerializableExtra("user");
                quizIntent.putExtra("user",user);
                Log.i("player",user.getName());
                startActivity(quizIntent);
            }
        });

        // Configura a largura dos botões
        LinearLayout.LayoutParams buttonParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        buttonParams.setMargins(0,100,0,0);
        buttonParams.width = getResources().getDimensionPixelSize(R.dimen.button_width);

        // Adiciona os botões ao layout principal com configurações de layout
        layout.addView(button1, buttonParams);
        layout.addView(button2, buttonParams);
        layout.addView(button3, buttonParams);

        // Define o layout principal como o layout da atividade
        setContentView(layout);
    }
    private void showDifficultyToast(String difficulty,String name) {
        String message = "Jogando no modo " + difficulty + " com o usuário: " + name;
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}