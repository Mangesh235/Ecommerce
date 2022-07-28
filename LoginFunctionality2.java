package demo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginFunctionality2 {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Shreyas\\Files\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  

		  driver.get("http://automationpractice.com/index.php");
		  driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		  driver.manage().window().maximize();
		  
		  
		  driver.findElement(By.linkText("Sign in")).click();
		  
		  
		  driver.findElement(By.cssSelector("[name='email_create']")).sendKeys("mlasrekar@gmail.com");
		  
		  
		  driver.findElement(By.xpath("//button[@name=\"SubmitCreate\"]")).click();
		  
		  //Select Title
		  driver.findElement(By.xpath("//input[@id=\"id_gender1\"]")).click();
		  driver.findElement(By.name("customer_firstname")).sendKeys("Mangesh");
		  driver.findElement(By.name("customer_lastname")).sendKeys("Lasrekar");
		  driver.findElement(By.id("passwd")).sendKeys("Bunny@235");
		  
		  // Enter your address
		  driver.findElement(By.id("firstname")).sendKeys("Mangesh");
		  driver.findElement(By.id("lastname")).sendKeys("Lasrekar");
		  driver.findElement(By.id("company")).sendKeys("Nike");
		  driver.findElement(By.id("address1")).sendKeys("Ram Nagar yerwad");
		  driver.findElement(By.id("city")).sendKeys("Pune");
		  
		 
		  WebElement statedropdown=driver.findElement(By.name("id_state"));
		  Select oSelect=new Select(statedropdown);
		  oSelect.selectByValue("4");

		  driver.findElement(By.name("postcode")).sendKeys("411006");
		  
		  
		  WebElement countrydropDown=driver.findElement(By.name("id_country"));
		  Select oSelectC=new Select(countrydropDown);
		  oSelectC.selectByVisibleText("India");
		  

	}

}
