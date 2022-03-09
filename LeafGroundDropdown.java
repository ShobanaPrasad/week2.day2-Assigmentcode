package week2.day2.seleniumhomework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement dropdown1  = driver.findElement(By.id("dropdown1"));
		Select drop1 = new Select(dropdown1);
		drop1.selectByIndex(4);
		WebElement dropdown2 = driver.findElement(By.name("dropdown2"));
		Select drop2= new Select(dropdown2);
		drop2.selectByVisibleText("UFT/QTP");
		WebElement dropdown3= driver.findElement(By.id("dropdown3"));
		Select drop3 = new Select(dropdown3);
		drop3.selectByValue("2");
		Thread.sleep(2000);
		WebElement options = driver.findElement(By.xpath("//select[@class = 'dropdown']"));
		Select select = new Select(options);
		java.util.List<WebElement> listoptions = select.getOptions();
		for (int i=0;i<listoptions.size();i++)
		{
			System.out.println(listoptions.get(i).getText());
		}
		
		//System.out.println("The getTest: " +driver.findElement(By.className("dropdown")).getText());
		driver.findElement(By.xpath("(//div[@class='example']//select)[5]")).sendKeys("Loadrunner");
		driver.findElement(By.xpath("(//div[@class='example']//select)[6]")).sendKeys("Selenium");

	}

}
