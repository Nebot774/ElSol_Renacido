package com.example.el_sol;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toolbar;

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
        holder.imageView.setImageResource(ImagenSolar.getImageUrl());

        //configuramos el menu en el Toolbar
        holder.toolbar.setOnMenuItemClickListener(item -> {
            int itemId = item.getItemId();
            if (itemId == R.id.action_copy) {
                copyItem(position);
                return true;
            } else if (itemId == R.id.action_delete) {
                deleteItem(position);
                return true;
            }
            return false;
        });

        holder.toolbar.getMenu().clear();
        holder.toolbar.inflateMenu(R.menu.menu_item);

    }

    //metodo para copiar i eliminar items
    private void copyItem(int position) {
        // Suponiendo que getImagenResId() retorna un int que es el ID del recurso de la imagen
        int imageResId = solarImages.get(position). getImageUrl();
        String imageName = solarImages.get(position).getName();

        ImagenSolar copiedImage = new ImagenSolar(imageResId, imageName);
        solarImages.add(position, copiedImage); // Añade el ítem copiado en la misma posición
        notifyItemInserted(position);
    }

    //metodo eliminar el item
    private void deleteItem(int position) {
        solarImages.remove(position); // Elimina el ítem
        notifyItemRemoved(position);
    }



    @Override
    public int getItemCount() {
        return solarImages.size();
    }

    //classe viewHolder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView; // Asegúrate de que imageView sea de tipo ImageView
        Toolbar toolbar;
        public ViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.imageView); // Casting a ImageView
            toolbar = itemView.findViewById(R.id.toolbar);
            // Inicializar otros componentes, como Toolbar, si es necesario
        }
    }

}

