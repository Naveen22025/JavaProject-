package com.actitime.testscript;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;
import com.actitime.pom.Employee;
import com.actitime.pom.HomePage;

@Listeners(com.actitime.generics.ListnerImp.class)
public class RegisterEmployee extends BaseClass {

	@Test
	public void RegisterEmployee() {
		
		HomePage h = new HomePage(driver);
		h.getemp().click();
		h.getempdetail().click();
		
		Employee e = new Employee(driver);
		e.getRegister().click();
		e.getFirstfield().sendKeys("Naveen");
		e.getCancil().click();
		e.getOk().click();
	
		
	}
}
