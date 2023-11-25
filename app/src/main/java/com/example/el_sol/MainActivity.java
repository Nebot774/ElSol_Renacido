package com.example.el_sol;

import android.os.Bundle;
import android.app.Activity;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        int numberOfColumns = 2; // Ajusta esto según el número de columnas que quieras
        recyclerView.setLayoutManager(new GridLayoutManager(this, numberOfColumns));
        // Configura aquí tu adaptador para RecyclerView


    }

    // Aquí puedes agregar otros métodos y funcionalidades según tu necesidad.
}
