package testScripts;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;

public class ShopperRegisterTest extends BaseClass {
@Test
public void createAccountTest() throws InterruptedException 
{
	welcome.clickLoginButton();
	login.clickCreateAccount();
	
	Map<String, String> map = excel.getdata("Sheet1", "Shopper Registration");
	int randomNum = jutil.generateRandomNum(111);
	
	String emailID = randomNum + map.get("Email Address");
	String password = map.get("Password") + randomNum;
	
	signup.createUserAccount(map.get("First Name"), map.get("Last Name"), map.get("Phone Number"), emailID, password, password);
	
	Thread.sleep(15000);
	
	welcome.clickLoginButton();
	
	login.loginDetails(emailID, password);
	login.clickLoginButton();
	
	Assert.assertTrue(driver.getTitle().contains("Home"));
}
}
