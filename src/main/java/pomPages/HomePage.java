package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtility;

public class HomePage {
	@FindBy(id="electronics")
	private WebElement electronics;
	
	@FindBy(xpath = "//a[text()='Headphones']")
	private WebElement headphonesLink;
//	DECLARATION
	@FindBy(xpath = "//button[@aria-label='Account settings']")
	private WebElement profileButton;
	
	@FindBy(xpath = "//lo[.='My Profile']")
	private WebElement myProfile;
	@FindBy(xpath="//li[text()=\"Logout\"]")
	private WebElement logOutButton;
	
//	INITIALIZATION
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
//	UTILIZATION
	public void mouseHoverToElectronics(WebDriverUtility web)
	{
		web.mouseHover(electronics);
	}
	
	public void clickHeadphones()
	{
		headphonesLink.click();
	}
	public void clickprofileButton()
	{
		profileButton.click();
	}
	public void selectMyProfile()
	{
		myProfile.click();
	}
	public void clickLogOutButton()
	{
		logOutButton.click();
	}
	

}
