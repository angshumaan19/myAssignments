package week2day2dailyassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLeadAssignment2Case2DeleteLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps/control/main");
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebElement testuser = driver.findElement(By.id("username"));
        testuser.sendKeys("DemoSalesManager");
        WebElement testpassword = driver.findElement(By.name("PASSWORD"));
        testpassword.sendKeys("crmsfa");
        WebElement login = driver.findElement(By.className("decorativeSubmit"));
        login.click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Find Leads")).click();
        driver.findElement(By.xpath("//span[text()='Phone']")).click();
        driver.findElement(By.name("phoneAreaCode")).sendKeys("003");
        driver.findElement(By.name("phoneNumber")).sendKeys("9836533195");
        driver.findElement(By.className("x-btn-text")).click(); // //button[text()='Find Leads'] - NO data is showing
	}

}
