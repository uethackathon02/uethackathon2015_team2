package com.hackathon.fries.myclass.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.RatingBar;
import android.widget.TextView;

import com.hackathon.fries.myclass.R;
import com.hackathon.fries.myclass.models.ItemComment;

import java.util.ArrayList;

/**
 * Created by Le Tuan on 21-Nov-15.
 */
public class CommentAdapter extends BaseAdapter {
    private ArrayList<ItemComment> listComments;
    private Context mContext;
    private LayoutInflater lf;

    public CommentAdapter(Context context){
        mContext = context;
        lf = LayoutInflater.from(mContext);

        getDataComments();
    }

    private void getDataComments(){
        listComments = new ArrayList<>();

        listComments.add(new ItemComment("Nguyễn Tiến Minh", "",
                "Minh chó. Minh chó. Minh chó. Minh chó. Minh chó. Minh chó. Minh chó. Minh chó. ", false));
        listComments.add(new ItemComment("Nguyễn Tiến Minh", "",
                "Minh chó. Minh chó. Minh chó. Minh chó. Minh chó. Minh chó. Minh chó. Minh chó. ", true));
        listComments.add(new ItemComment("Nguyễn Tiến Minh", "",
                "Minh chó. Minh chó. Minh chó. Minh chó. Minh chó. Minh chó. Minh chó. Minh chó. ", false));
        listComments.add(new ItemComment("Nguyễn Tiến Minh", "",
                "Minh chó. Minh chó. Minh chó. Minh chó. Minh chó. Minh chó. Minh chó. Minh chó. ", true));
    }

    @Override
    public int getCount() {
        return listComments.size();
    }

    @Override
    public ItemComment getItem(int position) {
        return listComments.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        if (view==null){
            view = lf.inflate(R.layout.item_comment_in_popup, null);
        }

        ItemComment item = listComments.get(position);

        // Image
        TextView txtUser    = (TextView)    view.findViewById(R.id.txtUserName);
        TextView txtContent = (TextView)    view.findViewById(R.id.txtContentComment);
        CheckBox checkBox   = (CheckBox)   view.findViewById(R.id.check_comment);

        txtUser.setText(item.getName());
        txtContent.setText(item.getContent());
        checkBox.setChecked(item.isVote());

        return view;
    }
}
