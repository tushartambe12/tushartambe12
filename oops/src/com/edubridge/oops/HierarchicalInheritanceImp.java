package com.edubridge.oops;
class student{
	String name="Tushar";
	String address="Thane";
	String qualification="BE CSE";
}
class course extends student{
{
	String courseName="Java Full stack";
	int fees=5000;
}
class plecement extends student{String compName="capgemini";
String ctc="5lakh";
}
public class HierarchicalInheritanceImp {

	public static void main(String[] args) {
		course c1=new course();
		plecement p1=new
		plecement();
		
		System.out.println("student Name:"+c1.name+"\nStudent address:"+c1.address+"\nStudent qualification:"+c1.qualification+"\nCourse Name:"+c1.+"\ncourse fees:"+c1.fees+"\nCompany name:"+p1.comName+"\nCTC:"+p1.ctc;

	}
}}

