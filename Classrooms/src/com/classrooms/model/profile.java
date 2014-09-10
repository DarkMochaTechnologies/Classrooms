package com.classrooms.model;

import java.util.ArrayList;

public class profile {
	String username;
	String password;
	String profileName;
	String email;
	int profilePicRef;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getProfileName() {
		return profileName;
	}

	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getProfilePicRef() {
		return profilePicRef;
	}

	public void setProfilePicRef(int profilePicRef) {
		this.profilePicRef = profilePicRef;
	}

	public static ArrayList<profile> populateItems() {
		ArrayList<profile> items = new ArrayList<profile>();

// Loop for populating the list of users and their respective profile information 		
//		for (int x = 0; x < 1; x++) { 
//			
//			profile item = new profile();
//			
//			switch (x) {
//			case 0: {
//				item.username = "test";
//				item.password = "password";
//				item.profileName = "Mace Windu";
//				item.email = "test@where.com"
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
