package com.example.el_sol;

import android.os.Bundle;
import android.app.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private SolarImagesAdapter adapter;
    private List<ImagenSolar> solarImages;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inizializamos la lista de imagenes
        solarImages=new ArrayList<>();
        //añadimos los elementos a la lsita
        solarImages.add(new ImagenSolar( R.drawable.corona_solar, "Corona Solar"));
        solarImages.add(new ImagenSolar( R.drawable.erupcionsolar, "Erupcion Solar"));
        solarImages.add(new ImagenSolar( R.drawable.espiculas, "Espiculas"));
        solarImages.add(new ImagenSolar( R.drawable.filamentos, "Filamentos"));
        solarImages.add(new ImagenSolar( R.drawable.magnetosfera, "Magnetosfera"));
        solarImages.add(new ImagenSolar( R.drawable.manchasolar, "Mancha Solar"));


        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2)); // Configura el número de columnas

        adapter = new SolarImagesAdapter(solarImages);
        recyclerView.setAdapter(adapter);
    }

    // Aquí puedes agregar otros métodos y funcionalidades según tu necesidad.
}
