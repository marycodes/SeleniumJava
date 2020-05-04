package Academy;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import resources.Driver;

public class Searchboxassertion extends Driver{
	public Logger log=LogManager.getLogger(Driver.class.getName());
	@BeforeTest
	public void initalise() throws IOException{
		driver=Initialisebrowser();
		driver.get(prop.getProperty("url"));
	}
	@Test
	public void searchAssertion() throws IOException
	{

		LandingPage l=new LandingPage(driver);
		Assert.assertTrue(l.getSearchBox().isDisplayed());
		log.info("searchbox display tested");
	}
	@AfterTest
	public void TearDown()
	{
		driver.close();
		driver=null;
	}

}
