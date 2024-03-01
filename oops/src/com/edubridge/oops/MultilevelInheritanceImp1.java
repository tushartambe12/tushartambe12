package com.edubridge.oops;
class vehical{
	double speed(double s) {
		System.out.println("speed of Vehicle:"+s);
		return s;
	}
} 
class Car extends vehical{
	String showColor(String color) {
		return color;
	}
}
class Bike extends Car{
	int showprise(int prise) {
		return prise;
	}
}
class Bycycle extends Bike{
	int showyearModel(int year) {
		return year;
	}
}
public class MultilevelInheritanceImp1 {

	public static void main(String[] args) {
		Bycycle b1=new Bycycle();
		System.out.println("The speed of vehicle is:"+b1.speed(9.85));
		System.out.println("The color of car:"+b1.showColor("black"));
		System.out.println("prise of Bike:"+b1.showprise(60000));
		System.out.println("The model year of Bycycle is:"+b1.showyearModel(2022));
		

	}

}
