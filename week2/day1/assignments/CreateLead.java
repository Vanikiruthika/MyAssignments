package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className	("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Infosys");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("vanikiruthika");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Dhandapani");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Vani");
		driver.findElement(By.name("departmentName")).sendKeys("CSE");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Adding an employee");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vanikiruthikad@gmail.com");
		
		WebElement elementState = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select statedd=new Select(elementState);
		statedd.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		System.out.println("Title of the page: "+ driver.getTitle());
		
	}

}
