package com.classrooms.adapter;

import java.util.ArrayList;

import android.graphics.Typeface;
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

public class classroomAdapter extends ArrayAdapter <ArrayList> {
	private final Context context;
	private final ArrayList values;
	
	public classroomAdapter(Context context, ArrayList values) {
		super(context,R.layout.profilerow, values);
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
			rowView = inflater.inflate(R.layout.classroomrow, parent, false);			
		}
		
		TextView name = (TextView) rowView.findViewById(R.id.classroomrow_textView_name);
		TextView description = (TextView) rowView.findViewById(R.id.classroomrow_textView_description);
		TextView time = (TextView) rowView.findViewById(R.id.classroomrow_textView_date);
		ImageView profilePic = (ImageView) rowView.findViewById(R.id.classroomrow_imageView_profilePic); 
		post item = (post) values.get(position);
		
		name.setText(item.getName());
		description.setText(item.getDescription());
		time.setText(item.getDate());
        name.setTypeface(typeFace[0]);
        description.setTypeface(typeFace[1]);
        time.setTypeface(typeFace[6]);
		profilePic.setImageResource(item.getProfilePic());

		rowView.setBackgroundColor(Color.rgb(255,255,255));

		return rowView;
	}
}
