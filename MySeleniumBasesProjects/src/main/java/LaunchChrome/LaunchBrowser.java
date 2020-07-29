package LaunchChrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s;
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		
		WebDriver driver =new FirefoxDriver();
		 driver.get("http://www.google.com");
		 System.out.println(driver.getTitle());
		 s=driver.getTitle();
		 
		 if (s=="Google")
		 {
			 System.out.println("Test case passed");
		 }
		 else
		 {
			 System.out.println("Test case failed");
	}

}
}

