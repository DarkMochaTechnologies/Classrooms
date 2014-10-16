package com.classrooms.model;

import java.util.ArrayList;

import com.classrooms.R;

public class file {
	String name ;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public static ArrayList<file> populateItems() {
		ArrayList<file> items = new ArrayList<file>();
		
		for (int x = 0; x < 20; x++) { 		
			file item = new file();			
			switch (x) {
				case 0: {
					item.name = "house.doc";
				}
				break;
				case 1: {
					item.name = "notes.docx";
				}
				break;
				case 2: {
					item.name = "schedule.xls";
				}
				break;
				case 3: {
					item.name = "greenwich.docx";
				}
				break;
				case 4: {
					item.name = "Asus support files.zip";
				}
				break;
				case 5: {
					item.name = "study notes.rar";
				}
				break;
				case 6: {
					item.name = "lesson1.pdf";
				}
				break;
				case 7: {
					item.name = "lesson2.pdf";
				}
				break;
				case 8: {
					item.name = "lesson3.pdf";
				}
				break;
				case 9: {
					item.name = "lesson4.pdf";
				}
				break;
				case 10: {
					item.name = "lesson5.pdf";
				}
				break;
				case 11: {
					item.name = "chapter4 answers.txt";
				}
				break;
				case 12: {
					item.name = "A curious Little Rabbit.docx";
				}
				break;
				case 13: {
					item.name = "monthly_meeting_minutes.xls";
				}
				break;
				case 14: {
					item.name = "Superman:AN analysis of the quintessential superhero.docx";
				}
				break;
				case 15: {
					item.name = "Marvel vs DC.pdf";
				}
				break;
				case 16: {
					item.name = "All the notes.zip";
				}
				break;
				case 17: {
					item.name = "Rurouni.zip";
				}
				break;
				case 18: {
					item.name = "stop.txt";
				}
				break;
				case 19: {
					item.name = "thefappening.rar";
				}
				break;
			}			
			items.add(item);
		}

		return items;
	}
}
