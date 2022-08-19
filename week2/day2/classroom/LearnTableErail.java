package week2.day2.classroom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnTableErail {
	public static void main(String[] args) {
		WebDriverManager.chromiumdriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://erail.in/");
		WebElement elementFromstn = driver.findElement(By.xpath("//input[@id='txtStationFrom']"));
		elementFromstn.clear();
		elementFromstn.sendKeys("MS",Keys.TAB);
		
		WebElement elementToStn = driver.findElement(By.xpath("//input[@id='txtStationTo']"));
		elementToStn.clear();
		elementToStn.sendKeys("PDY",Keys.TAB);
		
		WebElement elementSortDate = driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']"));
		elementSortDate.click();
		
		List<WebElement> elementsRow = driver.findElements(By.xpath("(//table)[3]/tbody/tr"));
		List<WebElement> elementsCols = driver.findElements(By.xpath("(//table)[3]/tbody/tr[1]/td"));

		for(int i=1;i <= elementsRow.size();i++)
		{
			for(int j=1;j <= 9;j++)
			{
				WebElement elementTrainData = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']/tbody/tr["+i+"]/td["+j+"]"));
				String text = elementTrainData.getText();
				System.out.print(text+"	");
			}
			System.out.println();
		
		}
		}
	}


