package pretest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MILU\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.wikipedia.org/");
	    driver.findElement(By.xpath("//*[@id=\"searchInput\"]")).sendKeys("Puppies");
	    driver.findElement(By.xpath("//*[@id=\"search-form\"]/fieldset/button/i")).click();
	
	
	
	}

}
