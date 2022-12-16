package week2day2dailyassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Angshumaan");
		driver.findElement(By.name("lastname")).sendKeys("Ray");
		driver.findElement(By.name("reg_email__")).sendKeys("9836533195");
		driver.findElement(By.name("reg_passwd__")).sendKeys("123456");
		
		  WebElement eleuserday = driver.findElement(By.id("day"));
	        Select dd1 = new Select(eleuserday);
	        dd1.selectByValue("19");
	      WebElement eleuserdmonth = driver.findElement(By.id("month"));
	        Select dd2 = new Select(eleuserdmonth);
	        dd2.selectByVisibleText("Oct");
	      WebElement eleuserdyear = driver.findElement(By.id("year"));
	        Select dd3 = new Select(eleuserdyear);
	        dd3.selectByIndex(39);
	      
	     // driver.findElement(By.className("_58mt")).click();
	      driver.findElement(By.xpath("//label[text()='Female']")).click();
	        
	     

		
		
	}

}
