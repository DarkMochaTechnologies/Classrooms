package com.classrooms.fragments;

import java.util.ArrayList;

import com.classrooms.R;
import com.classrooms.activity.postActivity;
import com.classrooms.adapter.classroomAdapter;
import com.classrooms.model.post;

import android.app.ListFragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class classroomPostsFragment extends ListFragment{
	private static final int REQUEST_CODE = 10;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		ArrayList<post> items = post.populateItems();
		
		super.onCreate(savedInstanceState);
		classroomAdapter adapter = new classroomAdapter(getActivity(),items);
		this.setListAdapter(adapter);
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		return inflater.inflate(R.layout.classroomposts, container, false);	
	}
	
	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		post item = (post) getListAdapter().getItem(position);
		Intent i = new Intent(getActivity() , postActivity.class);
		i.putExtra("profilePic", item.getProfilePic());
		i.putExtra("name", item.getName());
		i.putExtra("description", item.getDescription());
		i.putExtra("location", item.getLocation());
		startActivityForResult(i, REQUEST_CODE);
	}

}
