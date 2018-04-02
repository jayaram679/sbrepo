package sb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Feedback {
	@Test
	public void attach()  {
		try {
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
		    
		   
		    driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/ul/li[3]")).click();
		    //driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[3]/div[1]/div[1]/input")).click();
		    driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[3]/div[1]/div[1]/input")).sendKeys("C:\\Users\\User\\Downloads\\testcase.png");
		    
			
			
		}
		catch(Exception e) {
		System.out.println("Find the exception =="+ e);
	}
			

	}
}
