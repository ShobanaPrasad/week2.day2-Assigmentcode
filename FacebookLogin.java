package week2.day2.seleniumhomework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://en-gb.facebook.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[1]")).sendKeys("Dhanvi");
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[2]")).sendKeys("Prasad");
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]")).sendKeys("9876534261");
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[5]")).sendKeys("Dhanvi@123");
		WebElement day = driver.findElement(By.id("day"));
		 Select fbday =new Select(day);
		 fbday.selectByVisibleText("12");
			WebElement month = driver.findElement(By.id("month"));
			 Select fbmonth =new Select(month);
			 fbmonth.selectByIndex(6);
				WebElement year = driver.findElement(By.id("year"));
				 Select fbyear =new Select(year);
				 fbyear.selectByValue("1990");	 
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();			
		Boolean r1 = driver.findElement(By.xpath("//label[text()='Female']")).isSelected();
		System.out.println(r1);
		driver.close();

	}

}
