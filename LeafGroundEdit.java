package week2.day2.seleniumhomework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundEdit {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();		 
		 driver.get("http://leafground.com/pages/Edit.html");
		 driver.manage().window().maximize();	
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.findElement(By.id("email")).sendKeys("shobapp@gmail.com");
		 driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys(" TestLeaf"+ Keys.TAB); 
		 System.out.println(driver.findElement(By.xpath("(//input[@name='username'])[1]")).getAttribute("value"));
		 driver.findElement(By.xpath("(//div[@class='example']//input)[4]")).clear();
		 System.out.println("Is Enabled "+driver.findElement(By.xpath("(//div[@class='example']//input)[5]")).isEnabled());
		   
         driver.close();
	}

}
