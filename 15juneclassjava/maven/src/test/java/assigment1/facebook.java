package assigment1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebook {

	public static void main(String[] args) {
		WebDriver drive = new FirefoxDriver();
         drive.get("https://www.facebook.com ");
		
		String pagetitle=drive.getTitle();
        System.out.println("current page title is "+pagetitle);
    
        String expectedtitle = " Facebook-log in or sign up ";
        System.out.println("facebook search page validation status ?"+ pagetitle.equals(expectedtitle));
        //close current browser instance
     
//		

//        drive.get("https://www.google.com");
		
		//get the current page title
//		String pageTitle=drive.getTitle();
//		System.out.println("Current page title is "+pageTitle);
//		System.out.println("No of char in current page title is "+pageTitle.length());
//		String expectedTitle="Google";
//		System.out.println("Google search page validation status? "+pageTitle.equals(expectedTitle));
	}

}
