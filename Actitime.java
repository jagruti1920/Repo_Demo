package ddt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actitime {

	public static void main(String[] args)
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		//Login like administrator---  un:admin  pwd:manager
		String data = TestData.getHashMapData("RegularUser");//trainee:trainee
		String rv[] = data.split(":");
		String username=rv[0];//trainee
		String password=rv[1];//trainee
		//Enter Username
		driver.findElement(By.id("username")).sendKeys(username);
		//Enter Password
		driver.findElement(By.name("pwd")).sendKeys(password);

	}

}
