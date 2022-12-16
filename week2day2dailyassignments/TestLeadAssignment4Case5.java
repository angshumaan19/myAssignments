package week2day2dailyassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLeadAssignment4Case5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver= new ChromeDriver();
        driver.get("https://www.leafground.com/radio.xhtml");
        
        //Your most favorite browser
        driver.findElement(By.xpath("//label[text()='Chrome']")).click();
		
        //UnSelectable
        driver.findElement(By.xpath("//label[text()='Chennai']")).click();
        
        //Find the default select radio button
        System.out.println(driver.findElement(By.xpath("//label[text()='Safari']")).isEnabled());
        
        //Select the age group (only if not selected)
        driver.findElement(By.xpath("//label[text()='1-20 Years']")).click();
		
	}

}
