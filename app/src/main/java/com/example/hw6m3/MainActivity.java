package com.example.hw6m3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;

import com.example.hw6m3.databinding.ActivityMainBinding;
import com.example.hw6m3.databinding.FragmentSecondBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private FragmentSecondBinding bindingSecond;
    private RecyclerAdapter recyclerAdapter;

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        recyclerView = findViewById(R.id.recycler);



        ArrayList<ItemModel> list = new ArrayList<>();

        list.add(new ItemModel("Blank Space", "Taylor Swift", 1, "3:22"));
        list.add(new ItemModel("Watch Me", "Silento", 2, "5:36"));
        list.add(new ItemModel("Earned It", "The Weekend", 3, "4:51"));
        list.add(new ItemModel("The Hills", "The Weekend", 4, "3:41"));
        list.add(new ItemModel("Writing’s On The Wall", "The Hils", 5, "5:33"));
        list.add(new ItemModel("Bad Habits", "Ed Sheeran", 6, "4:01"));
        list.add(new ItemModel("CLONED", "LukHash", 7, "2:54"));

        recyclerAdapter = new RecyclerAdapter(list);
        recyclerView.setAdapter(recyclerAdapter);

        /*getSupportFragmentManager().beginTransaction().add(R.id.fl_main, new MainFragment()).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.fl_second, new SecondFragment()).commit();*/
    }
}