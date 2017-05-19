package com.example.news;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.net.URL;
import java.util.List;

/**
 * Created by 日不落 on 2017/5/18.
 */

public class NewsAdapter extends RecyclerView.Adapter<NewsViewHolder>{
    private List<NewsData.ResultBean.NewsBean> mNewsList;


    public NewsAdapter(List<NewsData.ResultBean.NewsBean> mNewsList){
        this.mNewsList = mNewsList;
    }
    @Override
    public NewsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_news,parent,false);
        NewsViewHolder holder = new NewsViewHolder(view);


        return holder;
    }

    @Override
    public void onBindViewHolder(final NewsViewHolder holder, int position) {
        final NewsData.ResultBean.NewsBean news = mNewsList.get(position);
        holder.titleView.setText(news.getTitle());
        Glide.with(holder.imgView.getContext()).
                load(news.getThumbnail_pic_s())
                .into(holder.imgView);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String urlstr = news.getUrl();
                //Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                Intent intent = new Intent(v.getContext(),InfoActivity.class);
                intent.putExtra("url",urlstr);
                v.getContext().startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return mNewsList.size();
    }

    public void changeData(List<NewsData.ResultBean.NewsBean> mNewsList){
        this.mNewsList = mNewsList;
        notifyDataSetChanged();
    }
}
