package Test_Cases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckNewAccountCreationWith_InvalidInputs {

	
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
		   driver.findElement(By.id("hash_tag")).sendKeys("Yashs");
		   driver.findElement(By.id("nextBtn")).click();
		   driver.findElement(By.partialLinkText("Buy Hashtag")).click();
		   driver.findElement(By.id("firstName")).click();
		   driver.findElement(By.id("firstName")).sendKeys("ddeedd");
		   driver.findElement(By.id("lastName")).click();
		   driver.findElement(By.id("lastName")).sendKeys("dwdwdwsd");
		   driver.findElement(By.id("phoneNumber")).click();
		   driver.findElement(By.id("phoneNumber")).sendKeys("434454534534534534");
		   driver.findElement(By.id("accountPassword")).click();
		   driver.findElement(By.id("accountPassword")).sendKeys("3fderfrefref");
		   driver.findElement(By.id("emailAddress")).click();
		   driver.findElement(By.id("emailAddress")).sendKeys("fvfvffff@dfcddf.com");
		   Select day = new Select(driver.findElement(By.id("dobday")));
		       day.selectByIndex(10);
		   Select month = new Select(driver.findElement(By.id("dobmonth")));
		       month.selectByIndex(8);
		   Select year = new Select(driver.findElement(By.id("dobyear")));
		       year.selectByIndex(13);
		   Select gender = new Select(driver.findElement(By.id("drdGender")));
		       gender.selectByIndex(2);
		   driver.findElement(By.id("nextBtn")).click();
		   driver.findElement(By.id("nextBtn")).click();
	       driver.navigate().back();
	       driver.navigate().back();
	       driver.findElement(By.id("username")).sendKeys("434454534534534534");
	       driver.findElement(By.id("nextBtn")).click();
	       driver.close();
	
	
	
	}

}
