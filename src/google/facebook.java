package google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://work//ChromeDriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.findElement(By.xpath("//input[@name='username'] ")).sendKeys("heai");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("bai");
		//driver.findElement(By.xpath("//button[@name='login']")).click();
	
	
	}

}
