import javax.swing.text.AbstractDocument.LeafElement;

public class BreakWithLabelDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arraysOfInts = {{ 32, 87, 3, 589}, {8, 1076, 2000, 12}, {622, 127, 77, 955}};
		
		int searchFor = 12;
		
		boolean foundIt = false;
		int i;
		int j = 0;
		
		search:
		for (i = 0; i < arraysOfInts.length; i++) {
			for (j = 0; j < arraysOfInts[i].length; j++) {
				if (arraysOfInts[i][j] == searchFor) {
					foundIt = true;
					break search;
				}
			}
		}
		if (foundIt) {
			i++;
			j++;
			System.out.println("Number " + searchFor + " was found on row " + i + " and column " + j);
		}
		else {
			System.out.println("Number was not found in the list");
		}
		System.out.println(arraysOfInts.length + " " + arraysOfInts[i].length);
	}

}
