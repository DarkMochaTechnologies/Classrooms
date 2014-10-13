package com.classrooms.fragments;

import java.util.ArrayList;

import com.classrooms.R;
import com.classrooms.adapter.commentAdapter;
import com.classrooms.model.comment;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class commentsListFragment extends ListFragment{
	private static final int REQUEST_CODE = 10;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		ArrayList<comment> items = comment.populateItems();
		
		super.onCreate(savedInstanceState);
		commentAdapter adapter = new commentAdapter(getActivity(),items);
		this.setListAdapter(adapter);
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		return inflater.inflate(R.layout.post_comments, container, false);

	}
}
