package org.form;

import java.util.Date;
import java.util.List;

import javax.swing.text.TableView.TableRow;

import org.base.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.login.LoginPage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class HotelReg extends BaseClass {
public static WebDriver driver;
	
	@BeforeClass
	public static void beforeClass() {
		
		browserLaunch2("edge");
		implicitlyWait(20);
		}
//	@AfterClass
//	public static void afterClass() {
//		quit();
//	}
	@BeforeMethod
	public void beforemethod() {
	Date d=new Date();
	System.out.println("Start time "+d);
   }
	
	@AfterMethod
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
	@Test
	public void test2() throws InterruptedException {
		LoginPage l= new LoginPage();
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
        sendkeys(l.getTxtDate(),"22/09/2023");
      //  Assert.assertEquals("verify the date in", "22/09/2023",getAttribute(l.getTxtDate()));
        sendkeys(l.getOutDate(),"23/09/2023");
      //  Assert.assertEquals("verify the date out", "23/09/2023",getAttribute(l.getOutDate()));
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
	        
	        click(l.getClkBooked());
	        
	     WebElement tableTot = driver.findElement(By.tagName("table"));  
	     WebElement table = driver.findElement(By.xpath("//table[@cellpadding='5']"));
	     List<WebElement> tableData = table.findElements(By.tagName("td"));
	     
	    List<WebElement> checkBox = driver.findElements(By.xpath("//input[@name='ids[]']"));
	    List<WebElement> tableRow = driver.findElements(By.xpath("//input[@type='button']"));
        
	    click(tableRow.get(tableRow.size()-1));
	    click(checkBox.get(checkBox.size()-1));
//        for (int i = 0; i < checkBox.size()-1; i++) {
//        	WebElement c = checkBox.get(checkBox.size()-1);
//        	c.click();
//			
//		}
        WebElement sc = driver.findElement(By.xpath("//input[@name='cancelall']"));
        sc.click();
              Alert alert = driver.switchTo().alert();
              alert.accept();
              
        }
	
	
	
	
}
	
	
	


