package strings;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("Java is an object oriented language");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
