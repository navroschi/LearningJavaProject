
public class ContinueWithLabelDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String searchMode = "Look for a substring in me";
		String subString = "sub";
		boolean foundIt = false;
		
		int max = searchMode.length() - subString.length();
		
		
		test: 
			for (int i = 0; i <= max; i++) {
				int n = subString.length();
				int j = i;
				int k = 0;
				
				while (n-- != 0) {
					if (searchMode.charAt(j++) != subString.charAt(k++)){
						continue test;
					} 
				}
				foundIt = true;
				System.out.println(searchMode.charAt(--j));
				break test;
			}
		System.out.println(foundIt ? "Found it" : "Not found it");
	}
}
