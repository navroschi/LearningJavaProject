
public class OperatorsPrePostDemo {

	public static void main(String[] args) {
		int i = 3;
		i++;
		// prints result 4
		System.out.println(i);
		++i;
		//prints 5
		System.out.println(i);
		//prints 6
		System.out.println(++i);
		//prints 6
		System.out.println(i++);
		//prints 7
		System.out.println(i);
		
		i = 3;
		int a = ++i;
		int b = i++;
		//prints 4
		System.out.println(a);
		//prints 4
		System.out.println(b);
	}

}
