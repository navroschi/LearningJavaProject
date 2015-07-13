
public class OperatorsConditionalDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent obj1 = new Parent();
		Parent obj2 = new Child(); 
		Child obj3 = new Child();		
		System.out.println("obj1 instanceof Parent: " + (obj1 instanceof Parent));  // true
		System.out.println("obj1 instanceof Parent: " + (obj1 instanceof Child));  //false
		System.out.println("obj1 instanceof MyInterface: " + (obj1 instanceof MyInterface)); //false
		System.out.println("obj2 instanceof Parent: " + (obj2 instanceof Parent));  //true
		System.out.println("obj2 instanceof Child: " + (obj2 instanceof Child)); //true
		System.out.println("obj2 instnaceof MyInterface: " + (obj2 instanceof MyInterface)); //true
		System.out.println("obj3 instanceof Parent: " + (obj3 instanceof Parent));  //true
		System.out.println("obj3 instanceof Child: " + (obj3 instanceof Child)); //true
		System.out.println("obj3 instnaceof MyInterface: " + (obj3 instanceof MyInterface)); //true 
		System.out.println("obj2 method: " + obj2.x());
		System.out.println("obj3 methods: " + (obj3.x() + " " + obj3.y()));		
	}
}

class Parent {
	public int x() {
		return 0;
	}
}
class Child extends Parent implements MyInterface {
	public int y() {
		return 1;
	}
}
interface MyInterface {}

