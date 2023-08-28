package testScripts;

import java.util.Map;

import org.testng.annotations.Test;


import genericLibraries.BaseClass;

public class AddaddressTest extends BaseClass{
	
// 	AddAddress Test
	@Test
	public void addAddressTest() throws InterruptedException
	{
		
		welcome.clickLoginButton();
		
		Map<String, String> loginData = excel.getdata("Sheet1", "Login Details");
		
		login.loginDetails(loginData.get("Email"), loginData.get("Password"));
		login.clickLoginButton();
		
		Thread.sleep(2000);
		
		
		home.clickprofileButton();
		Thread.sleep(1000);
		
		home.selectMyProfile();
		
		myProfile.clickMyAddresses();
		myAddress.clickAddAddress();
		
		Map<String, String> addAddressData = excel.getdata("Sheet1", "Add Address");
		
		String country = "India";
		String state = "Telangana";
		String city = "Hyderabad";
		
		addressForm.addAddressDetails(webUtil, addAddressData.get("Name"), addAddressData.get("House/Office Info"), 
				addAddressData.get("Street Info"), addAddressData.get("Landmark"), 
				addAddressData.get("Pincode"), addAddressData.get("Phone Number"), country, state, city);
		
		Thread.sleep(2000);
		
		addressForm.clickAddAddress();
		
		Thread.sleep(2000);
		
		
		Thread.sleep(10000);
		
			}
}
