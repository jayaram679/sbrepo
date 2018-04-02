package sb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.Locatable;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.NoInjection;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class DynamicSwitch {

	public WebDriver driver;

	@Test
	public void first() throws AWTException, InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\webdriver\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		// WebDriver driver = new ChromeDriver(options);
		driver = new ChromeDriver(options);
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		driver.get("http://live-formcreator.appspot.com/index.jsp?playGroundAccountNumber=0001211135");
		String patentwindow = driver.getWindowHandle();
		//
		driver.findElement(By.cssSelector("a.icon.google")).click();
		// Enter user name
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("jayaram.raju@anywhere.co");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
		// Enter Password
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("ysrcp6tdp");
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='add_new_form']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='add_new_form']")));
	
		//driver.findElement(By.cssSelector("em#add_new_form.btn_cst")).click();
		// -----------------------------------Name-----------------------------------------------//

		Point start = driver.findElement(By.cssSelector("li#fullName_pannel.field_btn")).getLocation();
		Point end = driver.findElement(By.xpath("//*[@id=\"add_new_form\"]")).getLocation();
		// getting the values of start x and y.
		int S = start.getX();
		int E = start.getY();
		// System.out.println(S);
		// System.out.println(E);
		// getting the values of end x and y
		int A = end.getX();
		int B = end.getY();
		System.out.println(A);
		System.out.println(B);
		Robot robot = new Robot();
		robot.mouseMove(S, E);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		  for (; S < A; S++) {
			System.out.println("moving x : " + S + ", y : " + E);
			Thread.sleep(1);
			robot.mouseMove(S, E);
		}
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

		// -------------------------phone----------------------//
		Point startph = driver.findElement(By.cssSelector("li#lphone_pannel.field_btn")).getLocation();
		Point endph = driver.findElement(By.xpath("//*[@id=\"add_new_form\"]")).getLocation();
		// getting the values of start x and y.
		int p = startph.getX();
		int h = startph.getY();
		// System.out.println(S);
		// System.out.println(E);
		// getting the values of end x and y
		int n = endph.getX();
		// int u = endph.getY();
		// System.out.println(A);
		// System.out.println(B);
		Robot robot1 = new Robot();
		robot1.mouseMove(p, h);
		robot1.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		for (; p < n; p++) {
			System.out.println("moving x : " + p + ", y : " + h);
			Thread.sleep(2);
			robot1.mouseMove(p, h);
		}
		robot1.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		// ---------------------------email--------------------------------//
		Point startem = driver.findElement(By.cssSelector("li#email_pannel.field_btn")).getLocation();
		Point endem = driver.findElement(By.xpath("//*[@id=\"add_new_form\"]")).getLocation();
		// getting the values of start x and y.
		int e = startem.getX();
		int m = startem.getY();
		int i = endem.getX();
		// int d=endph.getY();
		Robot robot2 = new Robot();
		robot2.mouseMove(e, m);
		robot2.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		for (; e < i; e++) {
			System.out.println("moving x : " + e + ", y : " + m);
			Thread.sleep(2);
			robot2.mouseMove(e, m);
		}
		robot2.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	/*	// ---------------------------------Drag down---------------------------//
		WebElement startdown = driver.findElement(By.xpath("//*[@id=\"first_row\"]"));
		startdown.click();
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);                                                                       */
		// ---------------------------------------city------------------------------//
		
		//Point startcy = driver.findElement(By.cssSelector("li#city_pannel.field_btn")).getLocation();
		// WebElement sourceelement  = driver.findElement(By.cssSelector("li#city_pannel.field_btn"));//*[@id="dropDown_pannel"]
		WebElement sourceelement  = driver.findElement(By.xpath("//*[@id=\"dropDown_pannel\"]")); 
	       Point startcy= ((Locatable)sourceelement).getCoordinates().inViewPort();
	    
	    Point startcyi = driver.findElement(By.cssSelector("li#city_pannel.field_btn")).getLocation();
		Point endcy = driver.findElement(By.xpath("//*[@id=\"add_new_form\"]")).getLocation();
		// getting the values of start x and y.
		int c = startcyi.getX();
		int y = startcyi.getY();
		// System.out.println(S);
		// System.out.println(E);
		// getting the values of end x and y
		int x = endcy.getX();
		// int d=endph.getY();
		// System.out.println(A);
		// System.out.println(B);
		Robot robot3 = new Robot();
		robot3.mouseMove(c, y);
		robot3.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		for (; c < x; c++) {
			System.out.println("moving x : " + c + ", y : " + y);
			Thread.sleep(2);
			robot3.mouseMove(c, y);
		}
		robot3.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

		// --------------------------------state---------------------------------//
		Point startst = driver.findElement(By.cssSelector("li#state_pannel.field_btn")).getLocation();
		Point endst = driver.findElement(By.xpath("//*[@id=\"add_new_form\"]")).getLocation();
		// getting the values of start x and y.
		int x1 = startst.getX();
		int y1 = startst.getY();
		// System.out.println(S);
		// System.out.println(E);
		// getting the values of end x and y
		int x2 = endst.getX();
		// int y2=endph.getY();
		// System.out.println(A);
		// System.out.println(B);
		Robot robot5 = new Robot();
		robot5.mouseMove(x1, y1);
		robot5.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		for (; x1 < x2; x1++) {
			System.out.println("moving x : " + x1 + ", y : " + y1);
			Thread.sleep(2);
			robot5.mouseMove(x1, y1);
		}
		robot5.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		// -----------------------------------------Zipcode-----------------------------------//
		Point startzip = driver.findElement(By.cssSelector("li#zipPostalCode_pannel.field_btn")).getLocation();
		Point endzip = driver.findElement(By.xpath("//*[@id=\"add_new_form\"]")).getLocation();
		// getting the values of start x and y.
		int a1 = startzip.getX();
		int b1 = startzip.getY();
		// System.out.println(S);
		// System.out.println(E);
		// getting the values of end x and y
		int a2 = endzip.getX();
		// int b2=endph.getY();
		// System.out.println(A);
		// System.out.println(B);
		Robot robot6 = new Robot();
		robot6.mouseMove(a1, b1);
		robot6.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		for (; a1 < a2; a1++) {
			System.out.println("moving x : " + a1 + ", y : " + b1);
			Thread.sleep(2);
			robot6.mouseMove(a1, b1);
		}
		robot6.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(1000);
		// --------------------------------------date----------------------------------//
		Point startdate = driver.findElement(By.cssSelector("li#date_pannel.field_btn")).getLocation();
		Point enddate = driver.findElement(By.xpath("//*[@id=\"add_new_form\"]")).getLocation();
		// getting the values of start x and y.
		int c1 = startdate.getX();
		int d1 = startdate.getY();
		// System.out.println(S);
		// System.out.println(E);
		// getting the values of end x and y
		int c2 = enddate.getX();
		int d2 = enddate.getY();
		// System.out.println(A);
		// System.out.println(B);
		Robot robot7 = new Robot();
		robot7.mouseMove(c1, d1);
		robot7.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		for (; c1 < c2 ; c1++) {
			System.out.println("moving x : " + c1 + ", y : " + d1);
			Thread.sleep(1);
			robot7.mouseMove(c1, d1 );
		}
		robot7.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		

	// --------------------------savebutton------------------//
		// WebDriverWait wait=new WebDriverWait(driver,20);
		driver.findElement(By.xpath("/html/body/div[9]/div[3]/button[1]")).click();
		driver.findElement(By.xpath("//div[@class='save_fields_holder']/div[2]/div[1]")).click();
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[@class='save_fields_holder']/div[2]/div[1]")));
		
		// --------------------------publishbutton-------------------//
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='save_fields_holder']/div[4]/div[1]")).click();
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[@class='save_fields_holder']/div[4]/div[1]")));
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[9]/div[3]/button[1]")).click();

		Thread.sleep(3000);
		Robot robot15 = new Robot();
		robot15.keyPress(KeyEvent.VK_ESCAPE);
		robot15.keyRelease(KeyEvent.VK_ESCAPE);

		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/a[3]")).click();

		Thread.sleep(10000);

		Robot robot16 = new Robot();
		robot16.keyPress(KeyEvent.VK_ESCAPE);
		robot16.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(1000);

		for (String newwindow : driver.getWindowHandles()) {
			driver.switchTo().window(newwindow);
		}

		Thread.sleep(1000);
		WebElement form = driver.findElement(By.xpath("//*[@id=\"message-form-holder\"]/header/textarea"));

		form.click();
		form.clear();
		form.sendKeys("jjajasasjasjaaja");                 

	}
}
