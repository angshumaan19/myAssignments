package week2day2dailyassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v106.browser.Browser;

public class TestLeadAssignment2Case4EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver= new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps/control/main");
        driver.manage().window().maximize();
        
        String expectedstring = "Tata Consultancy Services (17975)";
        
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
        driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Angshumaan");
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        driver.findElement(By.linkText("17975")).click();
        System.out.println("Title of the Page :" + driver.getTitle() );
        driver.findElement(By.linkText("Edit")).click();
        //driver.findElement(By.name("companyName")).clear(); // It is not getting cleared
        //driver.findElement(By.name("companyName")).sendKeys("Tata Consultancy Services");//It is not getting updated
        driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
        driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("Tata Consultancy Services");
        driver.findElement(By.xpath("//input[@value='Update']")).click();
       
        String actaulstring = driver.findElement(By.xpath("//span[text()='Tata Consultancy Services (17975)']")).getText();
        if (actaulstring.equals(expectedstring))
        System.out.println("The actual is same as expected  : "+ actaulstring);
        else
        System.out.println("The actual is not same as expected : "+ actaulstring);	
       driver.close();
	}

}
