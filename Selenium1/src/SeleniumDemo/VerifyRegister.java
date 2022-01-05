package SeleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyRegister {
	
	//YEAR-MONTH-DATE

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Automationsoftware\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='radiooptions' and @value='FeMale']")).click();
		
		WebElement month=driver.findElement(By.xpath("//select[@placeholder='Month']"));
		WebElement year=driver.findElement(By.xpath("//select[@placeholder='Year']"));
		WebElement day=driver.findElement(By.xpath("//select[@placeholder='Day']"));
		
		
		Select mth=new Select(month);
		Select yr=new Select(year);
		Select dy=new Select(day);
		
		List<WebElement>monthcount= mth.getOptions();
		System.out.println(monthcount.size());
		List<WebElement>yearcount= yr.getOptions();
		System.out.println(yearcount.size());
		List<WebElement>daycount= dy.getOptions();
		System.out.println(daycount.size());
		
		for(int i=0;i<monthcount.size();i++)
		{
			System.out.println(monthcount.get(i).getText());
		}
		
		System.out.printf(yearcount.get(1).getText());
		System.out.println( yearcount.get(100).getText());
				
		mth.selectByIndex(6);
		yr.selectByIndex(99);
		dy.selectByIndex(15);
	}

}
