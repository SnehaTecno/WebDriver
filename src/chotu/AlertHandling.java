package chotu;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


public class AlertHandling {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/home/snehakrishnatec/Downloads/chromedriver");// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","/home/snehakrishnatec/Downloads/geckodriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
driver.get("http://demo.guru99.com/test/delete_customer.php");
        
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        
         driver.findElement(By.name("cusid")).sendKeys("53920");                    
         driver.findElement(By.name("submit")).submit();
         
         Alert obj = driver.switchTo().alert();
         
         System.out.println(obj.getText());
         
         obj.accept();
		
	}
}

