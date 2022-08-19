package week2.day2.classroom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSeleniumXpath {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		
		WebElement elementUsername = driver.findElement(By.xpath("//input[@name='USERNAME']"));
		elementUsername.sendKeys("Demosalesmanager");
		
		WebElement elementPassword = driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]"));
		elementPassword.sendKeys("crmsfa");
		
		WebElement elementLogin = driver.findElement(By.xpath("//input[@class='decorativeSubmit']"));
		elementLogin.click();
		
		WebElement elementcrm = driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]"));
		elementcrm.click();
		
		WebElement elementLeads = driver.findElement(By.xpath("//a[contains(@href,'leads')]"));
		elementLeads.click();
		
		WebElement elementcreateLead = driver.findElement(By.xpath("//a[contains(@href,'createLead')]"));
		elementcreateLead.click();
		
		driver.findElement(By.xpath("(//input[@id='createLeadForm_companyName'])"));
		
	}

}
