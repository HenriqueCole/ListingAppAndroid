package com.example.listing;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Activity_detalhes extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String nome = extras.getString("nome");
            TextView nomeText = (TextView) findViewById(R.id.nomeText);
            nomeText.setText(nome);

            String sinopse = extras.getString("sinopse");
            TextView sinopseText = (TextView) findViewById(R.id.sinopseText);
            sinopseText.setText(sinopse);

            String editora = extras.getString("editora");
            TextView editoraText = (TextView) findViewById(R.id.editoraText);
            editoraText.setText(editora);

            String ano = extras.getString("ano");
            TextView anoText = (TextView) findViewById(R.id.anoText);
            anoText.setText(ano);
        }
    }
}