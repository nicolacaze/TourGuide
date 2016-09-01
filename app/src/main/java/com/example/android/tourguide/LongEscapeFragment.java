package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class LongEscapeFragment extends Fragment {


    public LongEscapeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_item, container, false);

        final ArrayList<Walk> walks = new ArrayList<Walk>();

        walks.add(new Walk(R.string.ariegeoises, 9, 2, R.drawable.ariege_montagne));
        walks.add(new Walk(R.string.picos_europa, 8, 2, R.drawable.picos_europa));
        walks.add(new Walk(R.string.encantats, 9, 3, R.drawable.encantats_montagne));
        walks.add(new Walk(R.string.trois_rois, 10, 3, R.drawable.trois_rois_montagne));
        walks.add(new Walk(R.string.mont_perdu_colorado, 10, 3, R.drawable.mont_perdu_montagne));


        WalkAdapter itemsAdapter = new WalkAdapter(getActivity(), walks);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}
