package com.example.alvin.listview;

import android.support.v7.widget.CardView;

public class ModelMakanan {
    private int gambarMakan;
    private String namaMakan;
    private String hargaMakan;
    private String deskripsi;

    public ModelMakanan(int gambarMakanan, String namaMakanan, String hargaMakanan, String deskripsi) {
        this.gambarMakan = gambarMakanan;
        this.namaMakan = namaMakanan;
        this.hargaMakan = hargaMakanan;
        this.deskripsi = deskripsi;
    }

    public int getGambarMakanan() {
        return gambarMakan;
    }

    public void setGambarMakanan(int gambarMakanan) {
        this.gambarMakan = gambarMakan;
    }

    public String getNamaMakanan() {
        return namaMakan;
    }

    public void setNamaMakanan(String namaMakanan) {
        this.namaMakan = namaMakan;
    }

    public String getHargaMakanan() {
        return hargaMakan;
    }

    public void setHargaMakanan(String hargaMakanan) {
        this.hargaMakan = hargaMakan;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
}
