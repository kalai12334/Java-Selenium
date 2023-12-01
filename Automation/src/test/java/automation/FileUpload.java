package automation;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		WebElement upload =driver.findElement(By.xpath(""));
		
		upload.sendKeys(System.getProperty("user.dir"+"/file"));
		
		
		
}

	}
