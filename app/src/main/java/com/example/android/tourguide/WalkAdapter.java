package com.example.android.tourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Here is defined the custom WalkAdapter to help displaying Walk object as a list.
 * It will recycle views from the list when not used.
 */
public class WalkAdapter extends ArrayAdapter<Walk> {

    /**WalkAdapter constructor that extends from ArrayAdapter class.
     * @param context sets the current activity.
     * @param walks is a ArrayList of object Walk.
     */
    public WalkAdapter(Activity context, ArrayList<Walk> walks) {
        super (context, 0, walks);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.walk_layout, parent, false);
            holder = new ViewHolder();
            holder.nameTextView = (TextView) listItemView.findViewById(R.id.walk_name);
            holder.durationTextView = (TextView) listItemView.findViewById(R.id.walk_duration);
            holder.levelTextView = (TextView) listItemView.findViewById(R.id.walk_level);
            holder.pictureImageView = (ImageView) listItemView.findViewById(R.id.walk_picture);
            listItemView.setTag(holder);
        } else {
            holder = (ViewHolder) listItemView.getTag();
        }
        //Get the position of the current Walk.
        Walk currentWalk = getItem(position);

        //Assign the proper name to the current Walk.
        holder.nameTextView.setText(currentWalk.getWalkName());

        //Assign the proper duration to the current Walk.
        holder.durationTextView.setText(currentWalk.getWalkDuration());

        //Assign the proper level to the current Walk.
        holder.levelTextView.setText(currentWalk.getWalkLevel());

        //Assign the proper picture from drawables to the current Walk.
        holder.pictureImageView.setImageResource(currentWalk.getWalkPictureId());

        return listItemView;
    }

    private static class ViewHolder {
        private TextView nameTextView;
        private TextView durationTextView;
        private TextView levelTextView;
        private ImageView pictureImageView;

    }
}

