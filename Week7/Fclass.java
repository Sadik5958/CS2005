// GRPA-2

import java.util.*;

class InvalidInputEx extends Exception {
	public InvalidInputEx(String msg) {
		super(msg);	
	}
}

class IntList {
	private int[] i_arr = new int[5];
	public void set_value(int i, int v) throws InvalidInputEx {
		try {
			i_arr[i] = v;	
		}	catch(ArrayIndexOutOfBoundsException e1) {
			InvalidInputEx e2 = new InvalidInputEx("invalid index input");
			e2.initCause(e1);
			throw e2;	
		}
	}
	public int[] getArray() {
		return i_arr;	
	}
}

class Fclass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntList ilist = new IntList();
		try {
			for (int i = 0; i< 5; i++) {
				int n = sc.nextInt();	
				int m = sc.nextInt();	
				ilist.set_value(n, m);
			}	
		}	
		catch (InvalidInputEx e) {
			System.out.println(e.getMessage());
			Throwable ori = e.getCause();
			System.out.println(ori.getMessage());
		}
		int[] i_arr = ilist.getArray();
		for (int i = 0; i < i_arr.length; i++)
			System.out.println(i_arr[i] + " ");
	}
}
