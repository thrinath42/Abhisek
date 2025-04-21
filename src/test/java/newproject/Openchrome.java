package newproject;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Openchrome {
	public static void main(String[] args) throws IOException, InterruptedException {
		Random r = new Random();
		int num = r.nextInt(1000);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srclaptop = ts.getScreenshotAs(OutputType.FILE);
		
		File targer = new File("./screns" + num + ".jpg");
		FileHandler.copy(srclaptop, targer);
		WebElement elesearch = driver.findElement(By.id("APjFqb"));
		Thread.sleep(num+567);
		elesearch.sendKeys("laptop", Keys.ENTER);
		String textlap = driver.findElement(By.xpath("//h3[contains(.,'Laptop')]")).getText();
		if(textlap.contains("Laptop"))
			System.out.println("laptop details are displayed");
		File srcbike = ts.getScreenshotAs(OutputType.FILE);
		File targerbile = new File("./screns" + num + ".jpg");
		FileHandler.copy(srcbike, targerbile);
		elesearch.sendKeys("bike", Keys.ENTER);
		String textbike = driver.findElement(By.xpath("//h3[contains(.,'Bike')]")).getText();
		if(textlap.contains("Bike"))
			System.out.println("bikes details are displayed");
		File srcb = ts.getScreenshotAs(OutputType.FILE);
		File targetb = new File("./screns" + num + ".jpg");
		FileHandler.copy(srcb, targetb);
		
		elesearch.sendKeys("book", Keys.ENTER);
		String textbook = driver.findElement(By.xpath("//h3[contains(.,'Books')]")).getText();
		if(textlap.contains("Books"))
			System.out.println("books details are displayed");
		File srcbook = ts.getScreenshotAs(OutputType.FILE);
		File targetbook = new File("./screns" + num + ".jpg");
		FileHandler.copy(srcbook, targetbook);
		
		
		driver.quit();
	}
}
