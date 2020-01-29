package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IRTC {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Selinum\\driver\\chromedriver.exe");
		
		WebDriver dr= new ChromeDriver();
		dr.get("https://www.irctc.co.in/nget/train-search");
		WebElement tet = dr.findElement(By.xpath(("(//input[@type='text'])[1]")));
		tet.sendKeys("MS");
		tet.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		WebElement to = dr.findElement(By.xpath(("(//input[@type='text'])[2]")));
		to.sendKeys("VM");
		to.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		WebElement date = dr.findElement(By.xpath(("(//input[@type='text'])[3]")));
		date.sendKeys("15-01-2020");
		date.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		dr.findElement(By.xpath("//*[@id=\'journeyClass\']/div/label")).click();						
		Thread.sleep(3000);
		dr.findElement(By.xpath("//*[@id=\'journeyClass\']/div/div[4]/div/ul/li[10]/span")).click();
 		Thread.sleep(3000);
		
		
	}

}
