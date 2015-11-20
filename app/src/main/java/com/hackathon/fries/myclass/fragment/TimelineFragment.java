package com.hackathon.fries.myclass.fragment;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.hackathon.fries.myclass.R;
import com.hackathon.fries.myclass.adapter.TimeLineAdapter;

/**
 * Created by TooNies1810 on 11/20/15.
 */
public class TimelineFragment extends Fragment {
    private View root;
    private Context mainContext;
    private ListView lvTimeline;
    private TimeLineAdapter mAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_timeline, null);
        mainContext = getActivity();
        initViews();
        return root;
    }

    private void initViews() {
        mAdapter = new TimeLineAdapter(mainContext);
        lvTimeline = (ListView) root.findViewById(R.id.lv_timeline);

        lvTimeline.setAdapter(mAdapter);
    }
}
