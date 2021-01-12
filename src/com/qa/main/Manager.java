package com.qa.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Manager {
	List<Duck> duckList  = new ArrayList<>();
	
	public void printDucks() {
		System.out.println(duckList.toString());
		
	}
	
	public void allMallards() {
		for(Duck d: duckList) {
			if(d.isAMallard()) {
				System.out.println(d.getName());
			}
		}
	}
	public void nameSort() {
		List<String> nameList = new ArrayList<>();
		for(Duck d :duckList) {
			nameList.add(d.getName());
		} Collections.sort(nameList);
		System.out.println(nameList);
		
	}
}
