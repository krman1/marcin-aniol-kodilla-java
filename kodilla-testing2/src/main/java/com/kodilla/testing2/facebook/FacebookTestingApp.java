package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
	
	public static final String XPATH_WAIT_FOR = "//select[1]";
	public static final String XPATH_BIRTHDAY_DAY = "//div[contains(@class, \"_5k_5\")]/span/span/select[1]";
	public static final String XPATH_BIRTHDAY_MONTH = "//div[contains(@class, \"_5k_5\")]/span/span/select[2]";
	public static final String XPATH_BIRTHDAY_YEAR = "//div[contains(@class, \"_5k_5\")]/span/span/select[3]";
	
	public static void main(String[] args) {
		WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
		driver.get("https://facebook.com/");
		
		while (!driver.findElement(By.xpath(XPATH_WAIT_FOR)).isDisplayed());
		
		WebElement selectCombo1 = driver.findElement(By.xpath(XPATH_BIRTHDAY_DAY));
		Select Day = new Select(selectCombo1);
		Day.selectByIndex(1);
		
		WebElement selectCombo2 = driver.findElement(By.xpath(XPATH_BIRTHDAY_MONTH));
		Select Month = new Select(selectCombo2);
		Month.selectByIndex(7);
		
		WebElement selectCombo3 = driver.findElement(By.xpath(XPATH_BIRTHDAY_YEAR));
		Select Year = new Select(selectCombo3);
		Year.selectByIndex(1);
	}
}
