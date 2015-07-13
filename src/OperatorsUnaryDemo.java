
public class OperatorsUnaryDemo {

	public static void main(String[] args) {
		
		int result = +1;
		//result is now 1
		System.out.println("Result is now: " + result);
		
		result--;
		//result is now 0
		System.out.println("The second result is now: " + result);
		
		result++;
		//result is now 1
		System.out.println("The third result is now " + result);
		
		result = -result;
		//result is now 0
		System.out.println("The fourth result is now" + result);
		
		boolean successOperation = false;
		//false
		System.out.println(successOperation);
		//true
		System.out.println(!successOperation);
	}
	
}
