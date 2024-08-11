package FitPeo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//tast1
		driver.get("http://orangehrm.qedgetech.com/");
		String currentURL1=driver.getCurrentUrl();
		System.out.println(currentURL1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Qedge123!@#");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		driver.findElement(By.xpath("//b[normalize-space()='My Info']")).click();
		driver.findElement(By.xpath("//b[normalize-space()='My Info']")).click();
		JavascriptExecutor Js=(JavascriptExecutor)driver;
		WebElement element=driver.findElement(By.xpath("//input[@id='btnAddAttachment']"));
		Js.executeScript("arguments[0].scrolltoView()", element); 
		
		

	}

}
