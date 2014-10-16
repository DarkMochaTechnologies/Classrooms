package com.classrooms.fragments;

import java.util.ArrayList;

import com.classrooms.R;
import com.classrooms.adapter.filesAdapter;
import com.classrooms.model.file;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class classroomFilesFragment extends ListFragment{
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		ArrayList<file> items = file.populateItems();
		
		super.onCreate(savedInstanceState);
		filesAdapter adapter = new filesAdapter(getActivity(),items);
		this.setListAdapter(adapter);
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		return inflater.inflate(R.layout.classroomfiles, container, false);

	}

}
