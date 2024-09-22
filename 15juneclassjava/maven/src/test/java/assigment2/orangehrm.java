package assigment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangehrm {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com");
	
	//identifying login buttion 
	WebElement loginbutton = driver.findElement(By.className("ico-login"));
	//performing required opration 
	loginbutton.click();
	//identifying email name 
	WebElement eamialname = driver.findElement(By.id("Email"));
	//performing required opration 
	eamialname.sendKeys("tester01@vomoto.com");
	//identifying password
	WebElement Passwordname = driver.findElement(By.id("Password"));
	//performing required opration 
	Passwordname.sendKeys("Abc@12345");
	
	
	
	//identifying remember me 
	WebElement rememberme = driver.findElement(By.name("RememberMe"));
	//performing oppration

	rememberme.click();
		//identifying loginbuttion1
	WebElement loginbutton1 = driver.findElement(By.className("login-button"));
	//performing required opration 
	loginbutton1.click();
	
	//identifying logout buttion 
	WebElement logoutbuttion = driver.findElement (By.className("ico-logout"));
	//performing opration 
	logoutbuttion.click();
	//close
	driver.close();
	
	
	
	
	
	

	}

}
