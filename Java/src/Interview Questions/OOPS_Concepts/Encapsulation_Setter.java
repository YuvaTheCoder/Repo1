package OOPS_Concepts;

public class Encapsulation_Setter {
public static void main (String args[]) {
	Encapsulation_Getter Obj1 = new Encapsulation_Getter();
	Obj1.setName("Yuva");
	Obj1.setAge(27);
	System.out.println("The Name is :" + Obj1.getName());
	System.out.println("The Name is :" + Obj1.getAge());
}
}


