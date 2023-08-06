package strings;

public class StringBufferDemo {
	
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Java Application");
		System.out.println(sb);
		sb.append(" Development");
		System.out.println(sb);
		System.out.println(sb.reverse());
		System.out.println(sb.hashCode());
		System.out.println(sb.length());
		
		
	}
}
