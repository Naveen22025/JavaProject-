package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath="//img[@class='rounded-circle']")
	private WebElement img;
	
	@FindBy(linkText="Log Out")
	private WebElement logout;
	
	@FindBy(xpath="//i[@title='Employee']")
	private WebElement Employee;
	
	@FindBy(linkText="Employee-Details")
	private WebElement EmpDetails;
	
	 public HomePage(WebDriver driver) {
	 PageFactory.initElements(driver, this);
  }

	public WebElement getImg() {
		return img;
	}

	public WebElement getLogout() {
		return logout;
	}
	
	public WebElement getemp() {
		return Employee;
	}
	
	public WebElement getempdetail() {
		return EmpDetails;
	}
	
	
}
