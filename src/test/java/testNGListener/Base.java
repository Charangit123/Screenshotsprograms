package testNGListener;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	static WebDriver driver;
	public static void initilisation() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://mvnrepository.com/artifact/commons-io/commons-io/2.11.0");
	}
	
	public  void failed( String testmethod) {
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File("C:\\Users\\user1\\eclipse-workspace\\screensh\\Screenshot"+"\\"+testmethod+".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
