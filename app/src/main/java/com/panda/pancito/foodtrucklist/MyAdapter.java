package com.panda.pancito.foodtrucklist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by pancito on 7/22/14.
 */
public class MyAdapter extends ArrayAdapter<String> {
    public MyAdapter(Context context, String [] values) {
        super(context, R.layout.row_layout_2, values);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater theInflater = LayoutInflater.from(getContext());
        View theView = theInflater.inflate(R.layout.row_layout_2, parent, false);

        String truck = getItem(position);

        TextView theTextView = (TextView) theView.findViewById(R.id.name_truck);

        theTextView.setText(truck);

        ImageView theImageView = (ImageView) theView.findViewById(R.id.imageView1);

        theImageView.setImageResource(R.drawable.arrow);

        return theView;
    }
}
