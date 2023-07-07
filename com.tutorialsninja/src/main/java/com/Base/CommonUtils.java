package com.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtils extends BaseClass {

	public void implicit_wait()
	{
		BaseClass.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void explicit_wait(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(BaseClass.driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void maximize_window()
	{
		driver.manage().window().maximize();
	}
	
	
}
