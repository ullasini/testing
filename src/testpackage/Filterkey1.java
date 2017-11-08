package testpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.UUID;
public class Filterkey1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MILU\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String uuid = UUID.randomUUID().toString();
		uuid = uuid + "@gmail.com";
		driver.get("https://staging.filtereasy.com/");
		driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/span[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"navbar-mobile\"]/div/a[1]")).click();
	    driver.findElement(By.xpath("//*[@id=\"pick-your-filters\"]/div[1]/div[1]/div[2]/div/div/div/input")).click();
	    Select s = new Select(driver.findElement(By.xpath("//*[@id=\"pick-your-filters\"]/div[1]/div[1]/div/div/div/div/div[2]/div[2]/select")));
	    s.selectByVisibleText("8 x 24 x 1");
	    driver.findElement(By.xpath("//*[@id=\"pick-your-filters\"]/div[2]/div[2]/div/div/input")).click();
	    driver.findElement(By.xpath("//*[@id=\"pick-your-filters\"]/div[1]/div/div/div/div[1]/div[1]/div[2]/div[2]/div/div/input")).click();
	    driver.findElement(By.xpath("//*[@id=\"schedule-delivery\"]/div[1]/div[1]/div/div/div[1]/div[2]/div[1]")).click();
	    driver.findElement(By.xpath("//*[@id=\"schedule-delivery\"]/div[2]/div[2]/div/div/input")).click();
	    driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(uuid);
	    driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("Ullasini");
	    driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("Sahoo");
	    driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("732-690-3607");
	    driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("116  trumbell circle");
	    driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Morrisville");
	    Select s1 = new Select(driver.findElement(By.xpath("//*[@id=\"state\"]")));
	    s1.selectByVisibleText("North Carolina");
	    driver.findElement(By.xpath("//*[@id=\"zip\"]")).sendKeys("27560");
	    
	    driver.findElement(By.xpath("//*[@id=\"checkout\"]/div")).click();
	    driver.findElement(By.xpath("//*[@id=\"card-number\"]")).sendKeys("4111-1111-1111-1111");
        driver.findElement(By.xpath("//*[@id=\"card-exp\"]")).sendKeys("03/20");
        driver.findElement(By.xpath("//*[@id=\"card-cvc\"]")).sendKeys("153");
        driver.findElement(By.xpath("//*[@id=\"checkout\"]/div/div[2]/div[3]/div/div/div/input")).click();
	
	}
}