package org.login;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	public LoginPage() {
		  PageFactory.initElements(driver, this);
		  }
	  @CacheLookup
	  @FindBy(xpath="//a[text()='New User Register Here']")
	  private WebElement userName;
	  @CacheLookup
	  @FindBy(name="username")
	  private WebElement txtUserName;
	  @FindBy(name="password")
	  private WebElement txtPassword;
	  @FindBy(name="re_password")
	  private WebElement txtRePassword;
	  @FindBy(name="full_name")
	  private WebElement fullName;
	  @FindBy(name="email_add")
	  private WebElement txtEmail;
	  @FindBy(name="captcha")
	  private WebElement txtCaptcha;
	  @FindBy(id="tnc_box")
	  private WebElement clikCheck;
	  @FindBy(id="Submit")
	  private WebElement clikSubmit;
	  @FindBy(xpath="//a[text()='Click here to login']")
	  private WebElement clkLogin;
	  @FindBy(id="username")
	  private WebElement txtUser;
	  @FindBy(id="password")
	  private WebElement txtPass;
	  @FindBy(id="login")
	  private WebElement clkLoginbtn;
	  @FindBy(id="location")
	  private WebElement sltLoc;
	  @FindBy(id="hotels")
	  private WebElement sltHotel;
	  @FindBy(id="room_type")
	  private WebElement roomType;
	  @FindBy(id="room_nos")
	  private WebElement roomsNum;
	  @FindBy(id="datepick_in")
	  private WebElement txtDate;
	  @FindBy(id="datepick_out")
	  private WebElement outDate;
	  @FindBy(id="adult_room")
	  private WebElement adultRoom;
	  @FindBy(id="child_room")
	  private WebElement childRoom;
	  @FindBy(id="Submit")
	  private WebElement clkSearch;
	  @FindBy(id="radiobutton_0")
	  private WebElement clkRadios;
	  @FindBy(id="continue")
	  private WebElement clkContinue;
	  @FindBy(id="first_name")
	  private WebElement txtFirstName;
	  @FindBy(id="last_name")
	  private WebElement txtLastName;
	  @FindBy(id="address")
	  private WebElement txtAddress;
	  @FindBy(id="cc_num")
	  private WebElement txtCredit;
	  @FindBy(id="cc_type")
	  private WebElement txtCreditNum;
	  @FindBy(id="cc_exp_month")
	  private WebElement month;
	  @FindBy(id="cc_exp_year")
	  private WebElement year;
	  @FindBy(id="cc_cvv")
	  private WebElement cvvNum;
	  @FindBy(id="book_now")
	  private WebElement bookNow;
	  @FindBy(id="order_no")
	  private WebElement orderNum;
	  @FindBy(xpath="//a[text()='Booked Itinerary']")
	  private WebElement clkBooked;
//	  @FindBy(xpath="(//input[@type='checkbox'])[11]")
//	  private WebElement clkCheckBox;
	  @FindBy(xpath="//input[@value='Cancel Selected']")
	  private WebElement clkCancel;
	   public WebElement getUserName() {
		return userName;
	}

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getTxtRePassword() {
		return txtRePassword;
	}

	public WebElement getFullName() {
		return fullName;
	}

	public WebElement getTxtEmail() {
		return txtEmail;
	}
	public WebElement getTxtCaptcha() {
		return txtCaptcha;
	}

	public WebElement getClikCheck() {
		return clikCheck;
	}

	public WebElement getClikSubmit() {
		return clikSubmit;
	}
	public WebElement getClkLogin() {
		return clkLogin;
	}

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getClkLoginbtn() {
		return clkLoginbtn;
	}

	public WebElement getSltLoc() {
		return sltLoc;
	}

	public WebElement getSltHotel() {
		return sltHotel;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getRoomsNum() {
		return roomsNum;
	}

	public WebElement getTxtDate() {
		return txtDate;
	}

	public WebElement getOutDate() {
		return outDate;
	}

	public WebElement getAdultRoom() {
		return adultRoom;
	}

	public WebElement getChildRoom() {
		return childRoom;
	}

	public WebElement getClkSearch() {
		return clkSearch;
	}

	public WebElement getClkRadios() {
		return clkRadios;
	}

	public WebElement getClkContinue() {
		return clkContinue;
	}

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCredit() {
		return txtCredit;
	}

	public WebElement getTxtCreditNum() {
		return txtCreditNum;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCvvNum() {
		return cvvNum;
	}

	public WebElement getClkCancel() {
		return clkCancel;
	}

	public WebElement getBookNow() {
		return bookNow;
	}

	public WebElement getOrderNum() {
		return orderNum;
	}
	

//	public WebElement getClkCheckBox() {
//		return clkCheckBox;
//	}

	public WebElement getClkBooked() {
		return clkBooked;
	}
   
	 

}
