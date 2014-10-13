package com.classrooms.adapter;

import java.util.ArrayList;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.classrooms.R;
import com.classrooms.model.comment;

public class commentAdapter extends ArrayAdapter <ArrayList>{
	private final Context context;
	private final ArrayList values;
	
	public commentAdapter(Context context, ArrayList values) {
		super(context,R.layout.post_commentrow, values);
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
			rowView = inflater.inflate(R.layout.post_commentrow, parent, false);			
		}
		
		TextView name = (TextView) rowView.findViewById(R.id.postcommentrow_textView_name);
		TextView description = (TextView) rowView.findViewById(R.id.postcommentrow_textView_description);
		TextView date = (TextView) rowView.findViewById(R.id.postcommentrow_textView_date);
		ImageView profilePic = (ImageView) rowView.findViewById(R.id.postcommentrow_imageView_profilePic); 
		comment item = (comment) values.get(position);
		if (position % 2 == 0) {
		    rowView.setBackgroundColor(Color.rgb(115,130,118));
		} else {
		    rowView.setBackgroundColor(Color.rgb(120,134,107));  
		}
		name.setText(item.getName());
		description.setText(item.getDescription());
		date.setText(item.getDate());
		profilePic.setImageResource(item.getProfilePic());
		return rowView;
	}
}
