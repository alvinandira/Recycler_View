package com.example.alvin.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class datapesanan extends AppCompatActivity {

    private ImageView imageView;
    private TextView namaMakanan,hargaMakanan,deskripsiMakanan;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pesanan);

        imageView = findViewById(R.id.imageView);
        namaMakanan = findViewById(R.id.textNama);
        hargaMakanan = findViewById(R.id.textHarga);
        deskripsiMakanan = findViewById(R.id.deskripsi);
        btnSubmit = findViewById(R.id.btnSubmit);

        Intent i = getIntent();
        int gambar = i.getIntExtra("gambarMakanan",R.mipmap.ic_launcher_round);
        String nama = i.getStringExtra("namaMakanan");
        String harga = i.getStringExtra("hargaMakanan");
        String deskripsi = i.getStringExtra("deskripsi");

        imageView.setImageResource(gambar);
        namaMakanan.setText(nama);
        hargaMakanan.setText(harga);
        deskripsiMakanan.setText(deskripsi);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.putExtra("dataPesanan", "Terimakasih, Pesanan Anda Akan Segera Diantar");
                setResult(RESULT_OK,i);
                finish();
            }
        });
    }
}


