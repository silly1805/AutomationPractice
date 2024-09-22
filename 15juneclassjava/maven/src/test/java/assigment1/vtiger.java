package assigment1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class vtiger {

	public static void main(String[] args) {
		// to open chrome browser,create an instance of chromedrive class
		WebDriver drive = new ChromeDriver();
		drive.get("https:demo.vtiger.com");
		
		String pagetitle=drive.getTitle();
        System.out.println("current page title is "+pagetitle);
        System.out.println("no of current page title is "+pagetitle.length());
        
        //get the current page url 
        String pageURL=drive.getCurrentUrl();
        System.out.println("current page url "+pageURL);
        System.out.println("no of cher current page url  "+pageURL.length());
        
        //get the current page source code
        String pagesource=drive.getPageSource();
        System.out.println(" page source char code "+pagesource.length());
        
        //close current browser instance
        drive.close();
        
        
	}

}
