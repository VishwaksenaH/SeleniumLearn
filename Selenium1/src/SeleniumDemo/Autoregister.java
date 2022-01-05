package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autoregister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Automationsoftware\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Thinkpad");
		driver.findElement(By.id("LastName")).sendKeys("Lenovo");
		driver.findElement(By.id("Email")).sendKeys("LenovTp@le.com");
		driver.findElement(By.id("Password")).sendKeys("Lenovo1");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("Lenovo1");
		driver.findElement(By.id("register-button")).click();
	}

}
