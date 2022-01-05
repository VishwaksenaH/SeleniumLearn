package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\Automationsoftware\\chromedriver_win32\\chromedriver.exe" );
			WebDriver driver=new ChromeDriver();
			driver.get("http://demowebshop.tricentis.com/register");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//a[@href='/register']"));
			driver.navigate().back();
			Thread.sleep(1000);
			driver.navigate().forward();
			Thread.sleep(1000);
			driver.navigate().to("http://demowebshop.tricentis.com");
			Thread.sleep(1000);
			driver.navigate().refresh();
			//driver.close();
	}

}
