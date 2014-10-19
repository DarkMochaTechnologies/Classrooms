package com.classrooms.adapter;

import java.util.ArrayList;

import android.graphics.Typeface;
import com.classrooms.R;
import com.classrooms.model.classroom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class homeAdapter extends ArrayAdapter <ArrayList>{
	private final Context context;
	private final ArrayList values;
	
	public homeAdapter(Context context, ArrayList values) {
		super(context,R.layout.homerow, values);
	    this.context = context;
	    this.values = values;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		View rowView;
        Typeface[] typeFace = new Typeface[7];

        typeFace[0] = Typeface.createFromAsset(context.getAssets(), "fonts/quicksand_bold.otf");
        typeFace[1] = Typeface.createFromAsset(context.getAssets(), "fonts/quicksand_book.otf");
        typeFace[2] = Typeface.createFromAsset(context.getAssets(), "fonts/quicksand_bold_oblique.otf");
        typeFace[3] = Typeface.createFromAsset(context.getAssets(), "fonts/quicksand_book_oblique.otf");
        typeFace[4] = Typeface.createFromAsset(context.getAssets(), "fonts/quicksand_dash.otf");
        typeFace[5] = Typeface.createFromAsset(context.getAssets(), "fonts/quicksand_light.otf");
        typeFace[6] = Typeface.createFromAsset(context.getAssets(), "fonts/quicksand_light_oblique.otf");

		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		
		if(convertView != null){
			rowView = convertView;
		}else{
			rowView = inflater.inflate(R.layout.homerow, parent, false);			
		}
		
		ImageView background = (ImageView) rowView.findViewById(R.id.homerow_imageView_background); 
		TextView name = (TextView) rowView.findViewById(R.id.homerow_textView_name);
		TextView description = (TextView) rowView.findViewById(R.id.homerow_textView_description);
		classroom item = (classroom) values.get(position);
		

		background.setImageResource(item.getProfilePicRef());
		name.setText(item.getName());
        name.setTypeface(typeFace[0]);
		description.setText(item.getDescription());
        description.setTypeface(typeFace[1]);
		return rowView;
	}
}
