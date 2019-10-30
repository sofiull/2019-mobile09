package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.tugas2.adapters.bajuAdapters;
import com.example.tugas2.models.baju;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvBaju;
    List<baju> ListBaju = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvBaju = findViewById(R.id.rv_Baju);
        baju Baju = new baju("images", "JACKET FLEECES", "Fleeces","299.000");
        ListBaju.add(Baju);
        Baju = new baju ("kaos","OMOTENASHI LENGAN PENDEK", "Kaos", "199.000");
        ListBaju.add(Baju);
        Baju = new baju ("kemeja","KEMEJA EFC BROADCLOTH", "Kain", "249.000");
        ListBaju.add(Baju);
        bajuAdapters bajuAdapters = new bajuAdapters(ListBaju);
        rvBaju.setAdapter(bajuAdapters);
        rvBaju.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));
    }
}
