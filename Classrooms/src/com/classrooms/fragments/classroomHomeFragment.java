package com.classrooms.fragments;

import com.classrooms.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class classroomHomeFragment extends Fragment{

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.classroomhome, container, false);

		Bundle bundle = getArguments();
		
		TextView name = (TextView) view.findViewById(R.id.classroomhome_textView_name);
		TextView description = (TextView) view.findViewById(R.id.classroomhome_textView_description);
		ImageView background = (ImageView) view.findViewById(R.id.classroomhome_imageView_background);
		
		if(bundle != null){
			name.setText(bundle.getString("name"));
			description.setText(bundle.getString("description"));
			background.setImageResource(bundle.getInt("background"));
		}
		else
			Toast.makeText(getActivity(), "error in fragment", Toast.LENGTH_LONG).show();
		return view;
	}

}
