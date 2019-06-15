package ProjectFieldTest.projectmvn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//import testNG.New_Home_Page;

public class Abcrun {
	public static WebDriver driver = null;
	 
	  @BeforeClass
	  
	  public void launchbrowser() {
		  System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\BHUPAL\\\\Desktop\\\\BHUPALJAVAPROJECT\\\\Jarfiles\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		  driver = new ChromeDriver();
		  String URL = "http://www.facebook.com";
		  driver.get(URL);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.manage().deleteAllCookies();
		  
		  if (URL=="http://www.facebook.com"){
			  System.out.println("My precondition is passed, ready for testcase design");
		  }else {
			  System.out.println("Precondition is falied, check for opening browser");
		  }
		  
		  
	  }
	  @Test
	  public void testcaseexecution() {
		   String uname = "bhupal123@gmail.com";
		   String password = "Bhupal123$";
		   
		   Abc executelogin = new Abc(driver);
		  executelogin.enteruname(uname);
		  executelogin.enterpasswd(password);
		  executelogin.loginbuttclick();
		  System.out.println("Execution of test case is completed, check report");
	  
		  
	  
	  
	  }
	  @AfterClass
	  public void closebrowser() {
		  //driver.close();
		  
	  }

	}