package assigment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tricentis {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://opensource-demo.orangehrmlive.com");
	    //user name 
		driver.findElement (By.className("oxd-input")).sendKeys("Admin");
		//password
		driver.findElement(By.className("oxd-input--active")).sendKeys("admin123");
		//login button
		driver.findElement(By.className("orangehrm-login-button")).click();
		//dropdown
		driver.findElement(By.className("oxd-userdropdown-img")).click();
		//logout
		driver.findElement(By.className("oxd-userdropdown-link")).click();
		driver.close();
		
		
		
		
		
		
		

	}

}
