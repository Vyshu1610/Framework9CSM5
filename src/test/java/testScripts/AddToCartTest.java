package testScripts;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;

public class AddToCartTest  extends BaseClass{
	@Test
	public void addtoCartTest() {
		
	
	Map<String,String> map= excel.getData("Sheet1","Add to Cart");
	welcome.clickLoginButton();
	login.loginToApp((map.get("Email"),map.get("Password"));
	Thread.sleep(3000);
	
	home.mouseHoverToElectronics(webUtil);
	Thread.sleep(3000);
	home.clickHeadPhonesLink();
	Thread.sleep(3000);
	
	Assert.assertEquals(headPhone.getAddToCartText(),"ADDED");
	String itemName =headPhones.getItemName();
	headPhones.clickCartIcon();
	
	
}
}