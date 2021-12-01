package com.example.hw6m3;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw6m3.databinding.ActivityMainBinding;
import com.example.hw6m3.databinding.FragmentSecondBinding;

import java.util.ArrayList;

public class SecondFragment extends Fragment {
    private FragmentSecondBinding binding;
    private RecyclerAdapter recyclerAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentSecondBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = view.findViewById(R.id.recycler);
        ArrayList<ItemModel> list = new ArrayList<>();

        list.add(new ItemModel("Blank Space", "Taylor Swift", "1", "3:22"));
        list.add(new ItemModel("Watch Me", "Silento", "2", "5:36"));
        list.add(new ItemModel("Earned It", "The Weekend", "3", "4:51"));
        list.add(new ItemModel("The Hills", "The Weekend", "4", "3:41"));
        list.add(new ItemModel("Writing’s On The Wall", "The Hils", "5", "5:33"));
        list.add(new ItemModel("Bad Habits", "Ed Sheeran", "6", "4:01"));
        list.add(new ItemModel("CLONED", "LukHash", "7", "2:54"));

        recyclerAdapter = new RecyclerAdapter(list, new IOnClick() {
            @Override
            public void onClick(int pos) {
                Intent intent = new Intent(getActivity(), SecondActivity.class);
                startActivity(intent);
            }
        });
        recyclerView.setAdapter(recyclerAdapter);
    }
}