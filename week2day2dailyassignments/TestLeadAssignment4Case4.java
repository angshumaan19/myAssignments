package week2day2dailyassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLeadAssignment4Case4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			ChromeDriver driver= new ChromeDriver();
	        driver.get("https://www.leafground.com/checkbox.xhtml");
	       
	        //Basic Checkbox
	        driver.findElement(By.xpath("//span[text()='Basic']")).click();
	        
	        //Notification
	        driver.findElement(By.xpath("//span[text()='Ajax']")).click();
	        
	        //Choose your favorite language(s)
	        driver.findElement(By.xpath("//label[text()='Java']")).click();
	        driver.findElement(By.xpath("//label[text()='Javascript']")).click();
	        
	        //Tri State Checkbox
	        System.out.println(driver.findElement(By.xpath("(//div[@id='j_idt87:ajaxTriState'])/div[2]")).isEnabled());
	        
	        //Toggle Switch 
	        driver.findElement(By.xpath("(//div[@id='j_idt87:j_idt100'])/div[2]")).click();
	        
	        //Verify if check box is disabled -/Not able to identify the xpath
	        System.out.println(driver.findElement(By.xpath("")).isEnabled());
	        
	        //Select Multiple /Not able to identify the xpath
	      //driver.findElement(By.xpath("")).click();
		
	}

}
