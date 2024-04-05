// PPA-1

import java.util.*;

class Address implements Cloneable {
	private String s;
	public Address(String a) {
		s = a;	
	}
	public void setAddr(String s) {
		this.s = s;	
	}
	public String getAddr() {
		return s;	
	}
	public Address clone() throws CloneNotSupportedException {
		return (Address)super.clone();	
	}
}

class Department implements Cloneable {
	private String s;
	public Department(String d) {
		s = d;	
	} 
	public void setDept(String s) {
		this.s = s;	
	}
	public String getDept() {
		return s;	
	}
	public Department clone() throws CloneNotSupportedException {
		return (Department)super.clone();	
	}
}

class Person implements Cloneable {
	private String name;
	private Address addr;
	public Person(String n, Address a) {
		name = n;
		addr = a;	
	}
	public Person clone() throws CloneNotSupportedException {
		Person p = (Employee)super.clone();
		p.addr = addr.clone();
		return p;
	}
	public String toString() {
		return name + " : " + addr.getAddr();
	}
	public void updatePer(String a) {
		addr.setAddr(a);	
	}
}

class Employee extends Person implements Cloneable {
	private Department dept;
	public Employee(String n, Address a, Department d) {
		super(n, a);
		dept = d;
	}
	public Employee clone() throws CloneNotSupportedException {
		Employee e = (Employee)super.clone();
		e.dept = dept.clone();
		return e;	
	}
	public String toString() {
		return super.toString() + " : " + dept.getDept();	
	}
	public void updateEmp(String a, String d) {
		super.updatePer(a);
		dept.setDept(d);	
	}
}

public class FClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next(); // read name	
		String a1 = sc.next(); // read address	
		String d1 = sc.next(); // read department
		String a2 = sc.next(); // read new address	
		String d2 = sc.next(); // read new department
		try {
			Employee e1 = new Employee(n, new Address(a1), new Department(d1));
			Employee e2 = e1.clone();
			e1.updateEmp(a2, d2);
			System.out.println(e1 + ", " + e2);
		}	
		catch(CloneNotSupportedException e) {
			System.out.println("Clone() not supported");
		}
	}
}
