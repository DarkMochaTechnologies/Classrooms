package com.classrooms.fragments;

import com.classrooms.R;
import com.classrooms.activity.home;
import com.classrooms.activity.register;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class profileMainFragment extends Fragment{

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.profilemainfragment, container, false);
		
		/*Button makePost = (Button) getView().findViewById(R.id.profile_button_makepost);
		Button makeClassroom = (Button) getView().findViewById(R.id.profile_button_makeclassroom);
		
		makePost.setOnClickListener(new View.OnClickListener() {
			 
            public void onClick(View v) {
  
                Intent i = new Intent(getActivity(),register.class);
                startActivity(i);
            }
        
        });
        
        makeClassroom.setOnClickListener(new View.OnClickListener() {
        	 
            public void onClick(View v) {
               
            	Intent i = new Intent(getActivity(),register.class);
                startActivity(i);
            }
            
        
        });
		*/
		
		return view;
		
		
	}

}
