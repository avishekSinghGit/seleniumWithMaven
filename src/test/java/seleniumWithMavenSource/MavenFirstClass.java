package seleniumWithMavenSource;

import static org.testng.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MavenFirstClass {
	@Test(groups= {"sanity"})
	public void methodOne() {

		System.out.println("First Maven Method =============>");
	}

	@Test(groups= {"sanity"})
	public void methodTwo() {

		System.out.println("Second Maven Method1 =============>");
	}

	@Test(groups= {"sanity"})
	public void methodThree() {

		System.out.println("Third Maven Method1 =============>");
	}
}
