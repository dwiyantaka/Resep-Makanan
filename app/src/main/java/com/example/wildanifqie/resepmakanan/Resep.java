package com.example.wildanifqie.resepmakanan;

/**
 * Created by wildanifqie on 11/10/2017.
 */

class Resep {
    private String judul, ket, deskripsi;
    private int gambar;

    Resep(String judul, String ket, String deskripsi, int gambar) {
        this.judul = judul;
        this.ket = ket;
        this.deskripsi = deskripsi;
        this.gambar = gambar;
    }

    String getJudul() {return judul;}
    String getKet() {return ket;}
    String getDeskripsi() {return deskripsi;}
    int getGambar() {return gambar;}
}
