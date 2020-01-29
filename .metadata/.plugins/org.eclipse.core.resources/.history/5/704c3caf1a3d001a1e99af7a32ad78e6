package org.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Selinum\\driver\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.toolsqa.com/automation-practice-table");
		List<WebElement> trows = dr.findElements(By.tagName("tr"));
		//for (int i = 3; i < 6; i++) {
		for (int i = 0; i < trows.size(); i++) {
			WebElement trow = trows.get(i);
			String text = trow.getText();
		System.out.println(text);
		}

	}

}
