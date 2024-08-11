package FitPeo;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v124.page.Page.GetAppIdResponse;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

public class AllTasks {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new FirefoxDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//tast1
		driver.get("https://www.fitpeo.com/");
		String currentURL1=driver.getCurrentUrl();
		System.out.println(currentURL1);
		Thread.sleep(2000);
		//task2
		
		driver.findElement(By.xpath("//div[contains(text(),'Revenue Calculator')]")).click();
		String currentURL2=driver.getCurrentUrl();
		System.out.println(currentURL2);
		driver.findElement(By.xpath("//input[@aria-invalid='false']")).sendKeys("820");
		
		
		//task3
		JavascriptExecutor Js=(JavascriptExecutor)driver;
	   //Js.executeScript("window.scrollTo(500,document.body.scrollHeight)");
		 //Js.executeScript("window.scrollBy(0,500)");
		WebElement element=driver.findElement(By.xpath("//input[contains(@type,'number')]"));
		Js.executeScript("arguments[0].scrollIntoView(true)", element); 
		driver.findElement(By.xpath("//input[contains(@type,'number')]")).click();
		
		driver.findElement(By.xpath(":R57alklff9da:")).sendKeys("820");
		 Thread.sleep(5000);
		//driver.quit();
		
		

	}

}
