package google;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tabsswitching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C://work//ChromeDriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.aircanada.com/");
		driver.findElement(By.className("mat-bkmg-selected-dates-wrapper")).click();
		driver.find
		
	
	}

}
