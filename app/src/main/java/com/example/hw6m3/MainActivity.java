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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportFragmentManager().beginTransaction().add(R.id.fl_main, new MainFragment()).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.fl_second, new SecondFragment()).commit();
    }
}