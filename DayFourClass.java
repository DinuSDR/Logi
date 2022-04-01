package org.dayfour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayFourClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Logesh\\eclipse-workspace\\DayThreeClass\\dri\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");

		WebElement a = driver.findElement(By.xpath("//span[text()='Overview']"));
		a.click();

		Thread.sleep(3000);
		WebElement b = driver.findElement(By.xpath("(//p[contains(text(),'Greens Technologies')])[1]"));
	
		String c = b.getText();
		System.out.println(c);


	}












}
