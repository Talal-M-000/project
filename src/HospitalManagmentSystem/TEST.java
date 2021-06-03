package HospitalManagmentSystem;

import static org.junit.Assert.*;

public class TEST {

	public void test() {
   		TestCheck obj=new TestCheck();
		int output=obj.testcheck();
		assertEquals(1, output);
	} 

}