package com.example.myapplication.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



import com.example.myapplication.R;

import java.util.List;

public class AnimeAdapter extends RecyclerView.Adapter<AnimeAdapter.ViewHolder> {

    private List<Anime> animeList;
    //private Context context;

    public AnimeAdapter(List<Anime> animeList) {
        this.animeList = animeList;
        //this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.tarjeta_anime, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtNombre.setText(animeList.get(position).getNombre());
        holder.txtDescripsion.setText(animeList.get(position).getDescripsion());

    }

    @Override
    public int getItemCount() {

        return animeList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView txtNombre;
        private TextView txtDescripsion;
        private ImageView imgFoto;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtNombre = itemView.findViewById(R.id.txt_nombre);
            txtDescripsion = itemView.findViewById(R.id.txt_descripsion);
            imgFoto = itemView.findViewById((R.id.img));
            //txtTelefono = itemView.findViewById(R.id.txt_telefono);
        }
    }
}
