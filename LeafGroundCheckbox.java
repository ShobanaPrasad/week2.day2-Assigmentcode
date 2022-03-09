package week2.day2.seleniumhomework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundCheckbox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();		 
		 driver.get("http://leafground.com/pages/checkbox.html");
		 driver.manage().window().maximize();	
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 boolean sql = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).isSelected();
		 System.out.println(sql);
		 boolean check = driver.findElement(By.xpath("(//input[@type='checkbox'])[6]")).isSelected(); 
		 System.out.println(check);
		 driver.close();

	}

}
