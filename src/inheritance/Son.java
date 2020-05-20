package inheritance;

public class Son extends Grandfather{

	public static void main(String[] args) {
		Son s = new Son();
//		Grandfather g = new Grandfather();
		s.city();
		s.country();
		System.out.println(s.i);
	}
	
	public void sonactivities() {
		System.out.println("Son activities");
	}
}
