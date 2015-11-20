package com.hackathon.fries.myclass.adapter;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.support.v7.widget.RecyclerView;

import com.hackathon.fries.myclass.R;
import com.hackathon.fries.myclass.holder.ItemPostHolder;

import java.util.ArrayList;

/**
 * Created by TooNies1810 on 11/20/15.
 */
public class TimeLineAdapter extends RecyclerView.Adapter<ItemPostHolder> {
    private Context mContext;
    private ArrayList<ItemPostHolder> itemArr = new ArrayList<ItemPostHolder>();

    public TimeLineAdapter(ArrayList<ItemPostHolder> posts, Context ctx){
        this.itemArr = posts;
        this.mContext = ctx;
    }

    @Override
    public ItemPostHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_post);
        return null;
    }

    @Override
    public void onBindViewHolder(ItemPostHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return itemArr==null?0:itemArr.size();
    }
}
