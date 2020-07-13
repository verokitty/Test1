package Proj_Appli_Maven.Project_Mav;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home_Page {
	WebDriver driver;
	public void Initiatedriver() {
			
			try {
				System.setProperty("webdriver.chrome.driver", "G:\\Milli-Appli_Poject\\Resources\\Drivers\\chromedriver.exe");
				
			//extent=new ExtentReports("G:/Milli-Appli_Poject/Report/TestReportCookie.html");//"G:/Milli-Appli_Poject/Report/TestReportCookie.html",true

			
			 driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://us.milliman.com");
			}catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e);
				//e.printStackTrace();
			}
		}
	
	public void verifypageLogoworking() throws InterruptedException {
		//test=extent.startTest("verifypageLogoworking()...");
		String HomePageTittle=driver.getTitle().toString();
		//test.log(LogStatus.INFO, "verifypageLogoworking");
		
		WebDriverWait wait=new WebDriverWait(driver, 40);
		//WebElement Logo =driver.findElement(By.cssSelector("div.page:nth-child(4) div.top-level-menu-rendering.rendering.transparent-treatment.white-content.blue-button.show-light-icons:nth-child(1) div.color-overlay.content-styling:nth-child(1) div.container div.row div.col.navigation-container div.dropdown.collapsibleNav div.height-spacer div.nav-content div.logo a:nth-child(1) > img.light-icon"));
		WebElement Logo =wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.page:nth-child(4) div.top-level-menu-rendering.rendering.transparent-treatment.white-content.blue-button.show-light-icons:nth-child(1) div.color-overlay.content-styling:nth-child(1) div.container div.row div.col.navigation-container div.dropdown.collapsibleNav div.height-spacer div.nav-content div.logo a:nth-child(1) > img.light-icon")));
		Logo.click();
		String HomePageTittlelogo=driver.getTitle().toString();
		if (HomePageTittle.contentEquals("Milliman | US")){
			System.out.println("US Milliman Home page Logo working"+HomePageTittlelogo);
		
			//test.log(LogStatus.PASS, "US Milliman Home page Logo working"+HomePageTittlelogo);
		}
		else 
			{System.out.println("US Milliman Home page Logo redirected to page other than Home page:"+HomePageTittlelogo);
			//test.log(LogStatus.FAIL, "US Milliman Home page Logo redirected to page other than Home page:"+HomePageTittlelogo);
			Assert.fail();
			}
		//extent.endTest(test);
	}
}




