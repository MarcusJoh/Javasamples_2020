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
			
			//row.printAll();
			// System.out.println(row.getItem());

		}
		
		
		
		
		
		
		
		
		
		
		
		
//		ArrayList<String> sortHolder = new ArrayList<String>();
//		for (int i = 0; i < wholeSheet.size(); i++) {
//			sortHolder.add(wholeSheet.get(i).get(7));
//
//		}
//
//		Collections.sort(sortHolder);
//		for (String row : sortHolder) {
//			System.out.println("sorted:"+row);
//
//		}
//		ArrayList<CSVobject> wholeSheetObject = new ArrayList<CSVobject>();
//		for (int i = 0; i < wholeSheet.size(); i++) {
//
//			for (int y = 0; y < sortHolder.size(); y++) {
//				if (wholeSheet.get(i).get(7).compareTo(sortHolder.get(y))) {
//					System.out.println("comp:"+wholeSheet.get(i).get(0) + " " + sortHolder.get(y));
//
//					System.out.println("index:"+i + " " + y);
//
//					CSVobject line = new CSVobject(0, wholeSheet.get(y).get(0), wholeSheet.get(y).get(1),
//							wholeSheet.get(y).get(2), wholeSheet.get(y).get(3), wholeSheet.get(y).get(4),
//							wholeSheet.get(y).get(5), wholeSheet.get(y).get(6), wholeSheet.get(y).get(7));
//					wholeSheetObject.add(line);
//				}
//			}
//
//		}
//		System.out.println(wholeSheetObject.size());
//		System.out.println(wholeSheetObject.get(1).getTotal());
//		for (CSVobject row : wholeSheetObject) {
//			// System.out.println(row.);
//
//		}

	
	}
}
