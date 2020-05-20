package coreJava;

public class ReverseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "rahul";
		String r = "";
		
		for(int i=s.length()-1; i>=0; i--) {
			r = r + s.charAt(i);
		}
		System.out.println(s + "\n" + r);
		if(r.equals(s)) {
			System.out.println("The string IS palindrom");
		}else {
			System.out.println("The string is NOT palindrom");
		}
	}

}
