package com.example.listing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.io.IOException;

public class CadastroActivity extends AppCompatActivity {
    private Button button;
    private Button buttonVoltar;
    private String selectedImagePath = null;

    private EditText nome, sinopse, editora, ano;
    private Button botaoSalvar;

    private static final int REQUEST_CODE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        nome = findViewById(R.id.nomeInput);
        sinopse = findViewById(R.id.sinopseInput);
        editora = findViewById(R.id.editoraInput);
        ano = findViewById(R.id.anoInput);
        botaoSalvar = findViewById(R.id.saveButton);
        botaoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CadastroActivity.this, MainActivity.class);
                intent.putExtra("nome", nome.getText().toString());
                intent.putExtra("sinopse", sinopse.getText().toString());
                intent.putExtra("editora", editora.getText().toString());
                intent.putExtra("ano", ano.getText().toString());
                intent.putExtra("imagem", selectedImagePath);
                startActivity(intent);
            }
        });


        button = findViewById(R.id.botaoEscolherImg);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            openEscolherFoto();
            }
        });

        buttonVoltar = findViewById(R.id.button5);
        buttonVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                voltarParaLista();
            }
        });
    }

    private void selectImage() {
        Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(intent, REQUEST_CODE);
    }

    private static final int PICK_IMAGE_REQUEST = 1;
    private void openEscolherFoto() {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(Intent.createChooser(intent, "Selecione uma imagem"), PICK_IMAGE_REQUEST);
    }

    private String getPathFromURI(Uri contentUri) {
        String[] proj = {MediaStore.Images.Media.DATA};
        Cursor cursor = getContentResolver().query(contentUri, proj, null, null, null);
        int column_index = cursor.getColumnIndexOrThrow(MediaStore.Images.Media.DATA);
        cursor.moveToFirst();
        String result = cursor.getString(column_index);
        cursor.close();
        return result;
    }

    private void voltarParaLista() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}