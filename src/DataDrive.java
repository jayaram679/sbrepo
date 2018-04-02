

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.model.WorkbookRecordList;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrive 
{
     WebDriver driver;
	
	@Test(dataProvider="testname")
	public void sample(String name1,String phone1,String lastname1,String address1,String city1) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\webdriver\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
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
	    Thread.sleep(3000);
	    WebElement name=driver.findElement(By.xpath("//*[@id='step_e83a223c-8479-4995-c582-8a34adc0fd71']/input"));
		name.click();
		name.clear();
		name.sendKeys(name1);
		WebElement phone=driver.findElement(By.xpath("//*[@id='step_7e9af29b-6795-46e6-ba62-ab85378b0f1b']/input[1]"));
		phone.click();
		phone.clear();
		phone.sendKeys(String.valueOf(phone1));
		driver.findElement(By.xpath("//*[@id='verification_7e9af29b-6795-46e6-ba62-ab85378b0f1b']/input")).click();
	    WebElement lastname=driver.findElement(By.xpath("//*[@id=\"step_1b87098a-7601-416c-8620-749343c3c49e\"]/input"));
		lastname.clear();
		lastname.click();
		lastname.sendKeys(lastname1); 
		driver.findElement(By.xpath("//*[@id='verification_1b87098a-7601-416c-8620-749343c3c49e']/input")).click();
		WebElement address=driver.findElement(By.xpath("//*[@id=\"step_2c3ccda6-c3d9-4aec-b491-423f0840e8cc\"]/input"));
		address.clear();
		address.click();
		address.sendKeys(address1);
		driver.findElement(By.xpath("//*[@id='verification_2c3ccda6-c3d9-4aec-b491-423f0840e8cc']/input")).click();
		WebElement city=driver.findElement(By.xpath("//*[@id='step_b7dd0e1e-05bb-493e-bbe6-4fc9126898b2']/input"));
		city.clear();
		city.click();
		city.sendKeys(city1);
		driver.findElement(By.xpath("//*[@id=\"radio_option_data_7b0c0967-e4ff-4140-8062-e1ac8c65b47b\"]")).click();
	    driver.findElement(By.xpath("//*[@id='radio_option_data_333c3268-9708-4666-a449-06483106ca3f']")).click();
		List<WebElement> delivery= driver.findElements(By.xpath("//div[@id='step_8d183565-6c1e-4d1e-ac5f-f9060965bc07']/span/select"));
		System.out.println(delivery.size());
		delivery.get(2).sendKeys("sampletest");
		List<WebElement> finish=driver.findElements(By.xpath("//div[@id='step_8d183565-6c1e-4d1e-ac5f-f9060965bc07']/i"));
        finish.get(2).click();
	}
	@DataProvider(name="testname")
	public Object[][] enterData()
	{
		Object[][] a=new Object[2][5];
		try
		{
			File src=new File("E:\\webdriver\\TestData.xlsx");
			FileInputStream fis= new FileInputStream(src);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sheet1=wb.getSheetAt(0);
			int rowcount=sheet1.getLastRowNum();
			System.out.println("count : " + rowcount);
			for (int i=1;i<=rowcount;i++)
			{
				a[i-1][0]=sheet1.getRow(i).getCell(0).getNumericCellValue();
				a[i-1][1]=sheet1.getRow(i).getCell(1).getNumericCellValue();
				a[i-1][2]=sheet1.getRow(i).getCell(2).getStringCellValue();
				a[i-1][3]=sheet1.getRow(i).getCell(3).getStringCellValue();
				a[i-1][4]=sheet1.getRow(i).getCell(4).getStringCellValue();
				
				System.out.println(a[i-1][0]);
				System.out.println(a[i-1][1]);
				System.out.println(a[i-1][2]);
				System.out.println(a[i-1][3]);
				System.out.println(a[i-1][4]);
			}
		}
		catch(Exception e)
		{
			System.out.println("Enter error message:"+e);
		}
		return a;
	}
}
	
