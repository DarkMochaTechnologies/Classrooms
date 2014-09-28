package com.classrooms.fragments;

import java.util.ArrayList;

import com.classrooms.R;
import com.classrooms.adapter.profileAdapter;
import com.classrooms.model.post;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class profileListFragment extends ListFragment{

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		ArrayList<post> items = post.populateItems();
		
		super.onCreate(savedInstanceState);
		profileAdapter adapter = new profileAdapter(getActivity(),items);
		this.setListAdapter(adapter);
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		return inflater.inflate(R.layout.profilelistfragment, container, false);

	}


	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		
	}
	
}
