package com.adactin.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver getBrowser(String browserName) {
		try {
			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
				driver = new ChromeDriver();
			}else if (browserName.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", ".\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}else {
				System.out.println("Invalid BrowserName");
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //implicit wait
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
	}

	public static void getWebpage(String Url) {
		driver.navigate().to(Url);
	}

	public static void backToWebpage() {
		driver.navigate().back();
	}

	public static void getNextWebpage() {
		driver.navigate().forward();
	}

	public static void refreshWebpage() {
		driver.navigate().refresh();
	}

	public static void getUrl(String Url) {
		driver.get(Url);
	}

	public static String getCurrentWebpageUrl() {
		return driver.getCurrentUrl();
	}

	public static String getWebpageTitle() {
		return driver.getTitle();
	}

	public static void closeConnection() {
		driver.close();
	}

	public static void terminateSession() {
		driver.quit();
	}

	public static void inputToElement(WebElement element, String input) {
		try {
			element.sendKeys(input);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void clickOnElement(WebElement element) {
		waitForElement(element);
		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void clickOnElementUsingJs(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", element);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String getElementText(WebElement element) {
		return element.getText();
	}

	public static String getAttributeValue(WebElement element, String attributeName) {
		return element.getAttribute(attributeName);
	}

	public static boolean getElementState(WebElement element) {
		return element.isEnabled();
	}

	public static boolean getElementDisplayStatus(WebElement element) {
		return element.isDisplayed();
	}

	public static boolean getElementSelectionState(WebElement element) {
		return element.isSelected();
	}

	public static void moveToElement(WebElement element) {
		waitForElement(element);
		try {
			Actions ac = new Actions(driver);
			ac.moveToElement(element).perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void moveToElementClick(WebElement element) {
		Actions ac = new Actions(driver);
		ac.click(element).perform();
	}

	public static void selectDropDown(WebElement element, String value, String option) {
		if (option.equalsIgnoreCase("value")) {
			Select s = new Select(element);
			s.selectByValue(value);
		}
		if (option.equalsIgnoreCase("text")) {
			Select s = new Select(element);
			s.selectByVisibleText(value);
		}
		if (option.equalsIgnoreCase("index")) {
			Select s = new Select(element);
			s.selectByIndex(Integer.parseInt(value));
		}
	}

	public static void waitForElement(WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30); //explicit wait
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void scrollElementToView(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", element);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void scrollByWindowToView(WebElement element, int x, int y) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy("+ x + "," + y +")", element);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void switchIntoFrame(WebElement element) {
		try {
			driver.switchTo().frame(element);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void switchIntoFrameUsingId(String option, int index) {
		try {
			if(option.equalsIgnoreCase("id")) {
				driver.switchTo().frame(index);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void switchIntoFrameUsingName(String option, String name) {
		try {
			if(option.equalsIgnoreCase("Framename")) {
				driver.switchTo().frame(name);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void windowHandle(String options) {
		if(options.equalsIgnoreCase("parentWindow")) {
			String parentWindowId = driver.getWindowHandle();
			System.out.println(parentWindowId);
			String parentWindowTitle = driver.switchTo().window(parentWindowId).getTitle();
			System.out.println(parentWindowTitle);
		} else if (options.equalsIgnoreCase("allWindows")) {
			Set<String> allWindowIds = driver.getWindowHandles();
			for (String id : allWindowIds) {
				String windowTitles = driver.switchTo().window(id).getTitle();
				System.out.println(windowTitles);
			}
		}
	}
	
	public static void getScreenshot(String fileName) throws IOException {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File srcFile = ts.getScreenshotAs(OutputType.FILE);
			File desFile = new File(System.getProperty("user.dir") + "\\Screenshot\\" + fileName + ".png");
			FileUtils.copyFile(srcFile, desFile);
		} catch (WebDriverException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
