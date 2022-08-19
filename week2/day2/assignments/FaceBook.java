package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
	
		driver.findElement(By.xpath("(//form/div/a)[2]")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.name("firstname")).sendKeys("vanikiruthika");
		driver.findElement(By.name("lastname")).sendKeys("Dhandapani");
		driver.findElement(By.name("reg_email__")).sendKeys("9095157744");
		driver.findElement(By.id("password_step_input")).sendKeys("Testing@123");
		
		WebElement elementDay = driver.findElement(By.xpath("//select[@id='day']"));
		Select dd1=new Select(elementDay);
		dd1.selectByValue("18");
		
		WebElement elementMonth = driver.findElement(By.xpath("//select[@id='month']"));
		Select dd2=new Select(elementMonth);
		dd2.selectByIndex(0);
		
		WebElement elementYear = driver.findElement(By.xpath("//select[@id='year']"));
		Select dd3=new Select(elementYear);
		dd3.selectByVisibleText("1989");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		driver.findElement(By.name("websubmit")).click();
		
		
	}

}
