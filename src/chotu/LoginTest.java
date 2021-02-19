package chotu;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {
	WebDriver driver;


	public static void main(String[] args) {
		LoginTest obj = new LoginTest();
		obj.setup();
		obj.login();
		obj.close();
	}
	
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver","/home/snehakrishnatec/Downloads/chromedriver");// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","/home/snehakrishnatec/Downloads/geckodriver");
		// driver = new ChromeDriver();
		 driver = new FirefoxDriver();
		
		driver.get("https://www.simplilearn.com/");
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	}
	public void login() {                   
		
		WebElement lnklogin = driver.findElement(By.linkText("Log in"));
		lnklogin.click();
		
		WebElement editUsername = driver.findElement(By.name("user_login"));
        
        editUsername.sendKeys("abc@xyz.com");
        
        WebElement editPwd = driver.findElement(By.name("user_pwd"));
        
        editPwd.sendKeys("124");
        
        WebElement chkBox= driver.findElement(By.className("rememberMe"));
        
        chkBox.click();
        
        WebElement btnPwd= driver.findElement(By.name("btn_login"));
        
        btnPwd.click();            
        
        WebElement error = driver.findElement(By.id("msg_box"));
        
        String ActError = error.getText();
        
        String ExpError = "The email or password you have entered is invalid.";
        
        if(ActError.equals(ExpError)) {
            
            System.out.println("TC Passed");
            
        }else {
            
            System.out.println("TC Failed");
        }
        
    }
    public void close() {
		driver.quit();
	}

}
