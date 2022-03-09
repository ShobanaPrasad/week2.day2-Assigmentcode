package week2.day2.seleniumhomework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundButton{

	public static void main(String[] args) throws InterruptedException {
	    WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("home")).click();
		Thread.sleep(2000);
		System.out.println("The home is displayed "+driver.findElement(By.xpath("//h1[@class='wp-heading']")).isDisplayed());
		driver.findElement(By.xpath("(//img[@class='wp-categories-icon svg-image'])[2]")).click();
		//driver.navigate().back();
		System.out.println("The location: "+driver.findElement(By.id("position")).getLocation());
		System.out.println("The Color "+ driver.findElement(By.id("color")).getCssValue("background-color"));
		System.out.println("The Size = "+ driver.findElement(By.id("size")).getSize());
		driver.close();
		

	}

}
