package com.example.tugas1.models;

public class Members {
    private int gambar;
    private String nama;
    private String umur;

    public Members(int gambar, String nama, String umur) {
        this.gambar = gambar;
        this.nama = nama;
        this.umur = umur;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }
}
