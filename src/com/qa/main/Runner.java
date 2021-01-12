package com.qa.main;


public class Runner {
	public static void main(String[] arg) {
		Manager quack  = new Manager();
		
		Duck mallard = new Duck("Mallard", true, false, true);
		Duck swedishBlue = new Duck("Swedish Blue", false, true, true);
		Duck crested = new Duck("Crested", false, true, true);
		Duck goldenCascade = new Duck("Golden Cascade", false, false, true);
		Duck hookBill = new Duck("Hook Bill", false, false, false);
		Duck mulard = new Duck("Mulard", true, true, false);

		quack.duckList.add(mallard);
		quack.duckList.add(swedishBlue);
		quack.duckList.add(crested);
		quack.duckList.add(goldenCascade);
		quack.duckList.add(hookBill);
		quack.duckList.add(mulard);
	
		quack.printDucks();
		quack.allMallards();
		quack.nameSort();
		
		
		
	}
	
	} //not sure how you turn duckList into a variable without another class since I can't make an instance of duck list in this class
	


