package com.gknsvs.criptomoneyexc.adapter;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.gknsvs.criptomoneyexc.R;
import com.gknsvs.criptomoneyexc.model.CryptoModel;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder> {

    ArrayList<CryptoModel> cryptoModelArrayList;
    private String[] colors = {"#a3ff00","#ff00aa","#b4a7d6","#a4c2f4","#8ee5ee","#cd950c","#f5f5f5","#f47932"};
    public RecyclerViewAdapter(ArrayList<CryptoModel> cryptoModelArrayList) {
        this.cryptoModelArrayList = cryptoModelArrayList;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.recyclerview_row,parent,false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        holder.bind(cryptoModelArrayList.get(position),colors,position);
    }

    @Override
    public int getItemCount() {
        return cryptoModelArrayList.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView txtCurrency;
        TextView txtPrice;
        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
        }
        public void bind(CryptoModel cryptoModel,String[] colors, int position){
            itemView.setBackgroundColor(Color.parseColor(colors[position % 8]));
            txtCurrency = itemView.findViewById(R.id.txt_currency);
            txtPrice = itemView.findViewById(R.id.txt_price);
            txtCurrency.setText(cryptoModel.getCurrency());
            txtPrice.setText(cryptoModel.getPrice());

        }
    }
}
