package week2.day1.clasroom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSeleniumDropdown {
public static void main(String[] args) {
	
	//To add driver to the code
	WebDriverManager.chromedriver().setup();
	//open the browser
	ChromeDriver driver=new ChromeDriver();
	//To load an URL
	driver.get("http://leaftaps.com/opentaps");
	//To maximize the browser
	driver.manage().window().maximize();
	
	WebElement elementUsername = driver.findElement(By.id("username"));
	elementUsername.sendKeys("Demosalesmanager");
	
	WebElement elementPassword = driver.findElement(By.name("PASSWORD"));
	elementPassword.sendKeys("crmsfa");
	
	WebElement elementLogin = driver.findElement(By.className("decorativeSubmit"));
	elementLogin.click();
	
	WebElement elementWelcomeMessage = driver.findElement(By.tagName("h2"));
	String text = elementWelcomeMessage.getText();
	System.out.println(text);
	
	
	WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
	elementCRMSFA.click();
	
	WebElement elementcreateLead = driver.findElement(By.linkText("Create Lead"));
	elementcreateLead.click();
	
	WebElement elementCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
	elementCompanyName.sendKeys("Infosys");
	
	WebElement elementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
	elementFirstName.sendKeys("Vanikiruthika");
	
	WebElement elementLastName = driver.findElement(By.id("createLeadForm_lastName"));
	elementLastName.sendKeys("Dhandapani");	

	
	WebElement elementSoureDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
	Select dd=new Select(elementSoureDD);
	dd.selectByIndex(1);

	WebElement elementindustryDD = driver.findElement(By.id("createLeadForm_industryEnumId"));
	Select dd2=new Select(elementindustryDD);
	dd2.selectByVisibleText("Aerospace");
	
	
	WebElement elementOwnership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	Select dd3=new Select(elementOwnership);
	dd3.selectByValue("OWN_PARTNERSHIP");
	//To close the browser
	//driver.close();

			
}
}

