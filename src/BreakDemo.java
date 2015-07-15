
public class BreakDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayOfInts = {32, 87, 3, 589, 12, 1076, 2000, 8, 662, 127};
		int searchfor = 12;
		
		int i;
		boolean foundIt = false;
		
		for (i=0; i<=arrayOfInts.length; i++) {
			if (arrayOfInts[i] == searchfor) {
				foundIt = true;
				break;
			} 
		}
		
		if (foundIt) {
			System.out.println("Number" + " " + searchfor + " " + "was found in position" + " " + i);
		}
		else {
			System.out.println("Number" + " " + searchfor + " " + "was not found");
		}
	}

}
