package week2.day2.seleniumhomework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();		 
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Contacts")).click();
		 driver.findElement(By.linkText("Create Contact")).click();
		 driver.findElement(By.id("firstNameField")).sendKeys("Firstcontactname");
		 driver.findElement(By.id("lastNameField")).sendKeys("Lastcontactname");
		 driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Firstnamelocal");
		 driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Lastnamelocal");
		 driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Information Technology");
		 driver.findElement(By.id("createContactForm_description")).sendKeys("Information Technology provides various information about of technology");
		 driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("shobapp@gmail.com");
		 WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		 Select ss = new Select(state);
		 ss.selectByVisibleText("New York");		 
		 driver.findElement(By.xpath("//input[@value='Create Contact']")).click();
		 driver.findElement(By.xpath("//a[text()='Edit']")).click();
		 driver.findElement(By.id("updateContactForm_description")).clear();
		 driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("This is important update on the contact");
		 
		 driver.findElement(By.xpath("//input[@value='Update']")).click();
		 System.out.println(driver.getTitle());
		 driver.close();
			
	}

}
