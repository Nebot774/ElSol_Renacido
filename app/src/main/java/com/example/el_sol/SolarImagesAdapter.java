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
        holder.imageView.setImageResource(solarImage.getImageUrl()); // Asegúrate de que sea getImageResId() si estás usando IDs de recursos

        // Configuración del menú en el Toolbar
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
        ImagenSolar originalImage = solarImages.get(position);
        ImagenSolar copiedImage = new ImagenSolar(originalImage.getImageUrl(), originalImage.getName());
        solarImages.add(position, copiedImage);
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
        androidx.appcompat.widget.Toolbar toolbar;
        public ViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.imageView); // Casting a ImageView
            toolbar = itemView.findViewById(R.id.toolbar);
            // Inicializar otros componentes, como Toolbar, si es necesario
        }
    }

}

