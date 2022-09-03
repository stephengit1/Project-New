package fullyabs;

public class Book implements Sample 
{

@Override
public void ram() {
System.out.println("Ram become a business man");	
}
	
@Override
public void waran() {
System.out.println("Waran become a Doctor");		
	}

@Override
public void jerald() {
System.out.println("Ram become a an Engineer");		
	}

public static void main(String[] args) {
Book b=new Book();
b.ram();
b.waran();
b.jerald();
}
}
