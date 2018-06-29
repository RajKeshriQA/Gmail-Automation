
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmail {

	
	public void NumberOfUnreadEmails(WebDriver driver)
	{
		String Value=driver.findElement(By.cssSelector(".J-Ke.n0")).getAttribute("aria-label");
		String NumberOfUnreadMessages=Value.substring(6);
		System.out.println(NumberOfUnreadMessages);
	}

	public static void main(String args[]) throws InterruptedException 
	{
		Gmail gmail= new Gmail();
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\rajkeshri\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://accounts.google.com");
 

		driver.findElement(By.id("identifierId")).sendKeys("Enter your Mail");
		driver.findElement(By.id("identifierNext")).click();
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);

		driver.findElement(By.xpath("//div//input[@class='whsOnd zHQkBf' and @type='password']")).sendKeys("Enter password");
		driver.findElement(By.id("passwordNext")).click();
	
	
		driver.findElement(By.xpath("//a[@class='WaidBe']")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\":hd\"]/div/div")).click();
		
		driver.findElement(By.name("to")).click();
		driver.findElement(By.name("to")).clear();
		driver.findElement(By.name("to")).sendKeys("Enter Recepient Mail Id");
		driver.findElement(By.name("subjectbox")).click();
		driver.findElement(By.name("subjectbox")).clear();
		driver.findElement(By.name("subjectbox")).sendKeys("your subject");
		
		driver.findElement(By.xpath( "//*[@id=':lx']")).click();
		
		driver.findElement(By.xpath("//*[@id=\"gb\"]/div[1]/div[1]/div[2]/div[5]/div[1]/a/span")).click();
		
		driver.findElement(By.xpath( "//*[@id=\"gb_71\"]")).click();
		
		//driver.close();
		//driver.quit();
			
	}

}
