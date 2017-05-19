package com.example.news;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by 日不落 on 2017/5/18.
 */

public class NewsViewHolder extends RecyclerView.ViewHolder{
    ImageView imgView;
    TextView titleView;

    public NewsViewHolder(View itemView) {
        super(itemView);
        imgView = (ImageView) itemView.findViewById(R.id.item_img);
        titleView = (TextView) itemView.findViewById(R.id.item_title);

    }
}
