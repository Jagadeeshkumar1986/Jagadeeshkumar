package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseToElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Selinum\\driver\\chromedriver.exe");
WebDriver dr=new ChromeDriver();
dr.get("http://greenstech.in/selenium-course-content.html");
WebElement msc = dr.findElement(By.xpath("//a[text()='COURSES']"));
Actions acc=new Actions(dr);
acc.moveToElement(msc).perform();
Thread.sleep(2000);
WebElement orc = dr.findElement(By.xpath("//span[text()='Oracle Training ']"));
acc.moveToElement(orc).perform();
Thread.sleep(2000);
WebElement dbs = dr.findElement(By.xpath("//span[text()='Oracle DBA Training']"));
acc.moveToElement(dbs).perform();
Thread.sleep(2000);
dbs.click();

	}

}
