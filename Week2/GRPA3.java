import java.util.*;

class Employee
{
    String eid;
    String ename;
    String eprojects[];
 //Define all the required methods here
 public Employee(Employee e) {
 	this.eid = e.eid;
	this.ename = e.ename;
	this.eprojects = new String[e.eprojects.length];
	for (int i=0; i<eprojects.length; i++) {
		this.eprojects[i] = e.eprojects[i];
	}
 }

public Employee(String id, String name, String[] projects) {
	this.eid = id;
	this.ename = name;
	this.eprojects = projects;
}

public void display() {
	System.out.println("id:"+eid);
	System.out.println("name:"+ename);
	System.out.println("projects:");
	for (String s: eprojects) {
		System.out.print(s+":");
	}
	System.out.print("\n");
}

public void mutator()
    {
        this.ename = "Mr "+ this.ename;
        this.eprojects[0] = null;
    }
    
}
public class GRPA3
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
    	   String project[] = {"P001","P002","P003"};
        //Enter the id of employee
        String id = s.nextLine();
        //Enter the name of employee
        String name = s.nextLine();
        
        Employee e1 = new Employee(id,name,project);
        Employee e2 = new Employee(e1); 
        //The copy constructor must copy all the data members. 
       
        e1.mutator();
        
        e2.display();
    }
}
