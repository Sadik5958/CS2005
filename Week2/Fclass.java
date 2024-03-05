// PPA-2

import java.util.*;

class Fclass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		evenDisplay(s1);
	}
	// Define evenDisplay(String) method here
	public static void evenDisplay(String st) {
		String even = "";
		for (int i=0; i<=st.length(); i++) {
			if (i % 2 == 0) {
				even += st.charAt(i);
			}
		}
		System.out.println(even);
	} 
}
