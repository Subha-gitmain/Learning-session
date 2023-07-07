package com.tutorialsninja;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Base.BaseClass;
import com.POMClasses.Landing;

public class Verify_LandingPage_Header extends BaseClass{

	
	@Test
	public void verify_header_links()
	{
		Landing land=PageFactory. initElements(driver, Landing.class);
		land.getDesktop().click();
		land.getCameras().getText();
		land.getLaptop_Notebook().click();
		land.getTablets().click();
		land.getMP3_Players().click();
		land.getPhones_PDAs().click();
		land.getPhones_PDAs().click();
	}
}
