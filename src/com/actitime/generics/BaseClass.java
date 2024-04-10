package com.actitime.generics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;

public class BaseClass {

	public WebDriver driver;
	public FileLib f= new FileLib();

	@BeforeTest()
	public void OpenBrowser() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@AfterTest()
	public void CloseBrowser() {
		driver.close(); 
	}

	@BeforeMethod()
	public void Login() throws IOException {
		String url = f.Property("adurl");
		String un = f.Property("adun");
		String pw = f.Property("adpwd");
		driver.get(url);
		LoginPage l = new LoginPage(driver);
		l.SetLogin(un, pw);
	}

	@AfterMethod
	public void Logout()  {
		
		HomePage h= new HomePage(driver);
		WebElement td = h.getImg();
		f.Action(driver, td);
		h.getLogout().click();
		
		
	}
}
