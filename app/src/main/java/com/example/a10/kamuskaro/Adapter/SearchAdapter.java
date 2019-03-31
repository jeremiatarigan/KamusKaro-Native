package com.example.a10.kamuskaro.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.a10.kamuskaro.Model.Kamus;
import com.example.a10.kamuskaro.R;

import java.util.List;

class SearchViewHolder extends RecyclerView.ViewHolder{

    public TextView bahasaindonesia, bahasakaro;

    public SearchViewHolder (View itemView) {
        super(itemView);
        bahasaindonesia = (TextView) itemView.findViewById(R.id.bahasaindonesia);
        bahasakaro=(TextView) itemView.findViewById(R.id.bahasakaro);
    }
}
public class SearchAdapter extends RecyclerView.Adapter<SearchViewHolder>{

   private Context context;
   private List<Kamus>Kamuskaro;

    public SearchAdapter(Context context, List<Kamus> kamuskaro) {
        this.context = context;
        this.Kamuskaro = kamuskaro;
    }


    @Override
    public SearchViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        boolean attachedToRoot;
        View itemView = inflater.inflate(R.layout.layout_item,parent,false);
        return  new SearchViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull SearchViewHolder holder, int position) {
        holder.bahasaindonesia.setText(Kamuskaro.get(position).getBahasaindonesia());
        holder.bahasakaro.setText(Kamuskaro.get(position).getBahasakaro());

    }

    @Override
    public int getItemCount() {
        return Kamuskaro.size();
    }
}
