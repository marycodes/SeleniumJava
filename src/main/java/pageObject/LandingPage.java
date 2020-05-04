package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LandingPage {

	public WebDriver driver;

	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}
By signin=By.id("gnavAccountMenu");
By login=By.xpath("//*[text()='Sign in']");
By phone=By.xpath("//button[@class='a11y-sr-only false']");
By dropdown=By.xpath("//*[text()='My Account']");
By searchbox=By.xpath("//input[@id='navPhoneSearch']");

public WebElement getsignin()
{
	return driver.findElement(signin);
}

public WebElement getLogin()
{
	return driver.findElement(login);
}
public WebElement getPhone()
{
	return driver.findElement(phone);
}
public WebElement getDropdown()
{
	return driver.findElement(dropdown);
}
public WebElement getSearchBox()
{
	return driver.findElement(searchbox);
}


}
