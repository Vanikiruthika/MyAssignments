package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {
	public static void main(String[] args) throws InterruptedException {
		
		/*Delete Lead:
			1	Launch the browser
			2	Enter the username
			3	Enter the password
			4	Click Login
			5	Click crm/sfa link
			6	Click Leads link
			7	Click Find leads
			8	Click on Phone
			9	Enter phone number
			10	Click find leads button
			11	Capture lead ID of First Resulting lead
			12	Click First Resulting lead
			13	Click Delete
			14	Click Find leads
			15	Enter captured lead ID
			16	Click find leads button
			17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
			18	Close the browser (Do not log out)*/
			
		//Driver setup and login page
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps");
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className	("decorativeSubmit")).click();
		
		//Find leads using phone number
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();	
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.name("phoneCountryCode")).clear();
		driver.findElement(By.name("phoneCountryCode")).sendKeys("91");
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9095157744");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);	
		//getting first lead data from data displayed
		
		WebElement elementFirstLead = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		String textLeadId = elementFirstLead.getText();
		System.out.println("First Lead id :"+textLeadId );
		elementFirstLead.click();
		
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();	
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.name("phoneCountryCode")).clear();
		driver.findElement(By.name("phoneCountryCode")).sendKeys("91");
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9095157744");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		String textDisplay = driver.findElement(By.className("x-paging-info")).getText();
		//String textDisplay = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		System.out.println(textDisplay);
	if(textDisplay.contains("No records to display"))
		{
			System.out.println("Successful deletion");
		}
		else
		{
			System.out.println("Record not deleted");
		}
		
	}

}
