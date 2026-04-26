package pgm1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ResultTest {
	
	@Test
	public void testpass() {
		Assert.assertEquals(Result.display(55),"pass");
	}
	
	@Test
	public void testfail() {
		Assert.assertEquals(Result.display(55),"fail");
	}
	@Test
	public void testinvalid() {
		Assert.assertEquals(Result.display(55),"invalid");
	}
	
}
