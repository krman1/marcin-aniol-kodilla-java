package com.kodilla.testing2.google;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleTestingApp {
	
	//public static final String SEARCHFIELD = "gLFyf";
	public static final String SEARCHFIELD = "q";
	
	public static void main(String[] args) {
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Selenium-drivers\\Firefox\\geckodriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C:\\Selenium-drivers\\Chrome\\chromedriver.exe");
		
		WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
		driver.get("https://www.google.com");
		
		WebElement searchField = driver.findElement(By.name(SEARCHFIELD));
		searchField.sendKeys("Kodilla");
		searchField.submit();
	}
}
