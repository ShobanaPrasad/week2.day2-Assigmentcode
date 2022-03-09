package week2.day2.seleniumhomework;

import java.time.Duration;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundLink {

	public static void main(String[] args) throws InterruptedException {
		    WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://leafground.com/pages/Link.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.findElement(By.linkText("Go to Home Page")).click();
			System.out.println("The home is displayed "+driver.findElement(By.xpath("//h1[@class='wp-heading']")).isDisplayed());
			driver.findElement(By.xpath("(//img[@class='wp-categories-icon svg-image'])[3]")).click();
			System.out.println(driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href"));
			System.out.println(driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']/a)[3]")).getAttribute("href"));
				int j=0;
				List<WebElement> LinksList = driver.findElements(By.xpath("//div[@class='large-6 small-12 columns']/a"));
				for (int i = 0; i < LinksList.size(); i++) {
					System.out.println(LinksList.get(i).getAttribute("href"));
					 j=i;
				}

				System.out.println("Total no link is "+j);
				
				driver.navigate().to(driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']/a)[3]")).getAttribute("href"));
driver.close();
	}

}
