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
public class ShortTripFragment extends Fragment {


    public ShortTripFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_item, container, false);

        final ArrayList<Walk> walks = new ArrayList<Walk>();

        walks.add(new Walk(R.string.hautacam, 1, 1, R.drawable.hautacam));
        walks.add(new Walk(R.string.pic_du_midi, 2, 2, R.drawable.ossau));
        walks.add(new Walk(R.string.pic_anie, 1, 2, R.drawable.anie));
        walks.add(new Walk(R.string.turon_neouvielle, 1, 3, R.drawable.neouvielle));
        walks.add(new Walk(R.string.grand_barbat, 2, 3, R.drawable.barbat));


        WalkAdapter itemsAdapter = new WalkAdapter(getActivity(), walks);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}
