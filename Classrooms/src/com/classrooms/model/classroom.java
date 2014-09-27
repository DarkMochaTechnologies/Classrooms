package com.classrooms.model;

import java.util.ArrayList;

import com.classrooms.R;

public class classroom {
	String name;
	String category;
	String description;
	int profilePicRef;
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getProfilePicRef() {
		return profilePicRef;
	}


	public void setProfilePicRef(int profilePicRef) {
		this.profilePicRef = profilePicRef;
	}


	public static ArrayList<classroom> populateItems() {
		ArrayList<classroom> items = new ArrayList<classroom>();
	
		for (int x = 0; x < 1; x++) { 
			
			classroom item = new classroom();
			
			switch (x) {
				case 0: {
					item.name = "CS 175  Android";
					item.category = "science";
					item.description = "Mobile Android Development";
					item.profilePicRef = R.drawable.classrooms_logo;
				}
				break;
			}			
			items.add(item);
		}

		return items;
	}
}
