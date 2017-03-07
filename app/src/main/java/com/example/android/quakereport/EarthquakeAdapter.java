package com.example.android.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ZANGETSU on 07-03-2017.
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    public EarthquakeAdapter(Context context, ArrayList<Earthquake> objects) {
        super(context, 0, objects);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list_item, parent, false);
        }

        Earthquake currentQuake = getItem(position);

        TextView magTextView = (TextView) listItemView.findViewById(R.id.quake_magnitude);

        magTextView.setText(currentQuake.getMagnitude());

        TextView locTextView = (TextView) listItemView.findViewById(R.id.quake_location);

        locTextView.setText(currentQuake.getLocation());

        TextView dateTextView = (TextView) listItemView.findViewById(R.id.quake_date);

        dateTextView.setText(currentQuake.getDate());

        return listItemView;
    }
}
