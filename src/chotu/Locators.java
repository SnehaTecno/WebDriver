package chotu;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/home/snehakrishnatec/Downloads/chromedriver");// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","/home/snehakrishnatec/Downloads/geckodriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.simplilearn.com/");
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		WebElement lnklogin = driver.findElement(By.xpath("//a[@class='login']"));
		lnklogin.click();
		
		WebElement username = driver.findElement(By.xpath("//input[@name='user_login']"));
        
        username.sendKeys("abc@xyz.com");
	}

}
