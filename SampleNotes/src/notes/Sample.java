package notes;

//***	07 - june	*****

//public class Sample {
////			// Checking of different names for same declared variable of a String
//	public static void main(String[] args) {
//
//		String name = "javeed";
//		String name1 = name;
//		System.out.println(name1);
//	}
//}					// error occured Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//					//	Duplicate local variable name

	// OOPS Concepts : 
	//	Inheritance
	//	Encapsulation
	//	Abstraction
	//	Polymorphism
	//	Class
	//	Object

/*
 // Class and Object
 */

//class Sample{	// let us consider sample is class which works as Blue-print 
//	int car;		// taking variables stores in Stack memory 
//	String model;	
//	public static void main(String [] args) {
//	
//		Sample name = new Sample();	// Sample name is a reference and object stores in heap memory 
//									// Sample(); is a constructor it gives the memory needed to create an object. 
//									// the object we created is know as instance and it contains varibles and methods 
//									// we create object from class that is Sample to name(object) * keyword 'new' is work as memory allocation 
//		name.car = 2;				// if create new object the previous object data will be moved to grabage when both objects have same name
//		name.model = "Hyundai";
////		name.car = 3;
////		name.model = "toyota";
//		System.out.println(name.car+"\t"+name.model);
//		
//	}
//}
//

/*
 	// Inheritance
		// its mechanism is to inherit from one class to another class :- which works as bridge btw 2 different classes
			// keyword we use to inherit is "extends"
			inheritance is to provide the reusability of code so that a class has to write only the unique features and rest of the 
			common properties and functionalities can be extended from the another class. 
*/

//class Math1	// super class
//{
//	public int add(int a, int b)
//	{
//		return a+b;
//	}
//}
//class Math2 extends Math1
//{
//	public int sub(int a, int b)
//	{
//		return a-b;		
//	}
//}

//class Name
//{
//	public String name(String a) {
//		return a;
//	}
//}
//class Roll extends Name{
//	public int roll(int a) {
//		return a;
//	}
//}
//public class Sample{
//	public static void main(String args[]) {
////		Math2 enter = new Math2();
////		int result = enter.add(7,8);
////		int result1 = enter.sub(7,8);
////		System.out.println(result);
////		System.out.println(result1);
//		Roll enter = new Roll();
//		String result = enter.name("javeed");
//		int result1 = enter.roll(214);
//		System.out.println("Name = "+result+"\t"+"roll = "+result1);
//
//	}
//}

/* 
 //	** Encapsulation	**
  * 
 */

//public class Sample{
//	public static void main(String args[]) {
//		String str = "javeed";
//		String str1 = str;
//	}
//}

//class Demo{
//	public void String() {
//		return;
//	}
//}
//class Sample{
//
//public static void main(String args[]){
//
//Sample demo = new Sample();
//Demo demo1 = new Demo();
//System.out.println(demo.toString());
//System.out.println(demo1.toString()); // to see the stored address we use key word .to
//}
//}

// ********* 09 - june ************* //

// Object concepts
//
//public class Sample{
//	boolean isAirBag;
//	String brand;
//	
//	void show(String str) {
//		System.out.println("Show method called by "+str);
//	}
//	
//	boolean checkisAirBag() {
//		return isAirBag;
//	}
//	public static void main(String args[]) {
//		Sample obj = new Sample();
//		Sample obj1 = new Sample();
//		obj.show("Object1"+obj.toString());
//		obj.isAirBag = true;
//		System.out.println("obj is AirBag - "+obj.checkisAirBag());
//		
//		new Sample().show("object2"+obj1.toString()); //object
//
//	}
//}

//===========================

//public class Sample{
//	// static member
//	static String fruit = "apple";
//	// no obj required to access them
//	// has 1 n same value for all object
//	// why ? = no copy generates for each object.
//	
//	
//	// instance member
//	final int i = 10;
//	
//	boolean isAirBag;
//	String brand;
//	
//	void show(String str) {
//		System.out.println("Show method called by "+str);
//		// i = 1+20;	//restricted as defined as final
//	}
//	
//	boolean checkisAirBag() {
//		return isAirBag;
//	}
//	public static void main(String args[]) {
//		Sample obj = new Sample();
//		//Sample obj1 = new Sample();
//		obj.show("Object1");//+obj.toString());
//		obj.isAirBag = true;
//		System.out.println("obj is AirBag - "+obj.checkisAirBag());
//		
//		new Sample().show("object2");
//		//new Sample().show("object2");//+obj1.toString()); //object
//
//		System.out.println("fruit = "+Sample.fruit+"\t"+obj.i);
//
//	}
//}
//

// ***************** task print leap year or not true or false using boolean *************

//import java.util.Scanner;
//public class Sample{
//	public static void main(String args[]) {
//		
//		@SuppressWarnings("resource")
//		Scanner sc = new Scanner(System.in);
//		int year;
//		boolean ans = true;
//		System.out.print("enter the year = ");
//		year = sc.nextInt();
//		
//		if ( (year % 4 == 0) && (year % 100 == 0) ) {
//			if ( year % 400 == 0)
//				ans = true;
//				else
//					ans = false;
//
//			}
//		else
//			ans = true;
//		if (ans)
//		System.out.println(year+" is Leap year "+"  "+ans);
//		else
//			System.out.println(year+" is not a Leap year"+" "+ans);
//		}
//	}
//	
	
//		10 - june //

/* object concept */
//public class Sample{
//	int i;
//	Sample(){} 		// default constructor
//	Sample(int i){ 		// parameterized constructor
//		this.i = i;			// input parameter and instance member has same name so we use this. to clear confusion
//	
//	}
//	void show(Sample objectParameter) {			// no return type
//		System.out.println("------");
//		System.out.println(this.i);
//		System.out.println(objectParameter.i);
//		
//	}
//	public static void main(String[] args) {
//		Sample s1 = new Sample(10);
//		Sample s2 = new Sample(20);
//		
//		s1.show(s1);	// s1 - property1 > i =10, property2 > show()
//		s2.show(s2);	// s2 - property1 > i =20, property2 > show()
//		
//		s1.show(s2);
//		s2.show(s1);	
//		
//	}
//}
	
/*
 * 
 * class has 3 properties - (What are class properties ?)
 * when we create the below object
 * 01 - new class() 
 * - 3 properties - attach - 01
 * - constructor - gets called
 * 
 * 
 * operations
 * 
 * object1  first property = value
 * 
 * 
 */
//
//class A{
//	int i;
//	A(int i){
//		this.i = i;
//	}
//	void show1() {
//		System.out.println("show1 called with i value - "+i);
//	}
//}
//// HAS - A parent ------ parent has a add-on to its property
//// IS - A chile -------- child is-a type of parent
//public class Sample extends A{
//	int i;		
//	Sample(int i){
//		//super(i);	// super calling the class A and i refers to the variable in class A 
//		super(i+10);
//		/*
//		 * 
//		 * used to pass value to parent class
//		 * it'll be 1st statement in child class constructor else error will come
//		 * u can access parent class properties/characteristics from super keyword in child
//		 * 
//		 * Object of Sample class
//		 * > constructor of Sample class
//		 * > we passing value+10 to parent class ------- super ( value+10)
//		 * 
//		 */
//		this.i = i;	
//	}
//	void show(Sample objectParameter) {	
//		System.out.println("------");
//		System.out.println(this.i);
//		System.out.println(objectParameter.i);
//		
//	}
//	public static void main(String[] args) {
//		Sample s1 = new Sample(10);
//		//Sample s2 = new Sample(20);
//		
//		//s1.show(s1);
//		s1.show1();
////		s2.show(s2);
////		
////		s1.show(s2);
////		s2.show(s1);	
////		
//	}
//}
	
	
/* **********	11 - june	************ */

// interface 
/*
 * Inheritacne 
 * user resposibility to define body of interface method
 * 
 * i dont want to define body
 * 
 * user - abstact class
 * 
 * void func1();
 * void fun2(){}
 * 
 * no object cteation for an abstraction -  60 - 80%
 * interface follow 100%
 * 
 * 
 * abstract class arhmeticoprtn{
 * 
 * int add(){return 1+1}
 * int sub(){return 2-1}
 * 
 * int div(); if we dont have any requiremt 
 * }
 * 
 * // inherit Arthmticoprtion
 * main extends arthmetcoptn{
 * 
 * int div() {};
 * 
 * main(){
 * main obj =new main();
 * int additionResult = obj.add();	
 * int subReslt = obj.sub();
 * 
 * 
 
 */
		

/*
 * import org.apaceh.loggin.log4j.message.Message;
 * 
 * interface print{
 * void show();
 * }
 * public class Sample implements print{
 * public void show(){
 * System.out.println("showMethod");
 * }
 * String message;
 * User(){
 * }
 * user(String message){
 * this.message = message;
 * }
 * 
 * public static void main(String[] args){
 * Sample userobject = new Sample();
 * userobject.show(10);
 * }
 * }
 * 
 * class User1 implements print{
 * public void show(int i){
 * i +=10;
 * System.out.println("User1 show method called and i value - "+i);
 * }
 * 
 * public static void main (String[] args){
 * User1 userobject = new User1();
 * userobject.show(10);
 * }
 * }
 * 
 * class User2 extends User1 {
 * public static void main(String [] args){
 * User2 obj = new User2();
 * obj.show(1);
 *
 *
 *
 *
 *
 * 
 */
	

class Sample1{
public void show(){
	System.out.print("written is ");
}
}
class Sample2 extends Sample1{
	public void show() {
		System.out.print("overWritten ");
	}
}
class Sample extends Sample2 {
    public void show() {
        System.out.print(" is again overWritten ");
    }

    public static void main(String[] args) {

        Sample1 obj = new Sample1();
        Sample2 obj1 = new Sample2();
        Sample obj2 = new Sample();
        obj.show();
        obj1.show();
        System.out.println("\n");
        obj1.show();
        obj2.show();
    }
}
//++++++++++++++++++++++++++++++++++++++++++++++++++

/*

 */


















