package com.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Landing {

	@FindBy (xpath = "//a[text()='Desktops']")
	private WebElement desktop;
	
	@FindBy (xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement laptop_Notebook;
	
	@FindBy (xpath = "//a[text()='Components']")
	private WebElement components;
	
	@FindBy (xpath = "//a[text()='Tablets']")
	private WebElement Tablets;
	
	@FindBy (xpath = "//a[text()='Software']")
	private WebElement software;
	
	@FindBy (xpath = "//a[text()='Phones & PDAs']")
	private WebElement phones_PDAs;
	
	@FindBy (xpath = "//a[text()='Cameras']")
	private WebElement cameras;
	
	@FindBy (xpath = "//a[text()='MP3 Players']")
	private WebElement MP3_Players;
	
	
	public WebElement getDesktop() {
		return desktop;
	}
	public WebElement getLaptop_Notebook() {
		return laptop_Notebook;
	}
	public WebElement getComponents() {
		return components;
	}
	public WebElement getTablets() {
		return Tablets;
	}
	public WebElement getSoftware() {
		return software;
	}
	public WebElement getPhones_PDAs() {
		return phones_PDAs;
	}
	public WebElement getCameras() {
		return cameras;
	}
	public WebElement getMP3_Players() {
		return MP3_Players;
	}
	
	public WebDriver driver;
	
	/*public Landing (WebDriver driver)
	{
	driver= this.driver;
	PageFactory.initElements(driver, this);
	}*/
	
}
