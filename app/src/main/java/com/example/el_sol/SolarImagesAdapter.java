package com.example.el_sol;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SolarImagesAdapter extends RecyclerView.Adapter<SolarImagesAdapter.ViewHolder> {

    private List<ImagenSolar> solarImages;

    public SolarImagesAdapter(List<ImagenSolar> solarImages) {
        this.solarImages = solarImages;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items_recycled, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ImagenSolar solarImage = solarImages.get(position);
        // Aquí configuras los elementos del ViewHolder con los datos de solarImage
        // Configura los listeners para tus eventos
    }

    @Override
    public int getItemCount() {
        return solarImages.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        // Define los elementos de la vista aquí, como ImageView, Toolbar, etc.

        public ViewHolder(View itemView) {
            super(itemView);
            // Inicializa tus vistas aquí
        }
    }
}

