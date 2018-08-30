package com.example.alvin.listview;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private adaptermakanan adapterMakanan;
    private List<ModelMakanan> listMakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycleView);
        listMakanan = new ArrayList<>();

        DataList();

        adapterMakanan = new adaptermakanan(listMakanan, new adaptermakanan.ClickListerner() {
            @Override
            public void onClick(ModelMakanan modelMakanan) {
                Intent i = new Intent(MainActivity.this,datapesanan.class);
                i.putExtra("gambarMakanan", modelMakanan.getGambarMakanan());
                i.putExtra("namaMakanan", modelMakanan.getNamaMakanan());
                i.putExtra("hargaMakanan", modelMakanan.getHargaMakanan());
                i.putExtra("deskripsi", modelMakanan.getDeskripsi());
                startActivityForResult(i,1);
            }
        });

        GridLayoutManager glm = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(glm);
        recyclerView.setAdapter(adapterMakanan);
    }

    public void DataList(){

        listMakanan.add(new ModelMakanan(R.drawable.alvin,"TWICE", "Rp 10.000", "Bakso yang rasanya kaya disuapin sama Tzuyu."));
        listMakanan.add(new ModelMakanan(R.drawable.alvin1,"BLACKPINK", "Rp 15.000", "Soto yang enak di tambah porsinya yang jumbo membuat anda menjadi lebih sehat seperti sediakala."));
        listMakanan.add(new ModelMakanan(R.drawable.alvin1,"BLACKPINK", "Rp 15.000", "Soto yang enak di tambah porsinya yang jumbo membuat anda menjadi lebih sehat seperti sediakala."));
        listMakanan.add(new ModelMakanan(R.drawable.alvin1,"BLACKPINK", "Rp 15.000", "Soto yang enak di tambah porsinya yang jumbo membuat anda menjadi lebih sehat seperti sediakala."));
        listMakanan.add(new ModelMakanan(R.drawable.alvin1,"BLACKPINK", "Rp 15.000", "Soto yang enak di tambah porsinya yang jumbo membuat anda menjadi lebih sehat seperti sediakala."));
        listMakanan.add(new ModelMakanan(R.drawable.alvin1,"BLACKPINK", "Rp 15.000", "Soto yang enak di tambah porsinya yang jumbo membuat anda menjadi lebih sehat seperti sediakala."));
        listMakanan.add(new ModelMakanan(R.drawable.alvin1,"BLACKPINK", "Rp 15.000", "Soto yang enak di tambah porsinya yang jumbo membuat anda menjadi lebih sehat seperti sediakala."));
        listMakanan.add(new ModelMakanan(R.drawable.alvin1,"BLACKPINK", "Rp 15.000", "Soto yang enak di tambah porsinya yang jumbo membuat anda menjadi lebih sehat seperti sediakala."));
        listMakanan.add(new ModelMakanan(R.drawable.alvin1,"BLACKPINK", "Rp 15.000", "Soto yang enak di tambah porsinya yang jumbo membuat anda menjadi lebih sehat seperti sediakala."));
        listMakanan.add(new ModelMakanan(R.drawable.alvin1,"BLACKPINK", "Rp 15.000", "Soto yang enak di tambah porsinya yang jumbo membuat anda menjadi lebih sehat seperti sediakala."));
        listMakanan.add(new ModelMakanan(R.drawable.alvin1,"BLACKPINK", "Rp 15.000", "Soto yang enak di tambah porsinya yang jumbo membuat anda menjadi lebih sehat seperti sediakala."));
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == RESULT_OK){
            if (data != null){
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

                builder.setMessage("matur suwon");
                builder.setPositiveButton("Oke", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        closeOptionsMenu();
                    }
                });

                AlertDialog dialog = builder.create();

                dialog.show();
            }
        }
    }
}
