package Test_Cases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckNewAccountCreationWith_ValidInputs {

	public static void main(String[] args) {
		
	
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://www.heyfind.me/");
	   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	   driver.manage().window().maximize();
	   driver.manage().deleteAllCookies();
	   driver.findElement(By.xpath("//div[@class='menu-btn-container']")).click();
	   driver.findElement(By.linkText("Account Sign In")).click();
	   driver.findElement(By.id("createAccount")).click();
	   driver.findElement(By.id("hash_tag")).click();
	   driver.findElement(By.id("hash_tag")).sendKeys("Yash");
	   driver.findElement(By.id("nextBtn")).click();
	   driver.findElement(By.partialLinkText("Buy Hashtag")).click();
	   driver.findElement(By.id("firstName")).click();
	   driver.findElement(By.id("firstName")).sendKeys("Satish");
	   driver.findElement(By.id("lastName")).click();
	   driver.findElement(By.id("lastName")).sendKeys("Gude");
	   driver.findElement(By.id("phoneNumber")).click();
	   driver.findElement(By.id("phoneNumber")).sendKeys("9490111674");
	   driver.findElement(By.id("accountPassword")).click();
	   driver.findElement(By.id("accountPassword")).sendKeys("Satish@123");
	   driver.findElement(By.id("emailAddress")).click();
	   driver.findElement(By.id("emailAddress")).sendKeys("satishgude920@gmail.com");
	   Select day = new Select(driver.findElement(By.id("dobday")));
	       day.selectByIndex(9);
	   Select month = new Select(driver.findElement(By.id("dobmonth")));
	       month.selectByIndex(6);
	   Select year = new Select(driver.findElement(By.id("dobyear")));
	       year.selectByIndex(12);
	   Select gender = new Select(driver.findElement(By.id("drdGender")));
	       gender.selectByIndex(1);
	   driver.findElement(By.id("nextBtn")).click();
	   driver.findElement(By.id("nextBtn")).click();
	   driver.navigate().back();
       driver.navigate().back();
       driver.findElement(By.id("username")).sendKeys("9490111674");
       driver.findElement(By.id("nextBtn")).click();
	   driver.close();
	  
	
	}

}
