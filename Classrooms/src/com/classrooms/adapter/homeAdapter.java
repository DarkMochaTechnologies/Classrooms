package com.classrooms.adapter;

import java.util.ArrayList;

import com.classrooms.R;
import com.classrooms.model.classroom;

import android.content.Context;
import android.graphics.Color;
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
		description.setText(item.getDescription());
		return rowView;
	}
}
