package com.example.el_sol;

import android.os.Bundle;
import android.app.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private SolarImagesAdapter adapter;
    private List<ImagenSolar> solarImages;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2)); // Configura el número de columnas

        adapter = new SolarImagesAdapter(solarImages);
        recyclerView.setAdapter(adapter);
    }

    // Aquí puedes agregar otros métodos y funcionalidades según tu necesidad.
}
