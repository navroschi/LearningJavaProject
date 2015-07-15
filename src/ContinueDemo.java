
public class ContinueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String searchMe = "peter piper picked a " + "peck of pickled peppers";
		int numberOfp = 0;
		
		for (int i = 0; i < searchMe.length(); i++) {
			if (searchMe.charAt(i) != 'p') {
				continue;
			}
			numberOfp++;
		}
		System.out.println("Number of p's found is: " + numberOfp);
	}

}
