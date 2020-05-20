package coreJava;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "hello";//String literal - Immutable(string cannot be changed)
		String b = "hello";
		String c = a.concat("World");//Mutable
		System.out.println(c);
		String s = new String("hello");
		String s1 = new String("hello");
		
		//StringBuffer and StringBuilder - Mutable(string can be changed)
		StringBuffer sb = new StringBuffer("hello");
		sb.append("world");
		System.out.println(sb);
		sb.insert(2, "She");
		System.out.println(sb);
		sb.replace(5, 7, "aa");
		System.out.println(sb);
		sb.deleteCharAt(12);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		StringBuilder sbb = new StringBuilder("hello");
		//StringBuilder is not thread safe. It is Non Synchronized. It is faster

	}

}
