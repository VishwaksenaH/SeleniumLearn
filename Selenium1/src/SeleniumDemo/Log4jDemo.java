package SeleniumDemo;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4jDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger log =Logger.getLogger(Log4jDemo.class);
        PropertyConfigurator.configure("Log4j.properties");
        
		System.setProperty("webdriver.chrome.driver","C:\\Automationsoftware\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		
		log.info("Launch Browser");
		
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		
		log.info("Opened application");
		
		//String expectedtitle="Demowebstore";
		String expectedtitle="Demo Web Shop. Login";
		String actualtitle=driver.getTitle();
		
		System.out.println(actualtitle);
		log.info("Title value is:"+actualtitle);
		
		if(actualtitle.equals(expectedtitle))
		{
		driver.findElement(By.id("Email")).sendKeys("Naminato@ns.com");
		driver.findElement(By.name("Password")).sendKeys("Namikaze");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		driver.findElement(By.linkText("Log out")).click();
		driver.close();
		}
		else
		{
			System.out.println("You are on the wrong page");
			log.error("Incorrect title");
			driver.close();
		}
	}

}
