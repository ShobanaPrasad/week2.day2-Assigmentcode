package week2.day2.seleniumhomework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class CompanyNameEditLead {

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
		 driver.findElement(By.xpath("(//label[contains(text(),'First name:')])[1]/following::input[@name='firstName'][3]")).sendKeys("shobana");
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		 Thread.sleep(1000);
		 //driver.findElement(By.xpath("(//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		 WebElement existCompanyName = driver.findElement(By.xpath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-companyName ']//a)[1]"));
		 String existtext = existCompanyName.getText();		 
		 existCompanyName.click();		 
		 System.out.println(driver.getTitle());
		 driver.findElement(By.xpath("//a[text() = 'Edit']")).click();
		 driver.findElement(By.id("updateLeadForm_companyName")).clear();
		 WebElement attr = driver.findElement(By.id("updateLeadForm_companyName"));
		 attr.sendKeys("Wipro");
		 String val = attr.getAttribute("value");
		 driver.findElement(By.xpath("//input[@value = 'Update']")).click();		 	
		if(existtext.equals(val))
		{
			System.out.println("The Company name are similar:"+ existtext +", "+ val);
			
		}
		else {
			 System.out.println("The Company name is different:"+ existtext +", "+ val);
		 } 
		driver.close();
		}
		

	}

