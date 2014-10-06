package com.classrooms.fragments;

import com.classrooms.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class classroomHomeFragment extends Fragment{

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.classroomhome, container, false);
		TextView textview = (TextView) view.findViewById(R.id.tabtextview);
		textview.setText(R.string.action_settings);
		return view;
	}

}
