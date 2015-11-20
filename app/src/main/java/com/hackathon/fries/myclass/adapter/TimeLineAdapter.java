package com.hackathon.fries.myclass.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.hackathon.fries.myclass.R;

import java.util.ArrayList;

/**
 * Created by TooNies1810 on 11/20/15.
 */
public class TimeLineAdapter extends BaseAdapter {
    private Context mContext;
    private LayoutInflater lf;
    private ArrayList<ItemTimeLine> itemArr;

    public TimeLineAdapter(Context mContext) {
        this.mContext = mContext;
        lf = LayoutInflater.from(mContext);

        itemArr = new ArrayList<>();
        initData();
    }

    private void initData() {
        itemArr = new ArrayList<>();
        itemArr.add(new ItemTimeLine("Cho em hỏi bộ thư viện của JAVa dùng thế nào ạ?", 0, 0, false));
        itemArr.add(new ItemTimeLine("Cho em hỏi bộ thư viện của JAVa dùng thế nào ạ?", 0, 0, true));
        itemArr.add(new ItemTimeLine("Cho em hỏi bộ thư viện của JAVa dùng thế nào ạ?", 3, 2, false));
        itemArr.add(new ItemTimeLine("Cho em hỏi bộ thư viện của JAVa dùng thế nào ạ?", 0, 0, false));
        itemArr.add(new ItemTimeLine("Cho em hỏi bộ thư viện của JAVa dùng thế nào ạ?", 0, 0, false));
        itemArr.add(new ItemTimeLine("Cho em hỏi bộ thư viện của JAVa dùng thế nào ạ?", 0, 0, false));
        itemArr.add(new ItemTimeLine("Cho em hỏi bộ thư viện của JAVa dùng thế nào ạ?", 0, 0, false));
        itemArr.add(new ItemTimeLine("Cho em hỏi bộ thư viện của JAVa dùng thế nào ạ?", 0, 0, false));
        itemArr.add(new ItemTimeLine("Cho em hỏi bộ thư viện của JAVa dùng thế nào ạ?", 0, 0, false));
    }

    @Override
    public int getCount() {
        return itemArr.size();
    }

    @Override
    public ItemTimeLine getItem(int position) {
        return itemArr.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = lf.inflate(R.layout.item_post, null);
        }
        TextView tvContent = (TextView) convertView.findViewById(R.id.tv_content);
        tvContent.setText(itemArr.get(position).getContent());

        return convertView;
    }
}
