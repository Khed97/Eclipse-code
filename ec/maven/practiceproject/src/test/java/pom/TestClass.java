package pom;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass extends Screenshot implements ITestNGListener{
	static WebDriver driver;
	LoginPom login;
	Screenshot sc;
	
	@BeforeMethod(enabled=false)
	public void Hii () {
		System.out.println("This is before method");
	}
	
	@Test(enabled=false)
	public void SelectbyIndex() throws IOException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();        
//        driver.get("https://techcanvass.com/Examples/multi-select.html");
//        driver.get("https://www.google.com/");
		login = new LoginPom(driver);
//		 login.SelectCarBrand();
//		 login.clickOnGmail();
		 login.SelectCarBrand();
		 String title = driver.getTitle();
//		 Assert.assertEquals(title, "hi");
//        File s =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        File d = new File("C:/Users/Admin/Desktop/Screenshot/pqr.bmp");
//        FileUtils.copyFile(s,d);
	}
	
	@Test(enabled=false)
	public void iframeTest () throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(); // browser launch 
        driver.manage().window().maximize();
        Thread.sleep(3000);
//        Dimension d = new Dimension(300,700);
//        driver.manage().window().setSize(d);
//        Point p = new Point (500,800);
//        System.out.println("the values of point refrence is" + p);
//        driver.manage().window().setPosition(p);
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
		driver.switchTo().frame("packageFrame");
		login = new LoginPom(driver);
		login.clickOnActionsLink();
		System.out.println("clicked on actions button");
	}

	@Test
	public void openMavenWebsite()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver ();
        driver.manage().window().maximize();

		driver.get("https://mvnrepository.com/artifact/commons-io/commons-io/2.11.0");
	}
	
	@AfterMethod(enabled=false)
	public void hello() throws IOException {
		System.out.println("THis is after method ");
		File s =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File d = new File("/home/kedar/Desktop/Screenshot/hello.png");
				
		FileUtils.copyFile(s, d);
		driver.quit();
		
		
		
	}
	
//	public class GetScreenshot {


	
	@AfterMethod
	public void onTestFailure (ITestResult result) {
		try {
			sc= new Screenshot();
			sc.GetScreenshot.capture(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	@AfterTest
//	@AfterMethod
	@Test (enabled=false)
	public void getDataFromExcelSheet () throws EncryptedDocumentException, IOException {
//		FileInputStream excel=new FileInputStream("/home/kedar/Documents/dataImp.docx");
//		
//		Sheet a=WorkbookFactory.create(excel).getSheet("Sheet1");
//		int rowno=a.getPhysicalNumberOfRows();//5
//		for(int i=0;i<rowno;i++) {//0 1 2 3 4
//			int cellno=a.getRow(i).getPhysicalNumberOfCells();//3
//			for(int j=0;j<cellno;j++) {//0 1 2
//				String ss=a.getRow(i).getCell(j).getStringCellValue();//(1,0)
//				System.out.print("this is data " +ss);
//			}
//			System.out.println();
//		}
		
		//System.out.println(rowno);//4
		
		FileInputStream excel = new FileInputStream("/home/kedar/Desktop/kalepsh bhai ki jodi.xlsx");
		
	    Sheet a= WorkbookFactory.create(excel).getSheet("Sheet1");
			
			String b= a.getRow(0).getCell(0).getStringCellValue();
			long c=   (long) a.getRow(0).getCell(1).getNumericCellValue();
		

	}
	
//	FileInputStream excel = new FileInputStream("C:/Users/HP/OneDrive/Desktop/xyz.xlsx");
//	
//    Sheet a= WorkbookFactory.create(excel).getSheet("Sheet1");
//		
//		String b= a.getRow(0).getCell(0).getStringCellValue();
//		long c=   (long) a.getRow(4).getCell(0).getNumericCellValue();
//	
//
	
	
	
//		
//		System.out.println(b);
//		System.out.println(c);

	




