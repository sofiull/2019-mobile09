package com.example.tugas2.models;

public class baju {
    private String gambar;
    private String namaBaju;
    private String bahanBaju;
    private String hargaBaju;

    public baju(String gambar, String namaBaju, String bahanBaju, String hargaBaju) {
        this.gambar = gambar;
        this.namaBaju = namaBaju;
        this.bahanBaju = bahanBaju;
        this.hargaBaju = hargaBaju;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public String getNamaBaju() {
        return namaBaju;
    }

    public void setNamaBaju(String namaBaju) {
        this.namaBaju = namaBaju;
    }

    public String getBahanBaju() {
        return bahanBaju;
    }

    public void setBahanBaju(String bahanBaju) {
        this.bahanBaju = bahanBaju;
    }

    public String getHargaBaju() {
        return hargaBaju;
    }

    public void setHargaBaju(String hargaBaju) {
        this.hargaBaju = hargaBaju;
    }
}
