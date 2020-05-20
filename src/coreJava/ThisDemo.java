package coreJava;

public class ThisDemo {
	
	int a = 2;
	
	public void getData() {
		int a = 3;
		System.out.println(a);
		System.out.println(this.a);//this refers to current object - object scope lies in class level
		int b = a + this.a;
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisDemo td = new ThisDemo();
		td.getData();
	}

}
