package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecoverPasswordPOM {
	private WebDriver driver; 
	
	public RecoverPasswordPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"top-links1\"]/ul/li[3]")
	private WebElement MyAccount;
	
	@FindBy(xpath="//a[contains(text(),'Login')]")
	private WebElement LoginLink;
	
	@FindBy(id="input-email")
	private WebElement userName; 
	
	@FindBy(id="input-password")
	private WebElement password;
	
	@FindBy(xpath="//input[@value='Login']")
	private WebElement loginBtn; 
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/form/div[2]/a")
	private WebElement ForgottenPassword;
	
	@FindBy(id="input-email")
	private WebElement email;
	
	@FindBy(xpath="//input[(@type='submit')]")
	private WebElement Continue;
	
	@FindBy(xpath="/html/body/div[1]/div[1]")
	private WebElement MsgText;
	
	//Defining functions for the Fields on Register Page
	
	public void clickMyAccount()
	{
		MyAccount.click();
	}
	
	public void clickonLogin()
	{
		LoginLink.click();
	}
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	
	public void clickForgottenPassword() {
		this.ForgottenPassword.click();
	}
	
	
	public void sendemail(String email) {
		this.email.clear();
		this.email.sendKeys(email);
	}
	
	public void clickContinueBtn() {
		this.Continue.click(); 
	}
		
	public String alertmsgtext() {
		String msgtext =MsgText.getText();
		return msgtext;
	}
		
		
}

