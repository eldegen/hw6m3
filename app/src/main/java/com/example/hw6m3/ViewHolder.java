package com.example.hw6m3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hw6m3.databinding.ItemRecyclerBinding;

public class ViewHolder extends RecyclerView.ViewHolder {
    private TextView title, subtitle, number, playtime;
    private IOnClick iOnClick;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        title = itemView.findViewById(R.id.tv_title);
        subtitle = itemView.findViewById(R.id.tv_sub_title);
        number = itemView.findViewById(R.id.tv_number);
        playtime = itemView.findViewById(R.id.tv_playtime);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iOnClick.onClick(getAdapterPosition());
            }
        });
    }

    public void onBind(ItemModel model) {
        this.title.setText(model.getTitle());
        this.subtitle.setText(model.getSubtitle());
        this.number.setText(model.getNumber()); //
        this.playtime.setText(model.getPlaytime());
    }
}
