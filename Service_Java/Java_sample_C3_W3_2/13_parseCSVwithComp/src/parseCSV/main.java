package parseCSV;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		ArrayList<CSVobject> wholeSheetObject = readCSV.toObject();
		
		Collections.sort(wholeSheetObject, new Comparator<CSVobject>() {

		
			@Override
			public int compare(CSVobject o1, CSVobject o2) {
		
				return o1.getItem().compareTo(o2.getItem());
			}
		});
		
		for (CSVobject row : wholeSheetObject) {
			
			row.printAll();
			System.out.println(row.getItem());

		}
		
		
		
		
		
		
		
		
		
		
	}
