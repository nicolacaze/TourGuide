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
public class MediumTripFragment extends Fragment {


    public MediumTripFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_item, container, false);

        final ArrayList<Walk> walks = new ArrayList<Walk>();

        walks.add(new Walk(R.string.sierra_guara, 3, 1, R.drawable.guara));
        walks.add(new Walk(R.string.reino_mallos, 3, 1, R.drawable.mallos));
        walks.add(new Walk(R.string.trois_rois_dolomites, 4, 2, R.drawable.trois_rois));
        walks.add(new Walk(R.string.cote_mediterraneenne, 5, 1, R.drawable.cote_vermeille));
        walks.add(new Walk(R.string.cote_basque, 4, 1, R.drawable.cote_basque));
        walks.add(new Walk(R.string.sierra_guara_eldorado, 5, 2, R.drawable.guara_massif));
        walks.add(new Walk(R.string.sierras_cadi, 5, 3, R.drawable.cadi_moixero_massif));

        WalkAdapter itemsAdapter = new WalkAdapter(getActivity(), walks);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}
