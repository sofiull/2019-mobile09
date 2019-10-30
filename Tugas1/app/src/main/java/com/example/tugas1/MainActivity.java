package com.example.tugas1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.tugas1.adapters.MembersAdapter;
import com.example.tugas1.models.Members;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvMembers;
    List<Members> ListMembers = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvMembers = findViewById(R.id.rvMembers);
        Members members = new Members(1,"Adi","18");
        ListMembers.add(members);
        members = new Members(1,"Lasti","17");
        ListMembers.add(members);
        members = new Members(1,"Tarjo","19");
        ListMembers.add(members);
        members = new Members(1,"Yahdi","18");
        ListMembers.add(members);
        MembersAdapter membersAdapter = new MembersAdapter(ListMembers);
        rvMembers.setAdapter(membersAdapter);
        rvMembers.setLayoutManager(new LinearLayoutManager(this));
    }
}
