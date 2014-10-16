package com.classrooms.adapter;

import java.util.ArrayList;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.classrooms.R;
import com.classrooms.model.file;


public class filesAdapter extends ArrayAdapter <ArrayList>{
	private final Context context;
	private final ArrayList values;
	
	public filesAdapter(Context context, ArrayList values) {
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
			rowView = inflater.inflate(R.layout.classroomfilesrow, parent, false);			
		}
		
		TextView name = (TextView) rowView.findViewById(R.id.classroomfilesrow_textView_name);
		file item = (file) values.get(position);		
		name.setText(item.getName());
		
		if (position % 2 == 0) {
		    rowView.setBackgroundColor(Color.rgb(115,130,118));
		} else {
		    rowView.setBackgroundColor(Color.rgb(120,134,107));  
		}
		
		return rowView;
	}
}