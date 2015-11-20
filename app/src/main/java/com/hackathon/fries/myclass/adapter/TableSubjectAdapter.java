package com.hackathon.fries.myclass.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.hackathon.fries.myclass.R;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by TMQ on 20-Nov-15.
 */
public class TableSubjectAdapter extends BaseAdapter{
    private ArrayList<ItemLopMonHoc> listSuject;
    private ArrayList<ItemLopMonHoc> listSubjectInTable;
    private Context mContext;
    private LayoutInflater lf;

    public TableSubjectAdapter(Context context){
        mContext = context;
        lf = LayoutInflater.from(mContext);
        getSubjectData();
    }

    private void getSubjectData(){
        listSuject = new ArrayList<>();
        listSubjectInTable = new ArrayList<>();
//        listSuject.add(new ItemLopMonHoc("Xác suất thống kê", "MATH11111", "Giang vien",));
//        listSuject.add(null);
//        listSuject.add(new ItemLopMonHoc("Toán rời rạc", "MATH11111", "Giang vien", 100));
//        listSuject.add(null);
//        listSuject.add(null);
//        listSuject.add(null);
//        listSuject.add(new ItemLopMonHoc("Lý thuyết thông tin", "MATH11111", "Giang vien", 100));
//        listSuject.add(null);
//        listSuject.add(null);

        listSubjectInTable.add(new ItemLopMonHoc("Xác suất thống kê", "MAT1111 1", "303 G2", "Lê Phê Đô", 3, 3, 90, 1));
        listSubjectInTable.add(new ItemLopMonHoc("Toán rời rạc", "MAT2222 3", "313 G2", "Đặng Thanh Hải", 3, 3, 90, 1));
    }

    @Override
    public int getCount() {
        return listSuject.size();
    }

    @Override
    public ItemLopMonHoc getItem(int position) {
        return listSuject.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        if (view == null){
            view = lf.inflate(R.layout.item_subject_in_table, null);
        }

        ItemLopMonHoc item = listSuject.get(position);
        if (item == null) return view;

        TextView txtName = (TextView)   view.findViewById(R.id.txtItemNameSubject);
        txtName.setText(item.getTen());
        txtName.setBackgroundColor(new Random().nextInt());

        return view;
    }
}
