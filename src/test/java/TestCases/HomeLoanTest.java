package TestCases;
import org.testng.annotations.Test;


public class HomeLoanTest extends BaseClass {
	
	@Test
	public void test1() {
		
		System.out.println("Inside Home Loan test1");
	}

	@Test(groups= {"sanity"})
	public void test2() {
		
		System.out.println("Inside Home Loan test2");
	}
	
	
	
	
}
