/* Abstraction has been done by two Methods. They are 1.Creating a Abstract class 
 * 2.Creating Instance method
 * Here explained type 1
 *    */ 

package OOPS_Concepts;

abstract class AbstractionExample1 {
abstract void yuvaabs();
public void Yuva5() {
	System.out.println("Calling from the Abstraction Example");
}
}

class Yuva2 extends AbstractionExample1{
	void yuvaabs(){
		System.out.println("Called from SubClass Yuva2");
	}
}
class Yuva3 extends AbstractionExample1{
	void yuvaabs(){
		System.out.println("Called from SubClass Yuva3");
	}
}
class AbstractionExample{
public static void main (String args[]) {
	AbstractionExample1 Obj2 = new Yuva2();
	Obj2.yuvaabs();
	Obj2.Yuva5();
	
	AbstractionExample1 Obj3 = new Yuva3();
	Obj3.yuvaabs();
	Obj3.Yuva5();
	
}
}