package week2day2dailyassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLeadAssignment4Case2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeDriver driver= new ChromeDriver();
        driver.get("https://www.leafground.com/button.xhtml");
        
        //To get title of the page
       //driver.findElement(By.xpath("//span[text()='Click']")).click();
       System.out.println(driver.getTitle());
        
        //To get color of the [Save] button
        System.out.println((driver.findElement(By.xpath("//span[text()='Save']")).getCssValue("color")));
        
        //To get the Position of the the [Submit button]
        System.out.println(driver.findElement(By.xpath("(//span[text()='Submit'])[1]")).getLocation());
        
        //to get the Size of the [submit] button]
        System.out.println(driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize());
	}

}
