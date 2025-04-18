package OOPS_Concepts;
//NOTE : Please close the class properly using Parenthesis.

class Vehicle{
	void start() {
		System.out.println("Vehicle is Running");
	}
}

class Car extends Vehicle{
	void start() {
		System.out.println("Car is Running");
	}
}
class PolymorphismMethodOverriding {
	public static void main (String[] args) {
//Object for Parent Class
		Vehicle veh = new Vehicle();
		veh.start();
		
// Object for Child class
		Vehicle car1 = new Car();
		car1.start();
	}
}