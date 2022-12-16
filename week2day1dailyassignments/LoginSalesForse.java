package week2day1dailyassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSalesForse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://login.salesforce.com");
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("hari.radhakrishnan@quegle.com");
		WebElement passWord = driver.findElement(By.name("pw"));
		passWord.sendKeys("Testleaf$321");
		WebElement login = driver.findElement(By.id("Login"));
		login.click();

	}

}
