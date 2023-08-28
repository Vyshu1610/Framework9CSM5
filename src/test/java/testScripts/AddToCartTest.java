package testScripts;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;
//ADD TO CART TEST
public class AddToCartTest  extends BaseClass{
	@Test
	public void addtoCartTest() throws InterruptedException {
		
	
	Map<String,String> map= excel.getdata("Sheet1","Add to Cart");
	welcome.clickLoginButton();
	login.loginDetails(map.get("Email"),map.get("Password"));
	Thread.sleep(3000);
	
	home.mouseHoverToElectronics(webUtil);
	Thread.sleep(3000);
	home.clickHeadphones();
	Thread.sleep(3000);
	
	Assert.assertEquals(headphones.getAddToCartText(),"ADDED");
	String itemName =headphones.getItemName();
	headphones.clickCartIcon();
	Assert.assertTrue(cart.cartItem().equalsIgnoreCase(itemName));
	
	
	
}
}