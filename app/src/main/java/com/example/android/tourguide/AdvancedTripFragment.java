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
public class AdvancedTripFragment extends Fragment {


    public AdvancedTripFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_item, container, false);

        final ArrayList<Walk> walks = new ArrayList<Walk>();

        walks.add(new Walk(R.string.pic_carlit, 6, 2, R.drawable.carlit_sommet));
        walks.add(new Walk(R.string.pic_balaitous, 6, 3, R.drawable.balaitous_sommet));
        walks.add(new Walk(R.string.mont_perdu, 7, 3, R.drawable.mont_perdu_sommet));
        walks.add(new Walk(R.string.pic_posets, 6, 2, R.drawable.posets_sommet));
        walks.add(new Walk(R.string.pic_aneto, 7, 3, R.drawable.aneto_sommet));


        WalkAdapter itemsAdapter = new WalkAdapter(getActivity(), walks);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}
