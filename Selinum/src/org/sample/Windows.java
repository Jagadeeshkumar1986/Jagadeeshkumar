package org.sample;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Selinum\\driver\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.snapdeal.com/");
		WebElement srch = dr.findElement(By.xpath("//*[@id=\'inputValEnter\']"));
		srch.sendKeys("iphone6");
		WebElement icon = dr.findElement(By.xpath("//*[@id=\'sdHeader\']/div[4]/div[2]/div/div[2]/button/span"));
		icon.click();

		WebElement iphn = dr.findElement(By.xpath("//*[@id=\'5764608194750272515\']/div[2]/a/picture/img"));
		iphn.click();
		String par = dr.getWindowHandle();
		Set<String> all = dr.getWindowHandles();
		System.out.println("par");
		System.out.println("all");
		for (String X : all) {
			if (!par.equals(X)) {
				dr.switchTo().window(X);
				
			}
			
		}
		WebElement add = dr.findElement(By.xpath("//*[@id=\'add-cart-button-id\']/span"));
		add.click();
	}

}