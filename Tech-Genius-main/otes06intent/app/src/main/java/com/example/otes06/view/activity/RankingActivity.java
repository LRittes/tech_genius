package com.example.otes06.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RankingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Obtém o Intent que iniciou a MainActivity
        Intent intent = getIntent();


        // Cria um layout principal
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER_HORIZONTAL);

        // Cria o TextView com o texto "Campeões"
        TextView textView = new TextView(this);
        textView.setText("Campeões");
        textView.setTextSize(32);

        // Adiciona o TextView ao layout principal com configurações de layout
        LinearLayout.LayoutParams textParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        textParams.setMargins(0,80,0,0);
        layout.addView(textView, textParams);


        // Define o layout principal como o layout da atividade
        setContentView(layout);
    }

}