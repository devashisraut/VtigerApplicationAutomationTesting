package TestExecutionVtigerApplication;

import java.io.IOException;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import UtilityFileVtigerApplication.PropertiesFileUtility;
import UtilityFileVtigerApplication.SeleniumUtility;

import VtigerObjectRepositry.LoginPager;

public class UserAbleToLoginToTheVtigerApplication {
	@Test
	public  void checkToTheUserIsAbleToLogInIntoTheVigerApplication() throws IOException, InterruptedException {
		PropertiesFileUtility pfu=new PropertiesFileUtility();
		SeleniumUtility wdu=new SeleniumUtility();
		WebDriver driver=new ChromeDriver();
		wdu.maximizeBrowserWindow(driver);
		wdu.implicitlyWait(driver);
		LoginPager lp=new LoginPager(driver);
		WebElement usernamebox = lp.getUserNameTextField();
		String url = pfu.readStringDataFromPropertiesFile("url");
		String userName = pfu.readStringDataFromPropertiesFile("userName");
		String password = pfu.readStringDataFromPropertiesFile("password");
		String screenShot = pfu.readStringDataFromPropertiesFile("screenShotFileName");
		
		
		wdu.urlApplication(driver, url);
		wdu.elementScreenShot(driver,usernamebox,screenShot);
		lp.loginToVtiger(userName, password);
		wdu.fullwindowScreenshot(driver,screenShot);
		wdu.singleWindowId(driver);
		wdu.getTitleOfTheWebPage(driver);
		wdu.minimizeBrowserWindow(driver);
		wdu.qutiAllWindowOperation(driver);
		
	}

}
