package testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import base.TestBase;
import utility.Utility;

public class InvalidLogin extends TestBase {


	@Test (priority = 0)
	void InValidLogin () throws IOException {

		JavascriptExecutor scollDown= (JavascriptExecutor)driver;
		scollDown.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.xpath(Utility.fetchLocator("FormAuth_XPATH"))).click();
		driver.findElement(By.cssSelector(Utility.fetchLocator("UserName_cssSelector"))).sendKeys("thomas");
		driver.findElement(By.xpath(Utility.fetchLocator("passpwd_XPATH"))).sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath(Utility.fetchLocator("LoginBtn_XPATH"))).click();
		//String expecTedResult = "Secure Area";
		//String searchResult = driver.findElement(By.xpath(Utility.fetchLocator("SecureArea_XPATH"))).getText();
		//Assert.assertEquals(searchResult,expecTedResult);
		System.out.println ("User Name is Invalid");


	}

}
