package week2day2dailyassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestLeadAssignment2Case1CreateContact {

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
        driver.findElement(By.linkText("Contacts")).click();
        driver.findElement(By.linkText("Create Contact")).click();
        
        driver.findElement(By.id("firstNameField")).sendKeys("Angshumaan");
        driver.findElement(By.id("lastNameField")).sendKeys("Ray");
        driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Angshu");
        driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Ray");
        driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Testing");
        driver.findElement(By.id("createContactForm_description")).sendKeys("NA NA NA NA");
        driver.findElement(By.xpath("//input[@id='createContactForm_primaryPhoneAreaCode']")).sendKeys("003");
        driver.findElement(By.xpath("//input[@id='createContactForm_primaryPhoneNumber']")).sendKeys("9836533195");
        driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("angshumaan19@gmail.com");
        
       
        WebElement eleuserStateProvince = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
        Select dd1 = new Select(eleuserStateProvince);
        dd1.selectByVisibleText("New York");
        
        //driver.findElement(By.xpath("//input[@id='ext-gen599']")).click();
        driver.findElement(By.xpath("//input[@name='submitButton']")).click(); /// - THis step is not working whatever location I use
        
        driver.findElement(By.linkText("Edit")).click();
        driver.findElement(By.id("updateContactForm_description")).clear();
        driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("I am learning Selenium");
        driver.findElement(By.xpath("//input[@value='Update']")).click();
       
        System.out.println("Title of the page is :" + driver.getTitle());
        //driver.close();
        
        
        
      
        
        
		
		
		
	}

}
