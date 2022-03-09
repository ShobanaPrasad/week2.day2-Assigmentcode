package week2.day2.seleniumhomework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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
		 driver.findElement(By.xpath("//span[text()='Phone']")).click();
		 driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9876543210");
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		 Thread.sleep(2000);
		 WebElement leadId = driver.findElement(By.xpath("(//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		 String text= leadId.getText(); 
		 System.out.println(text);
		 leadId.click();		 
		 driver.findElement(By.className("subMenuButtonDangerous")).click();
		 driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@name='id']")).sendKeys(text);
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click(); 
		 String text3="No records to display"; 
		 String text2 = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
	 if (text3.equals(text2)) {
		 System.out.println("The Record is deleted");
}else
			 { System.out.println("The Record is not deleted"); }
			 
driver.close();
	}
	}


