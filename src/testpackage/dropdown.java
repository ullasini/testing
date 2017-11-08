package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MILU\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.spicejet.com/");
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
	     s.selectByValue("3");
	     s.selectByIndex(4);
	     s.selectByVisibleText("5 Adults");
	}

}
