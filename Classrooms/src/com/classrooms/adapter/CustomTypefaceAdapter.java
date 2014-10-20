package com.classrooms.adapter;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.classrooms.R;
import com.classrooms.ObjectDrawerItem;

/**
 * Created by Powerlink on 10/20/2014.
 */
public class CustomTypefaceAdapter extends ArrayAdapter<ObjectDrawerItem> {
    private final Context context;
    private ObjectDrawerItem data[] = null;
    private int layoutId;
    private Typeface typeFace;
    public CustomTypefaceAdapter(Context context, int layoutId,  ObjectDrawerItem[] data) {
        super(context,layoutId, data);
        this.context = context;
        this.data = data;
        this.layoutId = layoutId;
        this.typeFace = Typeface.createFromAsset(context.getAssets(), "fonts/quicksand_light.otf");
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView;

        LayoutInflater inflater = ((Activity) context).getLayoutInflater();
        rowView = inflater.inflate(layoutId, parent, false);
        TextView textView = (TextView) rowView.findViewById(R.id.drawer_list_item);
        ImageView imageViewIcon = (ImageView) rowView.findViewById(R.id.drawer_list_image);

        ObjectDrawerItem folder = data[position];

        textView.setTypeface(typeFace);
        textView.setText(folder.name);
        imageViewIcon.setImageResource(folder.icon);

        return rowView;
    }
}
