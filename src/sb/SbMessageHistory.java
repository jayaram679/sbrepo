package sb;

import static org.junit.Assert.assertThat;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.tools.ant.filters.LineContains.Contains;
import org.apache.tools.ant.filters.TokenFilter.ContainsString;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.Locatable;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class SbMessageHistory {
	@Test
	public void textfield() throws InterruptedException, AWTException {
		//try {
			System.setProperty("webdriver.chrome.driver","E:\\webdriver\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    WebDriverWait wait=new WebDriverWait(driver, 2000);
		    driver.get("http://alpha-sb.appspot.com/InitialAccountAction/getAccountInfo.do?accountNumber=8772998833");
		    driver.findElement(By.xpath("/html/body/div/div[2]/nav/a")).click();
		    WebElement email=driver.findElement(By.xpath("//*[@id='identifierId']"));
		    email.clear();
		    email.click();
		    email.sendKeys("jayaram.raju@anywhere.co");
		    driver.findElement(By.xpath("//*[@id='identifierNext']/content")).click();
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")));
		    driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).click();
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")));
		    driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("ysrcp6tdp");
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")));
		    driver.findElement(By.xpath("//*[@id='passwordNext']/content")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("/html/body/section/div[1]/div/i")).click();
		    Thread.sleep(500);
		    WebElement linetext=driver.findElement(By.xpath("//*[@id='message-form-holder']/header/textarea"));
			linetext.click();
			linetext.clear();
			linetext.sendKeys("sample test");
			linetext.getText();
			Thread.sleep(2000);
			System.out.println(linetext.getText());
		    WebElement name=driver.findElement(By.xpath("//*[@id='step_e83a223c-8479-4995-c582-8a34adc0fd71']/input"));
			name.click();
			name.clear();
			name.sendKeys("jayarama");
			WebElement phone=driver.findElement(By.xpath("//*[@id=\"step_7e9af29b-6795-46e6-ba62-ab85378b0f1b\"]/input[1]"));
			phone.click();
			phone.clear();
			phone.sendKeys("99000000000");
		    WebElement lastname=driver.findElement(By.xpath("//*[@id=\"step_1b87098a-7601-416c-8620-749343c3c49e\"]/input"));
			lastname.clear();
			lastname.click();
			lastname.sendKeys("rama"); 
			driver.findElement(By.xpath("//*[@id='verification_1b87098a-7601-416c-8620-749343c3c49e']/input")).click();
			
			WebElement address=driver.findElement(By.xpath("//*[@id=\"step_2c3ccda6-c3d9-4aec-b491-423f0840e8cc\"]/input"));
			address.clear();
			address.click();
			address.sendKeys("address");
			driver.findElement(By.xpath("//*[@id='verification_2c3ccda6-c3d9-4aec-b491-423f0840e8cc']/input")).click();
			
			WebElement city=driver.findElement(By.xpath("//*[@id='step_b7dd0e1e-05bb-493e-bbe6-4fc9126898b2']/input"));
			city.clear();
			city.click();
			city.sendKeys("Chennai");
			
			Select state=new Select(driver.findElement(By.xpath("//*[@id='step_20b18319-3e00-4033-8f41-5a7ef5af0bd9']/span/select")));
			state.selectByVisibleText("Arkansas");
			
			driver.findElement(By.xpath("//*[@id='radio_option_data_5c9a2eec-2bfc-48fa-b077-630ff90c4fa8']")).click();
			//message 2
			driver.findElement(By.xpath("//*[@id='step_7d2525fc-b73c-47ce-bf5f-0aa8464ef546']/textarea")).click();
			String expecte="hi my name is";
		driver.findElement(By.xpath("//*[@id='step_7d2525fc-b73c-47ce-bf5f-0aa8464ef546']/textarea")).sendKeys(expecte);
			
			driver.findElement(By.xpath("//*[@id='step_d6a1ad0b-471b-42c7-88d2-474f8cd49f11']/input")).click();
			driver.findElement(By.xpath("//*[@id='step_d6a1ad0b-471b-42c7-88d2-474f8cd49f11']/input")).sendKeys("just command");
			
//		
//		
//		System.out.println(select.getCssValue("border-color"));
//		js.executeScript("arguments[0].scrollIntoView();", select);
//		
//		Thread.sleep(10000);
//		System.out.println("1");
//		
//		select.click();		
//		System.out.println("1");
//		//driver.findElement(By.xpath("//*[@id='step_93b7c02d-5e46-483a-e017-fdae497022cb']/span/select")).click();
//		System.out.println("2");
//		WebElement mySelectElement = driver.findElement(By.xpath("//*[@id='step_93b7c02d-5e46-483a-e017-fdae497022cb']/span/select"));
//		System.out.println("3");
//		System.out.println(mySelectElement.getCssValue("border-color"));
//		Select dropdown1= new Select(mySelectElement);
//		//wait.until(ExpectedConditions.presenceOfElementLocated(dropdown.));
//		System.out.println("4");
//		System.out.println(dropdown.getOptions());
//		dropdown.selectByVisibleText("sampletest");
//		//dropdown.selectByIndex(1);
//		
		
		List<WebElement> del1 	=	driver.findElements(By.xpath("//*[@id='step_93b7c02d-5e46-483a-e017-fdae497022cb' and contains(@class,'dropdown-field') and not(ancestor::div[contains(@style,'display:none')])]"));
		System.out.println(del1.size());
		for(WebElement d : del1) {
			
			System.out.println(d.getCssValue("display"));
		}
		
		
		List <WebElement> delivery =driver.findElements(By.xpath("//*[@id='step_93b7c02d-5e46-483a-e017-fdae497022cb' and contains(@class,'dropdown-field') and not(ancestor::div[contains(@style,'display: none')])]/span/select"));
		System.out.println("the hiden xpath:"+delivery.size());
		for (int j=0;j<delivery.size();j++) {
			int y=	delivery.get(j).getLocation().getX();
			System.out.println(delivery.get(j).getCssValue("display"));
			System.out.println(delivery.get(j).isDisplayed());
			System.out.println(delivery.get(j).getAttribute("class"));
			if(y!=0) {
				delivery.get(j).sendKeys("Ashwin's test");
				Select del=new Select(delivery.get(j));
				del.selectByVisibleText("Ashwin's test");
				break;
			}
		}
//		
//		List<WebElement> finish=driver.findElements(By.xpath("//*[@id=\"step_93b7c02d-5e46-483a-e017-fdae497022cb\"]/i"));
//		System.out.println("the hiden xpath:"+finish.size());
//		
//		for (int i=0;i<finish.size();i++) {
//			
//			int x=	finish.get(i).getLocation().getX();
//		
//			if(x!=0) {
//				finish.get(i).click();
//				break;
//			}
//		}	
//		driver.navigate().refresh();
//		
//		driver.findElement(By.xpath("/html/body/section/div[1]/div/i")).click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section/div[1]/div/i")));
//		//driver.findElement(By.xpath("//*[@id='step_93b7c02d-5e46-483a-e017-fdae497022cb']/i")).click();  
//		Thread.sleep(2000);
//		driver.findElement(By.id("messagehistory")).click(); 
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("messagehistory")));
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@id='messageHistoryList']/div[4]/ul/li[2]")).click();
//		//driver.findElement(By.xpath("//*[@id='msg_8910306f-d0f6-41e8-8797-93a9be72f527']")).click();
//		String actual=driver.findElement(By.xpath("//*[@id='message-content-body']/p[22]")).getText();
//		System.out.println("The output of actual result="+actual);
//		
//		Assert.assertTrue("Both expected and actual are not same hence it is not verified", actual.contains(expecte));
//		//Assert.assertEquals("Both expected and actual are not same hence it is not verified", expecte,actual);
//		
//		System.out.println("Both expected and actual are same hence it is verified");
		
		
		
		
		
		
		



		
		
		
//		}
//		catch(Exception e) {
//			System.out.println("Find the exception =="+ e);
//		}
			
//		}
		
		}
	}
	



