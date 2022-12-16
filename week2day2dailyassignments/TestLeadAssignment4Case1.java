package week2day2dailyassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLeadAssignment4Case1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver= new ChromeDriver();
        driver.get("https://www.leafground.com/input.xhtml");
		
      //h5[text()='Type your name']
        //(//input[@type='text'])[2]
        		//Type your name
       driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Angshumaan Ray");
       
       //Append Country to this City.""
     WebElement element = driver.findElement(By.xpath("//input[@name='j_idt88:j_idt91']"));
       String previousText = element.getAttribute("value");
       element.clear();
       element.sendKeys("India, " + previousText);
       
       //Verify if text box is disabled
       System.out.println(driver.findElement(By.xpath("(//h5[text()='Verify if text box is disabled']//following::div)[2]")).isEnabled());
       
       //Clear the typed text.
       driver.findElement(By.xpath("//input[@name='j_idt88:j_idt95']")).clear();
       
       //Retrieve the typed text. Not printing Need help
       System.out.println(driver.findElement(By.xpath("(//h5[text()='Retrieve the typed text.']//following::div)[2]")).getText());
       
       //Type about yourself - Not able to identify the Xpath
       
       
       //Just Press Enter and confirm error message*
       driver.findElement(By.xpath("//input[@name='j_idt106:thisform:age']")).sendKeys(Keys.ENTER);
       System.out.println(driver.findElement(By.xpath("//span[text()='Age is mandatory']")).getText());
       
       //Click and Confirm Label Position Changes //Not sure how to check the position changes
       System.out.println(driver.findElement(By.xpath("//input[@name='j_idt106:float-input']")).getLocation());
       driver.findElement(By.xpath("//input[@name='j_idt106:float-input']")).click();
       System.out.println(driver.findElement(By.xpath("//input[@name='j_idt106:float-input']")).getLocation());
       
       //Type your name and choose the third option - //Not sure how to check the position changes
       
        //Type your name and choose the third option 
       
       //Type your DOB (mm/dd/yyyy) and confirm date chosen
       
       //Type number and spin to confirm value changed
       
       //Type random number (1-100) and confirm slider moves correctly
        
       //Click and Confirm Keyboard appears

       
       
	}

}
