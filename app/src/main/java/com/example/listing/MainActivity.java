package com.example.listing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements SelectListener {
    private FloatingActionButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Item> items = new ArrayList<Item>();

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String nome = extras.getString("nome");
            String sinopse = extras.getString("sinopse");
            String editora = extras.getString("editora");
            String ano = extras.getString("ano");
            Uri image = extras.getParcelable("image");
            items.add(new Item(nome, sinopse, editora, ano, image));
        }

        button = findViewById(R.id.botaoFlutuante);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCadastro();
            }
        });

        RecyclerView recyclerView = findViewById(R.id.recyclerview);


        items.add(new Item("Henrique Cole", "a mais linda historia da IDE que n funciona", "colezada", "2022", R.drawable.faces));
        items.add(new Item("Henrique Cole", "a mais linda historia da IDE que n funciona", "colezada", "2022", R.drawable.profile));
        items.add(new Item("Henrique Cole", "a mais linda historia da IDE que n funciona", "colezada", "2022", R.drawable.faces));
        items.add(new Item("Henrique Cole", "a mais linda historia da IDE que n funciona", "colezada", "2022", R.drawable.profile));
        items.add(new Item("Henrique Cole", "a mais linda historia da IDE que n funciona", "colezada", "2022", R.drawable.faces));


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(), items, this));
    }

    public void openCadastro() {
        Intent intent = new Intent(this, CadastroActivity.class);
        startActivity(intent);
    }

    @Override
    public void onItemClicked(Item item) {
        Intent i = new Intent(MainActivity.this, Activity_detalhes.class);
        i.putExtra("nome", item.name);
        i.putExtra("sinopse", item.sinopse);
        i.putExtra("editora", item.editora);
        i.putExtra("ano", item.ano);
        System.out.println("ASMDAISFNOWIJFO`QWEIHFÌOQWHFIQWHIPUOQEHguItem: " + item.image);
        startActivity(i);
    }
}