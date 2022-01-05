package SeleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagedetails {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Automationsoftware\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		driver.manage().window().maximize();
	
		String title=driver.getTitle();
		int length= title.length();
		
		System.out.println(title);
		System.out.println(length);
		
		String url=driver.getCurrentUrl();
		String actualurl="http://demowebshop.tricentis.com/";
		System.out.println("Current url" + url);
		System.out.println("Actual url" + actualurl);
		
		if(actualurl.equals(url)) 
			System.out.println("you are in correct page");
		else
			System.out.println("you are in wrong page");
		
		String pgesrc=driver.getPageSource();
		Double srclength=(double) pgesrc.length();
		System.out.println("Page source length- "+ srclength);
		
		driver.quit();
		
	
		
		

		
	
	}
}
