package week2day2dailyassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestLeadAssignment4Case3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
        driver.get("https://www.leafground.com/select.xhtml");
       
        //Which is your favorite UI Automation tool?
        WebElement eleuserSelectAutomationTool = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
        Select dd1 = new Select(eleuserSelectAutomationTool);
        dd1.selectByVisibleText("Selenium"); 
        
        //Choose your preferred country.
        driver.findElement(By.xpath("//label[text()='Select Country']")).click();
        driver.findElement(By.xpath("//li[text()='India']")).click();
        
        //Confirm Cities belongs to Country is loaded
        driver.findElement(By.xpath("//label[text()='Select City']")).click();
        driver.findElement(By.xpath("//li[text()='Chennai']")).click();
        
        //Choose the Course
        //driver.findElement(By.xpath("//input[@placeholder='Choose Course']")).click(); //THis is not working
       // driver.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click();
        
        //Choose language randomly
        driver.findElement(By.xpath("//label[text()='Select Language']")).click(); //THis is not working
        driver.findElement(By.xpath("//li[text()='English']")).click();
        
       //Select 'Two' irrespective of the language chosen
        driver.findElement(By.xpath("//label[text()='Select Values']")).click(); //THis is not working
        driver.findElement(By.xpath("//li[text()='Two']")).click();
        
	}

}
