package org.form;

import java.util.Date;

import org.base.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.login.LoginPage;
import org.openqa.selenium.WebDriver;

public class HotelForm extends BaseClass {
public static WebDriver driver;
	
	@BeforeClass
	public static void beforeClass() {
		
		browserLaunch2("edge");
		implicitlyWait(40);
		}
	@AfterClass
	public static void afterClass() {
		quit();
	}
	@Before
	public void before() {
	Date d=new Date();
	System.out.println("Start time "+d);
   }
	
	@After
	public void after() {
		Date d=new Date();
		System.out.println("End time "+d);
	}
	@Test
	public void test1() {
		//verify my url
		urlLaunch("https://adactinhotelapp.com/");
		String cu = getCurrentUrl();
		boolean c = cu.contains("adactinhotelapp");
		Assert.assertTrue("verify your url", c);
		
	}
	@Ignore
	@Test
	public void test2()
	{
	LoginPage l=new LoginPage();
	//to verify my username
	sendkeys(l.getTxtUser(),"suganya");
	String user = getAttribute(l.getTxtUser());
	Assert.assertEquals("verify the username","suganya",user);
	
	//to validate the password
	sendkeys(l.getTxtPass(),"6865");
	String pass = getAttribute(l.getTxtPass());
	Assert.assertEquals("verify the password", "6865",pass);
	
	//to verify login is in valid page or invalid page
	click(l.getClkLoginbtn());
	String url = getCurrentUrl();
	boolean ct = url.contains("adactin");
	Assert.assertTrue("verify the login validation", ct);
	}
	
	
	
	@Test
	public void test3() throws InterruptedException {
		LoginPage l=new LoginPage();
		click(l.getUserName());
		sendkeys(l.getTxtUserName(),"suganyaharshikak");
		Assert.assertEquals("verify the username", "suganyaharshikak",getAttribute(l.getTxtUserName()));
		sendkeys(l.getTxtPassword(),"kathi@M0620");
		Assert.assertEquals("verify the password","kathi@M0620",getAttribute(l.getTxtPassword()));
		sendkeys(l.getTxtRePassword(),"kathi@M0620");
		Assert.assertEquals("verify the password","kathi@M0620",getAttribute(l.getTxtRePassword()));
		sendkeys(l.getFullName(),"suganyakathiravan");
		Assert.assertEquals("verify the fullname", "suganyakathiravan",getAttribute(l.getFullName()));
		sendkeys(l.getTxtEmail(),"suganyaharshik@gmail.com");
		Assert.assertEquals("verify the email", "suganyaharshik@gmail.com",getAttribute(l.getTxtEmail()));
		click(l.getTxtCaptcha());
	    Thread.sleep(8000);
	    click(l.getClikCheck());
	    click(l.getClikSubmit());
	    click(l.getClkLogin());
	    
	}
	public void test4() {
		LoginPage l=new LoginPage();
	
	    sendkeys(l.getTxtUser(),"suganyakathi");
		Assert.assertEquals("verify the username", "suganyakathi",getAttribute(l.getTxtUser()));
		sendkeys(l.getTxtPass(),"H993C7");
		Assert.assertEquals("verify the password", "H993C7",getAttribute(l.getTxtPass()));
	    click(l.getClkLoginbtn());
	    click(l.getSltLoc());
	    selectByIndex(l.getSltLoc(),2);
	    click(l.getSltHotel());
        selectByIndex(l.getSltHotel(),4);
        click(l.getRoomType());
        selectByIndex(l.getRoomType(),3);
        click(l.getRoomsNum());
        selectByIndex(l.getRoomsNum(),3);
        sendkeys(l.getTxtDate(),"21/09/2023");
        Assert.assertEquals("verify the date in", "21/09/2023",getAttribute(l.getTxtDate()));
        sendkeys(l.getOutDate(),"23/09/2023");
        Assert.assertEquals("verify the date out", "23/09/2023",getAttribute(l.getOutDate()));
        click(l.getAdultRoom());
        selectByIndex(l.getAdultRoom(),2);
        click(l.getChildRoom());
        selectByIndex(l.getChildRoom(),3);
        click(l.getClkSearch());
        click(l.getClkRadios());
        click(l.getClkContinue());
        sendkeys(l.getTxtFirstName(),"kathiravan");
		Assert.assertEquals("verify the firstname", "kathiravan",getAttribute(l.getTxtFirstName()));
		sendkeys(l.getTxtLastName(),"muthusamy");
		Assert.assertEquals("verify the lastname", "muthusamy",getAttribute(l.getTxtLastName()));
		sendkeys(l.getTxtAddress(),"madurai");
		Assert.assertEquals("verify the address", "madurai",getAttribute(l.getTxtAddress()));
		sendkeys(l.getTxtCredit(),"1234567890123456");
		Assert.assertEquals("verify the credit num", "1234567890123456",getAttribute(l.getTxtCredit()));
		 click(l.getTxtCreditNum());
	        selectByIndex(l.getTxtCreditNum(),3);
	        click(l.getMonth());
	        selectByIndex(l.getMonth(),3);
	        click(l.getYear());
	        selectByIndex(l.getYear(),14);
	        sendkeys(l.getCvvNum(),"567");
	        click(l.getBookNow());
	        System.out.println(getAttribute(l.getOrderNum()));
	}
	
	}

