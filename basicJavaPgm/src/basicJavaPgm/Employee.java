package basicJavaPgm;

public class Employee {
    public int id;
    public String name;
    public int sal;

Employee(int id,String name,int sal){
	 this.id=id;
	 this.name=name;
	 this.sal=sal;
	}

public void display() {
	System.out.println("Id :"+id);
	System.out.println("Name:"+name);
	System.out.println("Salary:"+sal);
}

	public static void main(String[] args) {
		Employee emp1=new Employee(1,"Manvitha",30000);
		Employee emp2=new Employee(2,"Rachana",40000);
		emp1.display();
		emp2.display();
	}
}

