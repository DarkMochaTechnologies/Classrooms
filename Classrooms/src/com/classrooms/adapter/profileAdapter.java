package com.classrooms.adapter;

import java.util.ArrayList;

import com.classrooms.R;
import com.classrooms.model.post;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class profileAdapter extends ArrayAdapter <ArrayList> {
	private final Context context;
	private final ArrayList values;
	
	public profileAdapter(Context context, ArrayList values) {
		super(context,R.layout.profilerow, values);
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
			rowView = inflater.inflate(R.layout.profilerow, parent, false);			
		}
		
		TextView name = (TextView) rowView.findViewById(R.id.profilerow_textView_name);
		TextView description = (TextView) rowView.findViewById(R.id.profilerow_textView_description);
		TextView location = (TextView) rowView.findViewById(R.id.profilerow_textView_location);
		ImageView profilePic = (ImageView) rowView.findViewById(R.id.profilerow_imageView_profilePic); 
		post item = (post) values.get(position);
		if (position % 2 == 0) {
		    rowView.setBackgroundColor(Color.rgb(115,130,118));
		} else {
		    rowView.setBackgroundColor(Color.rgb(120,134,107));  
		}
		name.setText(item.getName());
		description.setText(item.getDescription());
		location.setText(item.getLocation());
		profilePic.setImageResource(item.getProfilePic());
		return rowView;
	}
	
}
