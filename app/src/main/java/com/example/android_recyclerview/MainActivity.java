package com.example.android_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //Variáveis;
    ArrayList<String> arrayList = new ArrayList<String>();
    RecyclerView recyclerView;


    //Inicializa o arraylist
    private void inicializarArraylist(){
        arrayList.add("0");
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");
        arrayList.add("6");
        arrayList.add("7");
        arrayList.add("8");
        arrayList.add("9");
    }

    //Inicializa o recyclerview enviando o array para ele
    private void inicalizarRecyclerView() {
        recyclerView = findViewById(R.id.activity_main_recyclerView);
        RecyclerAdapterMain recyclerAdapterMain = new RecyclerAdapterMain(MainActivity.this, arrayList);
        recyclerView.setAdapter(recyclerAdapterMain);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarArraylist();
        inicalizarRecyclerView();
    }

}