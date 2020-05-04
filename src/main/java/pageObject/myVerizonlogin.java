package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class myVerizonlogin {

	public WebDriver driver;
	//WebDriver driver=new ChromeDriver();

	public myVerizonlogin(WebDriver driver)
	{
this.driver=driver;
	}
//By usernamebox=By.xpath("//input[@placeholder='Mobile Number or User ID']");
//By passwordbox=By.xpath("//input[@placeholder='Password']");



By usernamebox=By.cssSelector("input#IDToken1");
By passwordbox=By.cssSelector("input#IDToken2");
By submitbtn=By.xpath("//*[text()='Sign in']");

public WebElement getUsernametext()
{
	return driver.findElement(usernamebox);
}
public WebElement passwordboxtext()
{
	return driver.findElement(passwordbox);
}
public WebElement getsubmit()
{
	return driver.findElement(submitbtn);
}
}