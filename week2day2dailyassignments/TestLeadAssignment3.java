package week2day2dailyassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLeadAssignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeDriver driver= new ChromeDriver();
        driver.get("https://acme-test.uipath.com/login");
        driver.manage().window().maximize();
        driver.findElement(By.name("email")).sendKeys("kumar.testleaf@gmail.com");
        driver.findElement(By.name("password")).sendKeys("leaf@12");
        driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
        System.out.println("THe title of the page is :" + driver.getTitle());
        driver.findElement(By.linkText("Log Out")).click();
        driver.close();
        
		
	}

}
