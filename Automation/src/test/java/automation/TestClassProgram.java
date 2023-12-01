package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestClassProgram {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\kalai\\Documents\\Test\\Automation\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
//	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	driver.manage().window();
//	Thread.sleep(5000);
//	WebElement userName=driver.findElement(By.xpath("//input[starts-with(@placeholder,'Username')]"));
//	userName.sendKeys("Admin");
//	WebElement password=driver.findElement(By.xpath("//input[starts-with(@placeholder,'Password')]"));
//	password.sendKeys("admin123");
//	Thread.sleep(2000);
//	WebElement button=driver.findElement(By.xpath("//button[@type='submit']"));
//	button.click();
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
//   // WebDriverWait wait2 = new WebDriverWait(driver, 20);
//   // wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//button[@type='button' and @class='oxd-icon-button oxd-main-menu-button']")));
//    driver.findElement(By.xpath("//button[@type='button']//i[@class='oxd-icon bi-stopwatch']")).click();
//    Thread.sleep(3000);
	driver.get("https://cosmocode.io/automation-practice-webtable/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS); 
	JavascriptExecutor js = (JavascriptExecutor) driver;
	// This  will scroll down the page by  1000 pixel vertical		
    js.executeScript("window.scrollBy(0,1000)");
    
      driver.findElement(By.xpath("//tbody//tr[3]//td[1]//input")).click();
      Thread.sleep(1000);
   //   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
      driver.findElement(By.xpath("//strong[text()='Andorra']//preceding::td[1]//input")).click();
    
    driver.quit();
}
}