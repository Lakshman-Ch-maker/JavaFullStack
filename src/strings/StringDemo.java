package strings;

public class StringDemo {
	public static void main(String[] args) {
		String s = "Java Developer";
		System.out.println(s);
		s.concat(" development");
		System.out.println(s);
		String s1 = s.concat(" DEvelopment");
		System.out.println(s1);
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.hashCode());
		System.out.println(s1.getClass());
		System.out.println(s1.equals("java application development"));
		System.out.println(s1.equalsIgnoreCase("java application development"));
	}
}
