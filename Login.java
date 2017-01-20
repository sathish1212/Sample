package JenkiTest;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeUnit;
//import org.openqa.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.ie.InternetExplorerDriver;

@Test public class Login {

	public static WebDriver g = new FirefoxDriver();
	

	public void accessurlsathish() throws Exception {
		
		g.get("http://angler26/TimeCheck2Jun6/Index.aspx");
		g.manage().window().maximize();
		g.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		g.findElement(By.xpath("//*[@id='txt_UserName']")).sendKeys("admin");
		g.findElement(By.xpath("//*[@id='txt_Password']")).sendKeys("welcome");
		g.findElement(By.xpath("//*[@id='btn_Enter']")).click(); 
		Thread.sleep(1000); 
	
	}
	
	@Test(priority = 1)
	public void Religion()
{
	WebElement element = g.findElement (By.linkText("Masters"));
	Actions action =new Actions(g);
	action.moveToElement(element).perform();
	
	WebElement Submenu = (new WebDriverWait(g, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Generic"))));
	action.moveToElement(Submenu);
	action.click();
	action.perform();
	System.out.println("Reached Generic");
	
	g.findElement(By.xpath(".//*[@id='ctl00_BodyContentPH_lbl_Religion']")).click();
	g.findElement(By.xpath(".//*[@id='ctl00_BodyContentPH_btn_add']")).click();
	g.findElement(By.xpath(".//*[@id='ctl00_BodyContentPH_txt_ReligionName']")).sendKeys("Christian");
	g.findElement(By.xpath(".//*[@id='ctl00_BodyContentPH_txt_ReligionDescription']")).sendKeys("Christian");
	g.findElement(By.xpath(".//*[@id='ctl00_BodyContentPH_btn_save']")).click();
	g.switchTo().alert().accept();
	g.switchTo().alert().accept();

} 
    
	
}