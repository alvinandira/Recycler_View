package com.example.alvin.listview;

/**
 * Created by Alvin on 30/08/2018.
 */

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class adaptermakanan extends RecyclerView.Adapter<adaptermakanan.MakananHolder> {

    private List<ModelMakanan> mMakanan;
    public ClickListerner clickListerner;

    public adaptermakanan(List<ModelMakanan> mMakanan, ClickListerner clickListerner) {
        this.mMakanan = mMakanan;
        this.clickListerner = clickListerner;
    }

    @Override
    public MakananHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.makanan, parent, false);
        return new MakananHolder(view);
    }

    @Override
    public void onBindViewHolder(MakananHolder holder, int position) {
        holder.bind(mMakanan.get(position), clickListerner);
    }

    @Override
    public int getItemCount() {
        return mMakanan.size();
    }

    public class MakananHolder extends RecyclerView.ViewHolder{
        private ImageView gambarMakanan;
        private CardView cardView;
        private TextView namaMakanan, hargaMakanan;

        public MakananHolder (View dataView) { super(dataView);}

        public void bind( final ModelMakanan modelMakanan, final ClickListerner clickListerner){
            cardView = itemView.findViewById(R.id.cardView);
            gambarMakanan = itemView.findViewById(R.id.imageView);
            namaMakanan = itemView.findViewById(R.id.textNama);
            hargaMakanan = itemView.findViewById(R.id.textHarga);

            gambarMakanan.setImageResource(modelMakanan.getGambarMakanan());
            namaMakanan.setText(modelMakanan.getNamaMakanan());
            hargaMakanan.setText(modelMakanan.getHargaMakanan());

            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (clickListerner != null){
                        clickListerner.onClick(modelMakanan);
                    }
                }
            });
        }
    }
    interface ClickListerner {
        void onClick(ModelMakanan modelMakanan);
    }
}

