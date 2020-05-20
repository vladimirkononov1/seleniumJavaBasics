package coreJava;

public class StaticVar {
	
	String name; //Instance Variables
	String address;
	static String city;//Class variables
	static int i;
	static {
		city = "Brentwood";
		i = 0;
	}
	
	StaticVar(String name, String address) {
		this.name = name;
		this.address = address;
		i++;
		System.out.println(i);
	}
	
	public void getAddress() {
		System.out.println(address + " " + city);
	}
	
	public static void getCity() {
		System.out.println(city);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticVar obj = new StaticVar("Vlad", "Shadow Lakes");
		StaticVar obj1 = new StaticVar("Anna", "Deer Readge");
		StaticVar obj2 = new StaticVar("Ivan", "Ron Nunn");

		
//		System.out.println(obj.name + obj.address + obj.city);
//		System.out.println(obj1.name + obj1.address + obj1.city);
		obj.getAddress();
		obj1.getAddress();
		obj2.getAddress();
		StaticVar.getCity();
		StaticVar.i = 4;
		obj.address = "Walnut Creek";

	}

}
