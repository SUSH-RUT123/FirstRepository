package Module1_Login_Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LibraryFiles.BaseClass;
import LibraryFiles.UtilityClass;
import Module1_Login.SwagLabHomePage;
import Module1_Login.SwagLabLoginPage;
import Module3_Menu_Test.SwagLabMenuPage;

public class Swag_LabLoginTest extends BaseClass

{
	  
		SwagLabLoginPage login;
		SwagLabHomePage home;
		SwagLabMenuPage menu;	
		int TCID;
		
		@BeforeClass
		public void openBrowser() throws EncryptedDocumentException, IOException 
		{		
			initializeBrowser();
			 login=new SwagLabLoginPage(driver);  
			 home=new SwagLabHomePage(driver);
			 menu=new SwagLabMenuPage(driver);
		}
		
	/*	@BeforeMethod
		public void loginToApp() throws InterruptedException, EncryptedDocumentException, IOException
		{
			login.inpSwagLabLoginPageUsername(UtilityClass.getPFData("UN"));
			login.inpSwagLabLoginPagePassword(UtilityClass.getPFData("PWD"));
			login.clickSwagLabLoginPageLoginBtn();
		}*/
		
		/*@BeforeMethod
		public void logiToApp() throws EncryptedDocumentException, IOException
		{
			login.inpSwagLabLoginPageUsername(UtilityClass.getTD(0,0));
			login.inpSwagLabLoginPagePassword(UtilityClass.getTD(0,1));
			login.clickSwagLabLoginPageLoginBtn();
		}

		
		@Test(priority = 1)
		public void verifyLogo() throws InterruptedException 
		{
			TCID=101;
			Thread.sleep(2000);
			boolean actResult = home.getSwagLabHomePageLogoResult();
			Assert.assertTrue(actResult,"Failed1- act result is false:   ");
		}
		
		@Test(priority = 2)
		public void verifyAddToCartBtnCovertToRemove() throws InterruptedException, 
	EncryptedDocumentException, IOException
		{
			TCID=102;
			Thread.sleep(2000);
			home.clickSwagLabHomePageAddToCartBtn();
			Thread.sleep(2000);
			String actResult = home.getSwagLabHomePageRemoveBtn();
			String expResult=UtilityClass.getTD(0, 2);
			Assert.assertEquals(actResult, expResult,"Failed2- both results are diff:  ");
		}


		
		@AfterMethod
		public void logoutFromApp(ITestResult s1) throws InterruptedException, IOException 
		{
			if(s1.getStatus()==ITestResult.FAILURE)
			{
				UtilityClass.captureSS(driver, TCID);
			}
			home.clickSwagLabHomePageMenuBtn();
			Thread.sleep(2000);
			menu.clickSwagLabMenuPageLogout();
		}
		

		
		
		@AfterClass
		public void closeBrowser() throws InterruptedException
		{		
			Thread.sleep(2000);
			driver.quit();
		}*/

	}



