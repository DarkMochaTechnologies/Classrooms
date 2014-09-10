package com.classrooms.model;

import java.util.ArrayList;

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


	public static ArrayList<profile> populateItems() {
		ArrayList<profile> items = new ArrayList<profile>();

// Loop for populating the list of classrooms and their respective information 		
//		for (int x = 0; x < 1; x++) { 
//			
//			profile item = new profile();
//			
//			switch (x) {
//			case 0: {
//				item.name = "test";
//				item.categoryd = "password";
//				item.description = "Mace Windu is the blackest MOFO in star wars";
//				item.profilePicRef = R.drawable.something;
//			}
//				break;
//			
//
//
//			}
			
//			items.add(item);
//		}

		return items;
	}
}
