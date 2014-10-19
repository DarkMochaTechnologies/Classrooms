package com.classrooms.fragments;

import android.graphics.Typeface;
import com.classrooms.R;
import com.classrooms.activity.RSBlurFragment;

import android.app.Fragment;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;

public class profileMainFragment extends Fragment{
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub

        Typeface[] typeFace = new Typeface[7];

        typeFace[0] = Typeface.createFromAsset(getActivity().getAssets(), "fonts/quicksand_bold.otf");
        typeFace[1] = Typeface.createFromAsset(getActivity().getAssets(), "fonts/quicksand_book.otf");
        typeFace[2] = Typeface.createFromAsset(getActivity().getAssets(), "fonts/quicksand_bold_oblique.otf");
        typeFace[3] = Typeface.createFromAsset(getActivity().getAssets(), "fonts/quicksand_book_oblique.otf");
        typeFace[4] = Typeface.createFromAsset(getActivity().getAssets(), "fonts/quicksand_dash.otf");
        typeFace[5] = Typeface.createFromAsset(getActivity().getAssets(), "fonts/quicksand_light.otf");
        typeFace[6] = Typeface.createFromAsset(getActivity().getAssets(), "fonts/quicksand_light_oblique.otf");

		View view = inflater.inflate(R.layout.profilemainfragment, container, false);
        TextView name = (TextView) view.findViewById(R.id.makePost_textView_classroom);
        TextView description = (TextView) view.findViewById(R.id.profile_textView_description);
		Button makePost = (Button) view.findViewById(R.id.profile_button_makepost);
		Button makeClassroom = (Button) view.findViewById(R.id.profile_button_makeclassroom);

        makePost.setTypeface(typeFace[1]);
        makeClassroom.setTypeface(typeFace[1]);
        name.setTypeface(typeFace[1]);
        description.setTypeface(typeFace[5]);
        DisplayMetrics displaymetrics = new DisplayMetrics();
		getActivity().getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
		int width = displaymetrics.widthPixels/2;
		
		makePost.setWidth(width);
		makeClassroom.setWidth(width);
		
		makePost.setOnClickListener(new View.OnClickListener() {
			 
            public void onClick(View v) {
  
                Intent i = new Intent(getActivity(),com.classrooms.activity.makePost.class);
                startActivity(i);
            }
        
        });
        
        makeClassroom.setOnClickListener(new View.OnClickListener() {
        	 
            public void onClick(View v) {
               
            	Intent i = new Intent(getActivity(),com.classrooms.activity.makeClassroom.class);
                startActivity(i);
            }
            
        
        });
		
    	
		return view;
			
	}

}
