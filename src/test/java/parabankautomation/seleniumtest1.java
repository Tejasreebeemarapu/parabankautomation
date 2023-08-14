package parabankautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class seleniumtest1 {
	 WebDriver  driver;
	 String projectPath= System.getProperty("user.dir");	
     String chromeDriverPath = System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver.exe");
 	String url = "https://parabank.parasoft.com/parabank/index.htm";
	
	     
  @Test
  public void f() throws InterruptedException {
//  System.setProperty("webdriver.chrome.driver", "C:\\Users\\TBEEMARA\\New-workspace\\Test1\\drivers\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.get(url);
	 Thread.sleep(2000);
	  	     
	  	      System.out.println(driver.manage().window().getSize());
		       Thread.sleep(3000);
		       
	  	      driver.manage().window().maximize();
	  		  Thread.sleep(3000);
/*
// Width & Height
	  		  Dimension dim = new Dimension(750, 650);
	  		  driver.manage().window().setSize(dim);

 //OR
//driver.manage().window().setSize(new Dimension(750, 650));
	  		  Thread.sleep(3000);
	  	    
	  		  driver.manage().window().fullscreen();
	  	      Thread.sleep(3000);
//Current url	  	      
	  	    String pageURL = driver.getCurrentUrl();
	  	     System.out.println("Parabank Page URL is --> " + pageURL);
	  	     
// Capture Page Title
	  	     String pageTitle = driver.getTitle();
	  	        System.out.println("Parabank Page Title is --> " + pageTitle);

// Capture Page Source
	  	  String pageSourceCode = driver.getPageSource();
	  	  System.out.println("Parabank Page Source is --> " + pageSourceCode);
//Navigation
	  	driver.navigate().back();
	  	Thread.sleep(2000);
	  	
	  	driver.navigate().forward();
	  	Thread.sleep(2000);
	  	
//	  	driver.navigate().refresh();
//	  	Thread.sleep(2000);

//Elements
//LinkText
		 driver.findElement(By.linkText("About Us")).click();
		 Thread.sleep(3000);

//PartialLinkText
		 driver.findElement(By.partialLinkText("Ser")).click();
		 Thread.sleep(3000);
		 
	
		 driver.findElement(By.partialLinkText("Admin")).click();
		 Thread.sleep(3000);
		 */

//LinkText
		  driver.findElement(By.linkText("Register")).click();
		  Thread.sleep(3000);

//		 driver.findElement(By.name("customer.firstName")).sendKeys("Tejasree");
// Thread.sleep(3000);
 

List<WebElement> textBoxList = driver.findElements(By.className("input"));
	  int textBoxCount = textBoxList.size();
	  System.out.println(textBoxCount);
	  
	  textBoxList.get(0).sendKeys("tejasree");
	  Thread.sleep(2000); 
	  textBoxList.get(1).sendKeys("123456789");
	  Thread.sleep(2000);
	  textBoxList.get(2).sendKeys("Beemarapu");
	  Thread.sleep(2000);
	  textBoxList.get(3).sendKeys("Tejasree");
	  Thread.sleep(2000);
	  textBoxList.get(4).sendKeys("myadd");
	  Thread.sleep(2000);

	  textBoxList.get(5).sendKeys("mycity");
	  Thread.sleep(5000);
	  textBoxList.get(6).sendKeys("mycity");
	  Thread.sleep(5000);
	  textBoxList.get(7).sendKeys("mycity");
	  Thread.sleep(5000);
	  textBoxList.get(8).sendKeys("mycity");
	  Thread.sleep(5000);
	  textBoxList.get(9).sendKeys("mycity");
	  Thread.sleep(5000);
	   textBoxList.get(10).sendKeys("mycity");
	  Thread.sleep(5000);
	  textBoxList.get(11).sendKeys("mycity");
	  Thread.sleep(5000);
	  textBoxList.get(12).sendKeys("mycity");
	  Thread.sleep(5000);
	  
	  
	  List<WebElement> links = driver.findElements(By.tagName("a"));

	  int linksCount = links.size();
	  System.out.println(linksCount);
	  Thread.sleep(1000);
	
	  links.get(5).click();
	  Thread.sleep(1000);

	  	driver.quit();
  }
}
