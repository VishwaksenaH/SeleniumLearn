package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehr {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Automationsoftware\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");Thread.sleep(1000);
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='panelTrigger']")).click();Thread.sleep(1000);
		//driver.findElement(By.xpath("//a[@class='panelTrigger activated-welcome']"));Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='/index.php/auth/logout']")).click();Thread.sleep(1000);
		driver.close();
		
		
	}
}
