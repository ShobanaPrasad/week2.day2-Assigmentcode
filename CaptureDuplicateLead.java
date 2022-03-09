package week2.day2.seleniumhomework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureDuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();		 
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();	
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		 driver.findElement(By.linkText("Email")).click();
		 driver.findElement(By.xpath("//input[@name = 'emailAddress']")).sendKeys("shobapp@gmail.com");
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("(//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click(); 
		 String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		 System.out.println(text);
         driver.findElement(By.linkText("Duplicate Lead")).click();
		 System.out.println(driver.getTitle());
		 driver.findElement(By.className("smallSubmit")).click(); String text1 =
		 driver.findElement(By.id("viewLead_firstName_sp")).getText();
		 System.out.println(text1);
		 if(text.equals(text1)) {
								  
		System.out.println("The lead name is duplicate");
								  
		} else 
		{ 
			System.out.println("The lead name is not duplicate"); 
			
		}
								 
		 driver.close();	
			
			
	}
		
	}

