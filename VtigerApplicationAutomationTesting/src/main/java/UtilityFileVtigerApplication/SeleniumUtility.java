package UtilityFileVtigerApplication;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SeleniumUtility {
	
		
	
	
	     
		/*
		 * WebDriver related operations - handling drop down,handling alert,handling alert popup
		 * mouse hover actions ,maximize,minimize,Switching to frame,Windows,Scroll,take Screen shot
		 */
		public void urlApplication(WebDriver driver,String url) {
			driver.get(url);
		}
		//     WebDriver Method
		
		/**
		 * this method id use for get the Title of the web page
		 * @param driver
		 * @return
		 */
		public String getTitleOfTheWebPage (WebDriver driver) {
			String titleOfTheWebPage = driver.getTitle();
			System.out.println(titleOfTheWebPage);
			return titleOfTheWebPage;
		}
		
		/**
		 * this method id use for get the URL of the Current web page
		 * @param driver
		 * @return
		 */
		public String getCurrentofwebPage(WebDriver driver) {
			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);
			return currentUrl;
		}
		
		/**
		 *  this method id use for get the  Current window Id of the web page
		 * @param driver
		 * @return
		 */
		public String singleWindowId(WebDriver driver) {
			String windowId = driver.getWindowHandle();
			System.out.println(windowId);
			return windowId;
		}
		
		/**
		 * this method id use for get the  All window Id of the web page
		 * @param driver
		 * @return
		 */
		public Set<String> allWindowId(WebDriver driver) {
			Set<String> windowsId = driver.getWindowHandles();
			System.out.println(windowsId);
			return windowsId;
		}
		
		public TargetLocator switchToMethod(WebDriver driver) {
			TargetLocator switchOtherWindo = driver.switchTo();
			return switchOtherWindo;
		}
		
		/**
		 * this method is use for maximize Browser Window
		 * @param driver
		 * @return 
		 */
		public void maximizeBrowserWindow(WebDriver driver) {
			driver.manage().window().maximize();
		}
		
		/**
		 * this method is use for minimize Browser Window
		 * @param driver
		 */
		public void minimizeBrowserWindow(WebDriver driver) {
			driver.manage().window().minimize();
		}
		
		/**
		 * this method is use for full screen Browser Window
		 * @param driver
		 */
		public void fullScreenBeowserWindow(WebDriver driver) {
			driver.manage().window().fullscreen();
		}
		
		/**
		 * This method is use for get the Size  
		 * @param driver
		 * @param element
		 * @return
		 */
		public Dimension getsizeMethod(WebDriver driver,WebElement element) {
			 Dimension size = driver.manage().window().getSize();
			 System.out.println(size);
			return size;
		}
		
		public int getHightMethod(WebDriver driver,WebElement element) {
			int height=driver.manage().window().getSize().getHeight();
			System.out.println(height);
			return height;
		}
		
		/**
		 * This method is use for get the Width 
		 * @param driver
		 * @param element
		 * @return
		 */
		public int getWidthMethod(WebDriver driver,WebElement element) {
			int width=driver.manage().window().getSize().getWidth();
			System.out.println(width);
			return width;
		}
		
		/**
		 * This method is use for set the size of the Window
		 * @param driver
		 * @param height
		 * @param width
		 */
		public void setThesize(WebDriver driver,int height,int width) {
		    Dimension setSizeOfWinsow = new Dimension(height,width);
		    driver.manage().window().setSize(setSizeOfWinsow);
		}
		
		/**
		 * This method is use for get the Position of the Window
		 * @param driver
		 * @param element
		 * @return
		 */
		public Point getThePosition(WebDriver driver,WebElement element) {
			Point position=driver.manage().window().getPosition();
			System.out.println(position);
			return position; 
		}
		
		/**
		 * This method is use for get the Position of X axis of the Window
		 * @param driver
		 * @param element
		 * @return 
		 */
		public int getPositionOfXaxis(WebDriver driver,WebElement element) {
			int positionOfXaxis = driver.manage().window().getPosition().getX();
			System.out.println(positionOfXaxis);
			return positionOfXaxis;
		}
		
		/**
		 * This method is use for get the Position of Y axis of the Window
		 * @param driver
		 * @param element
		 * @return 
		 */
		public int getPositionOfYaxis(WebDriver driver,WebElement element) {
			int positionOfYaxis = driver.manage().window().getPosition().getY();
			System.out.println(positionOfYaxis);
			return positionOfYaxis;
		}
		
		/**
		 * This method is use for set the Position of X & Y axis of the Window
		 * @param driver
		 * @param element
		 * @param x
		 * @param y
		 */
		public void setThePosition(WebDriver driver ,WebElement element,int x,int y) {
			Point position=new Point(x, y);
			driver.manage().window().setPosition(position);
		}
		
		/**
		 * This method is use for back To Previous Window
		 * @param driver
		 */
		public void backToPreviousWindow(WebDriver driver) {
			driver.navigate().back();
		}
		
		/**
		 * This method is use for Forward To Next Window
		 * @param driver
		 */
		public void forwardToNextWindo(WebDriver driver) {
			driver.navigate().forward();
		}
		
		/**
		 * This method is use for Refresh the Window
		 * @param driver
		 */
		public void refreshTheApplication(WebDriver driver) {
			driver.navigate().refresh();
		}
		
		//                 WebElement Method
		
		/**
		 * This method is use to verify the element is enabled or not
		 * @param driver
		 * @param element
		 * @param key
		 */
		public void isEnabledMethod(WebDriver driver,WebElement element,String key) {
			if (element.isEnabled()) {
				element.click();
				element.sendKeys(key);
			} else {
				System.out.println("element is Disabled");
			}
		}
		
		/**
		 * This method is use to verify the element is Display or not
		 * @param driver
		 * @param element
		 * @param key
		 */
		public void isDisplayMethod(WebDriver driver,WebElement element,String key) {
			if (element.isDisplayed()) {
				element.click();
				element.sendKeys(key);
			} else {
				System.out.println("element id not Display");
			}
		}
		
		/**
		 * This method is use to verify the element is Display or not
		 * @param driver
		 * @param element
		 * @param key
		 */
		public void isSelectMethod(WebDriver driver,WebElement element,String key) {
			if (element.isSelected()) {
				System.out.println(element+" is selected");
				
			} else {
				System.out.println("element id not Selected");
			}
		}
		 
		//                WaitMethod
		
		/**
		 * This method is use for 5 sec to load the url of the web page
		 * @param driver
		 */
		public void pageLoadTimeOutWait(WebDriver driver) {
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		}
		
		/**
		 * This method is use for wait 5 second to find the target element
		 * @param driver
		 */
		public void implicitlyWait(WebDriver driver) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}
		
		/**
		 * This method will wait for 10 second for a web element to become Clickable 
		 * @param driver
		 * @param element
		 */
		public void waitForElementToBeClickableUsingExplicitlyWait(WebDriver driver,WebElement element) {
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(element));
		}
		
		/**
		 * This method will wait for 10 second for a web element to become visible
		 * @param driver
		 * @param element
		 */
		public void waitForElementToBeVisibleUsingExplicitlyWait(WebDriver driver,WebElement element) {
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(element));
		}
		
		/**
		 * This method will wait for 10 second for a web element to become Clickable
		 * @param driver
		 * @param element
		 */
		public void waitForElementToBeClickableUsingFluentWait(WebDriver driver,WebElement element) {
			Wait <WebDriver> fluentWait = new FluentWait<WebDriver>(driver).
			withTimeout(Duration.ofSeconds(10)).
			pollingEvery(Duration.ofSeconds(2)).
			ignoring(NoSuchElementException.class);
			fluentWait.until(ExpectedConditions.elementToBeClickable(element));			
		}
		
		/**
		 * This method will wait for 10 second for a web element to become visible
		 * @param driver
		 * @param element
		 */
		public void waitForElementToBeVisibleUsingFluentWait(WebDriver driver,WebElement element) {
			Wait <WebDriver> fluentWait = new FluentWait<WebDriver>(driver).
			withTimeout(Duration.ofSeconds(10)).
			pollingEvery(Duration.ofSeconds(2)).
			ignoring(NoSuchElementException.class);
			fluentWait.until(ExpectedConditions.visibilityOf(element));			
		}
		
		/**
		 * takeScreenShot for full window
		 * @param driver
		 * @return 
		 * @throws IOException
		 */
		public File fullwindowScreenshot(WebDriver driver,String screenShotName) throws IOException {
			String timeStamp = LocalDateTime.now().toString();
			TakesScreenshot tss=(TakesScreenshot)driver;
			File src = tss.getScreenshotAs(OutputType.FILE);
			File dst=new File("E:\\SeleniumProgramming\\VtigerApplicationAutomationTesting\\Screenshot\\"+screenShotName+".png");
			System.out.println(timeStamp);
			FileUtils.copyFile(src,dst);
			return dst.getAbsoluteFile();
		}
		
		/**
		 * takeScreenShot for Element
		 * @param driver
		 * @param element
		 * @throws IOException
		 */
		public void elementScreenShot(WebDriver driver, WebElement element,String screenShotName) throws IOException {
			//String timeStamp = LocalDateTime.now().toString();
			File tempFile=element.getScreenshotAs(OutputType.FILE);
			File perFile = new File("./Screenshot/"+screenShotName+"1.png");
			FileUtils.copyFile(tempFile,perFile);
		}
		
		/**
		 * This method is use for Perform Click Action Using JavaScriptExecutor
		 * @param driver
		 * @param element
		 */
		public void PerformClickActionUsingJavaScriptExecutor(WebDriver driver,WebElement element) {
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("argument[0].click();",element);
		}
		
		/**
		 * This method is use for vertical scroll
		 * @param driver
		 */
		public void verticalScrollByAction(WebDriver driver) {
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,100)");
		}
		
		/**
		 * This method is use for Horizontal scroll
		 * @param driver
		 */
		public void horizontalScrollByAction(WebDriver driver) {
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("Window.scrollBy(100,0)");
		}
		
		//Actions Class
		/**
		 * this method is use for click action perform using Actions class
		 * @param driver
		 * @param element
		 */
		public void clickAction(WebDriver driver,WebElement element) {
			Actions actions=new Actions(driver);
			actions.click(element).perform();
		}
		
		/**
		 * This method will perform clickAndHold Action
		 * @param driver
		 * @param element
		 */
		public void clickAndHoldActions(WebDriver driver,WebElement element) {
			Actions actions=new Actions(driver);
			actions.clickAndHold().perform();
		}
		
		/**
		 * This method will perform SendKeys Action
		 * @param driver
		 * @param element
		 * @param value
		 */
		public void sendKeysActions(WebDriver driver,WebElement element,String value) {
			Actions actions=new Actions(driver);
			actions.sendKeys(element,value).perform();
		}
		
		/**
		 * This method will perform double Click Action
		 * @param driver
		 * @param element
		 */
		public void doubleClickAction(WebDriver driver,WebElement element) {
			Actions actions=new Actions(driver);
			actions.doubleClick(element).perform();
		}
		
		/**
		 * This method will perform right click action
		 * @param driver
		 * @param element
		 */
		public void rightClickAction(WebDriver driver,WebElement element) {
			Actions actions=new Actions(driver);
			actions.contextClick(element).perform();
		}
		
		/**
		 * This method will perform drag And Drop Action
		 * @param driver
		 * @param srcEle
		 * @param dstEle
		 */
		public void dragAndDropAction(WebDriver driver,WebElement srcEle,WebElement dstEle) {
			Actions actions=new Actions(driver);
			actions.dragAndDrop(srcEle,dstEle).perform();
		}
		
		/**
	     * This method will perform mouse Hovering Action
	     * @param driver
	     * @param element
	     */
		public void mouseHoveringAction(WebDriver driver,WebElement element) {
			Actions actions=new Actions(driver);
			actions.moveToElement(element).perform();
		}
		
		/**
		 * This method will perform accept the Alert popup
		 * @param driver
		 */
		public void acceptAlert(WebDriver driver) {
			driver.switchTo().alert().accept();
		}
		
		/**
		 * This method will perform cancel the Alert popup
		 * @param driver
		 */
		public void cancelAlert(WebDriver driver) {
			driver.switchTo().alert().dismiss();
		}
		
		/**
		 * This method will perform getText Alert popup
		 * @param driver
		 */
		public void getAlertText(WebDriver driver) {
			driver.switchTo().alert().getText();
		}
		
		/**
		 *  This method will perform scroll down operation
		 * @param driver
		 * @param text
		 */
		public void sendAlertText(WebDriver driver,String text) {
			driver.switchTo().alert().sendKeys(text);
		}
		
		
	    //Select Class
	/**
	 * This method will wait for 10 second for a web element to become visible
	 * @param driver
	 * @param element
	 */
	public void waitForElementToBeVisible(WebDriver driver,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * This method Will handle drop down on index 
	 * @param element
	 * @param index
	 */
	public void handalDropDown(WebElement element,int index) {
		Select select=new Select(element);
		select.selectByIndex(index);
	}

	/**
	 * This method Will handle drop down on index
	 * @param driver
	 * @param element
	 */
	public void handalDropDown(WebElement element,String value) {
		Select select=new Select(element);
		select.selectByValue(value);
	}

	/**
	 * This method Will handle drop down on visible text
	 * @param element
	 * @param text
	 */
	public void handalDropDown(String text,WebElement element) {
		Select select=new Select(element);
		select.selectByVisibleText(text);
	}
		
		/**
		 * Quit the Browser Window
		 * @param driver
		 */
		public void qutiAllWindowOperation(WebDriver driver) {
			driver.quit();
		}
		
		 
	}
 
