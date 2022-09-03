package methodoverriding;

public class AxisBank extends HdfcBank {

	@Override
	public void fixed() {
System.out.println("Fixed Percentage is 60%");
//		super.fixed();
	}
	
public static void main(String[] args) {
	AxisBank a=new AxisBank();
	a.savings();
	a.deposit();
	a.fixed();
}
}
