package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class InscriptionPage extends BasePage {

	@FindBy(how = How.ID, using = "slider-carousel")
	private static WebElement homepage;

	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Signup / Login']")
	private static WebElement btnSignLogin;

	@FindBy(how = How.XPATH, using = "//h2[normalize-space()='New User Signup!']")
	private static WebElement newUserSign;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Name']")
	private static WebElement nameField;

	@FindBy(how = How.XPATH, using = "//input[@data-qa='signup-email']")
	private static WebElement emailField;

	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Signup']")
	private static WebElement btnSignup;

	@FindBy(how = How.XPATH, using = "//b[normalize-space()='Enter Account Information']")
	private static WebElement accountInfo;

	@FindBy(how = How.ID, using = "id_gender2")
	private static WebElement mrs;

	@FindBy(how = How.ID, using = "password")
	private static WebElement password;
	
	@FindBy(how = How.ID, using = "days")
	private static WebElement days;
	
	@FindBy(how = How.ID, using = "months")
	private static WebElement months;
	
	@FindBy(how = How.ID, using = "years")
	private static WebElement years;
	
	@FindBy(how = How.ID, using = "newsletter")
	private static WebElement newsletter;
	
	@FindBy(how = How.ID, using = "optin")
	private static WebElement specialOffers;
	
	@FindBy(how = How.ID, using = "first_name")
	private static WebElement firstName;
	
	@FindBy(how = How.ID, using = "last_name")
	private static WebElement lastName;
	
	@FindBy(how = How.ID, using = "company")
	private static WebElement company;
	
	@FindBy(how = How.ID, using = "address1")
	private static WebElement address1;
	
	@FindBy(how = How.ID, using = "address2")
	private static WebElement address2;
	
	@FindBy(how = How.ID, using = "country")
	private static WebElement country;
	
	@FindBy(how = How.ID, using = "state")
	private static WebElement state;
	
	@FindBy(how = How.ID, using = "city")
	private static WebElement city;

	@FindBy(how = How.ID, using = "zipcode")
	private static WebElement code;
	
	@FindBy(how = How.ID, using = "mobile_number")
	private static WebElement mobileNumber;
	
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Create Account']")
	private static WebElement btnCreatAccount;
	
	@FindBy(how = How.XPATH, using = "//b[normalize-space()='Account Created!']")
	private static WebElement msgAccountCreated;
	
	@FindBy(how = How.XPATH, using = "//a[@class='btn btn-primary']")
	private static WebElement btnContinue;
	
	@FindBy(how = How.XPATH, using = "//b[normalize-space()='ramla']")
	private static WebElement userNameCount;
	
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Delete Account']")
	private static WebElement btnDeletCount;
	
	@FindBy(how = How.XPATH, using = "//b[normalize-space()='Account Deleted!']")
	private static WebElement msgDeletACount;
	
	@FindBy(how = How.XPATH, using = "//a[@class='btn btn-primary']")
	private static WebElement btnContinueSuite;



	public InscriptionPage() {
		super(Setup.getDriver());
	}

	public static WebElement getHomePage() {

		return homepage;
	}

	public static WebElement getBtnSignLogin() {
		return btnSignLogin;
	}

	public static WebElement getNewUserSign() {
		return newUserSign;
	}

	public static WebElement getNameField() {

		return nameField;

	}

	public static WebElement getEmailField() {

		return emailField;
	}

	public static WebElement getBtnSignup() {

		return btnSignup;
	}

	public static WebElement getAccounInfo() {
		return accountInfo;
	}

	public static WebElement getMrs() {
		return mrs;
	}

	public static WebElement getPassword() {
		return password;
	}
	public static WebElement getDays() {
		return days;
	}
	public static WebElement getMonths() {
		return months;
	}
	public static WebElement getYears() {
		return years;
	}
	public static WebElement getNewsletter() {
		return newsletter;
	}
	public static WebElement getSpecialOffers() {
		return specialOffers;
	}
	public static WebElement getFirstName() {
		return firstName;
	}
	
	public static WebElement getLastName() {
		return lastName;
	}
	
	public static WebElement getCompany() {
		return company;
	}
	public static WebElement getaddress1() {
		return address1;
	}
	public static WebElement getaddress2() {
		return address2;
	}
	public static WebElement getCountry() {
		return country;
	}
	
	public static WebElement getState() {
		return state;
	}
	public static WebElement getCity() {
		
		return city;
	}
public static WebElement getCode() {
		
		return code;
	}
public static WebElement getMobileNumber() {
	
	return mobileNumber;
}
public static WebElement getBtnCreatAccount() {
	
	return btnCreatAccount;
}
public static WebElement getMsgAccountCreated() {
	
	return msgAccountCreated;
}
public static WebElement getBtnContinue() {
	
	return btnContinue;
}
public static WebElement getUserNameCount() {
	
	return userNameCount;
}
public static WebElement getBtnDeletCount() {
	
	return btnDeletCount;
}
public static WebElement getMsgAccountDelet() {
	
	return msgDeletACount;
}
public static WebElement getBtnContinueSuite() {
	
	return btnContinueSuite;
}
}
