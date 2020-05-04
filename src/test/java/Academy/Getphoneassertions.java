package Academy;

import pageObject.LandingPage;
import resources.Driver;
import java.util.*;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.*;

public class Getphoneassertions extends Driver{
	public Logger log=LogManager.getLogger(Driver.class.getName());
	@BeforeTest
	public void initalise() throws IOException{
		driver=Initialisebrowser();
		driver.get(prop.getProperty("url"));
	}
	@Test
	public void LinkAssertion() throws IOException
	{
		LandingPage l=new LandingPage(driver);
		Assert.assertEquals(l.getPhone().getText(), "Phone1");
		Assert.assertTrue(l.getSearchBox().isDisplayed());
		log.info("Phone link tested");
	}
	@AfterTest
	public void TearDown()
	{
		driver.close();
		driver=null;
	}


}
