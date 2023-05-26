package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myapplication.Adapter.Anime;
import com.example.myapplication.Adapter.AnimeAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerAnime;
    AnimeAdapter animeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iniElementos();
    }

    private void iniElementos(){
        recyclerAnime = findViewById(R.id.recycler);
        recyclerAnime.setLayoutManager(new LinearLayoutManager(this));

        List<Anime> animeList = new ArrayList<>();
        for(int i = 0; i <20; i++){
            animeList.add(new Anime(i, "Dragon", "Ball",""));
            animeList.add(new Anime(i, "Naruto", "Uzumaki", ""));

        }

        animeAdapter = new AnimeAdapter(animeList);
        recyclerAnime.setAdapter(animeAdapter);

    }
}