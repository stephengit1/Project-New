package methodoverloading;

public class Sample
{
public void details() {
System.out.println("Employee Details ============");
	}


public void details(String name) {
System.out.println("Employee name is  "+name);
	}


public void details(int age) {
System.out.println("Employee age is  "+age);
	}


public void details(char gender) {
System.out.println("Employee gender is  "+gender);
	}


public void details(float salary) {
System.out.println("Employee Salary is  "+salary);
	}

public static void main(String[] args) {
Sample s=new Sample();
s.details();
s.details("Venkat");
s.details(27);
s.details('M');
s.details(900000.876f);
}
}
