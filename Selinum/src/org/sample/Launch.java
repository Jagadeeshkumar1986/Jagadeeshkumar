package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Selinum\\driver\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "D:\\Eclipse\\Selinum\\driver\\geckodriver.exe");
		System.setProperty("webdriver.ie.driver", "D:\\Eclipse\\Selinum\\driver\\IEDriverServer.exe");
		//WebDriver dr= new ChromeDriver();
		//WebDriver dr= new FirefoxDriver();
		WebDriver dr= new InternetExplorerDriver();
		dr.get("https://www.whatsapp.com/");
		//this is branch1

	}

}