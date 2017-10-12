package com.example.wildanifqie.resepmakanan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by wildanifqie on 11/10/2017.
 */

public class DetailResep extends AppCompatActivity {
    ImageView Gambar;
    TextView Judul, Deskripsi;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_resep);
        Judul = (TextView)findViewById(R.id.txtJudul);
        Gambar = (ImageView)findViewById(R.id.gambar);
        Deskripsi = (TextView)findViewById(R.id.deskripsi);

        Intent it2 = getIntent();

        String resepDetail = it2.getStringExtra("judul");
        getSupportActionBar().setTitle(resepDetail);
        String DeskripsiDetail = it2.getStringExtra("deskripsi");
        Deskripsi.setText(DeskripsiDetail);
        int GambarDetail = it2.getIntExtra("gambar",0);
        Gambar.setImageResource(GambarDetail);
    }
}
