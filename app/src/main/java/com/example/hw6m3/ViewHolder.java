package com.example.hw6m3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hw6m3.databinding.ItemRecyclerBinding;

public class ViewHolder extends RecyclerView.ViewHolder {
    private ItemRecyclerBinding binding;
    private TextView title, subtitle, number, playtime;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        title = itemView.findViewById(R.id.tv_title);
        subtitle = itemView.findViewById(R.id.tv_sub_title);
        number = itemView.findViewById(R.id.tv_number);
        playtime = itemView.findViewById(R.id.tv_playtime);
    }

    public void onBind(ItemModel model) {
        /*binding.tvTitle.setText(model.getTitle());
        binding.tvSubTitle.setText(model.getSubtitle());
        binding.tvNumber.setText(model.getNumber());
        binding.tvPlaytime.setText(model.getPlaytime());*/

        this.title.setText(model.getTitle());
        this.subtitle.setText(model.getSubtitle());
        this.number.setText(model.getNumber()); // soooooo bad >:(
        this.playtime.setText(model.getPlaytime());
    }
}
