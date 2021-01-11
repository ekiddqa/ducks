package com.qa.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {
	public static void main(String[] arg) {
		List<Duck> duckList  = new ArrayList<>(); 
		
		Duck mallard = new Duck("Mallard", true, false, true);
		Duck swedishBlue = new Duck("Swedish Blue", false, true, true);
		Duck crested = new Duck("Crested", false, true, true);
		Duck goldenCascade = new Duck("Golden Cascade", false, false, true);
		Duck hookBill = new Duck("Hook Bill", false, false, false);
		Duck mulard = new Duck("Mulard", true, true, false);

		duckList.add(mallard);
		duckList.add(swedishBlue);
		duckList.add(crested);
		duckList.add(goldenCascade);
		duckList.add(hookBill);
		duckList.add(mulard);
		
		//System.out.println(duckList);
		
		
		
	}
	public void printDucks(boolean duckGo) {
			System.out.println(ducklist);
		}
	} //not sure how you turn duckList into a variable without another class since I can't make an instance of duck list in this class

	public void allMallards(duckList) {
		for(Duck d: duckList) {
			if(d.isAMallard) {
				System.out.println(d.getName());
			}
		}
	public void sortDucks(duckList) {
		Collections.sort(duckList,name);
	} // I give up
	
}
