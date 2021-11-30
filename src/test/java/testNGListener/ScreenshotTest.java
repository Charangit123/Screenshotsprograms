package testNGListener;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(CustomListener.class)
public class ScreenshotTest extends Base {
	@BeforeMethod
	public void setUp() {
		initilisation();
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

	@Test
	public void takeShot1() {
		Assert.assertEquals(false, true);
	}
	@Test
	public void takeShot2() {
		Assert.assertEquals(false, true);
	}
	@Test
	public void takeShot3()  {
		Assert.assertEquals(false, true);
	}
	@Test
	public void takeShot4() {
		Assert.assertEquals(false, true);
	}
}
