package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Employee {

	@FindBy(id="add_btn")
	private WebElement Register;
	
	@FindBy(xpath="//input[@id='name']")
	private WebElement Firstfield;
	
	@FindBy(xpath="(//span[.='×'])[4]")
	private WebElement Cancil;
	
	@FindBy(id="closeEmpFormModel")
	private WebElement ok;
	
	public Employee(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}

	public WebElement getRegister() {
		return Register;
	}

	public WebElement getFirstfield() {
		return Firstfield;
	}

	public WebElement getCancil() {
		return Cancil;
	}

	public WebElement getOk() {
		return ok;
	}
	
	
}
