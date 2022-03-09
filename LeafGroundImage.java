package week2.day2.seleniumhomework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundImage {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//div[@class='large-6 small-12 columns']/img")).click();
		driver.findElement(By.xpath("(//img[@class='wp-categories-icon svg-image'])[4]")).click();
		System.out.println("The image is broken :"+driver.findElement(By.xpath("(//div[@class='row']//img)[2]")).isEnabled());
		driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']//img)[3]")).click();
		driver.close();

	}

}
