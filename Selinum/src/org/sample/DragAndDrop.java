package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Selinum\\driver\\chromedriver.exe");
WebDriver dr=new ChromeDriver();
dr.get("http://demo.guru99.com/test/drag_drop.html");
WebElement fr = dr.findElement(By.id("credit2"));
WebElement to = dr.findElement(By.id("bank"));
Actions act = new Actions(dr);
act.dragAndDrop(fr, to).perform();
Thread.sleep(2000);
WebElement crt = dr.findElement(By.id("fourth"));
WebElement amt = dr.findElement(By.id("amt7"));
act.dragAndDrop(crt, amt).perform();
Thread.sleep(2000);
WebElement crac = dr.findElement(By.id("credit1"));
WebElement cramt = dr.findElement(By.id("loan"));
act.dragAndDrop(crac, cramt).perform();
Thread.sleep(2000);
WebElement sss = dr.findElement(By.id("fourth"));
WebElement kkk = dr.findElement(By.id("amt8"));
act.dragAndDrop(sss, kkk).perform();
Thread.sleep(2000);
	}

}
