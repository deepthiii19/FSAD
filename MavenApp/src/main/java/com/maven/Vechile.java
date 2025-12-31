package com.maven;

class Vechileee {

	void drive() {
		System.out.println("Drive Vechile");
		// TODO Auto-generated constructor stub
	}

}
class Car extends Vechileee{
	void car() {
		System.out.println("Car is a Vechile");
	}
}
class ElectricCar extends Car{
	void elecar() {
		System.out.println("Electric car is a Car");
	}
}
public class Vechile {
	public static void main(String[] args) {
		ElectricCar t= new ElectricCar();
		t.drive();
		t.car();
		t.elecar();
	}
}
