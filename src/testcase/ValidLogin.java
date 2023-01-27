package testcase;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import utility.Utility;

public class ValidLogin extends TestBase {

	@Test (priority = 0)
	void ValidLogin () throws IOException, InterruptedException {

		JavascriptExecutor scollDown= (JavascriptExecutor)driver;
		scollDown.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.xpath(Utility.fetchLocator("FormAuth_XPATH"))).click();
		driver.findElement(By.cssSelector(Utility.fetchLocator("UserName_cssSelector"))).sendKeys("tomsmith");
		driver.findElement(By.xpath(Utility.fetchLocator("passpwd_XPATH"))).sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath(Utility.fetchLocator("LoginBtn_XPATH"))).click();
		//String expecTedResult = "Automation QA Engineer";
		//String searchResult = driver.findElement(By.xpath(Utility.fetchLocator("searchResult_XPATH"))).getText();
		//Assert.assertEquals(searchResult,expecTedResult);
		System.out.println ("Login Successfully");
		driver.findElement(By.xpath(Utility.fetchLocator("LogOutBtn_XPATH"))).click();
		Thread.sleep(9000);

	}	
}



