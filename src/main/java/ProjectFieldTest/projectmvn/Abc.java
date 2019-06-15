package ProjectFieldTest.projectmvn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Abc {
	public static WebDriver driver = null;


	@FindBy(name="email")
	private WebElement unamefield;
	@FindBy(id="pass")
	private WebElement passwdfield;
	@FindBy(id="u_0_2")
	private WebElement loginbutton;

	public Abc(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
			
	}
	public void enteruname(String uname) {
		unamefield.sendKeys(uname);
		
	}
	public void enterpasswd(String password) {
		passwdfield.sendKeys(password);
		
	}
	public void loginbuttclick() {
		loginbutton.click();
	}
	}


