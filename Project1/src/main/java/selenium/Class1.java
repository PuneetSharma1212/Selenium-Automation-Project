package selenium;



import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Puneet Sharma\\Desktop\\Puneet Study\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

/*	System.out.println(driver.getTitle());	
    System.out.println(driver.getCurrentUrl());
    System.out.println(driver.getPageSource());
    driver.navigate().back();
    driver.quit();
 */
    
    driver.get("http://uniformm1.upskills.in/admin/index.php?route=common/login");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    
    driver.findElement(By.xpath("//*[@id=\"input-username\"]")).sendKeys("admin");
    driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("admin@123");
    driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div[2]/form/div[3]/button")).click();
    
    Actions act = new Actions(driver);
    act.moveToElement(driver.findElement(By.xpath("//*[@id=\"customer\"]/a/i"))).perform();
    
    
    driver.findElement(By.xpath("//*[@id=\"customer\"]/ul/li[2]/a")).click();
    driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/a/i")).click();
    
    driver.findElement(By.xpath("//*[@id=\"form-customer-group\"]/div[1]/div/div/input")).sendKeys("Mike");
    driver.findElement(By.xpath("//*[@id=\"input-description1\"]")).sendKeys("Test description");
    driver.findElement(By.xpath("//*[@id=\"form-customer-group\"]/div[3]/div/label[1]/input")).click();
    driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/button")).click();
	
    
    
    act.moveToElement(driver.findElement(By.xpath("//*[@id=\\\"customer\\\"]/a/i"))).perform();
    
    driver.findElement(By.xpath("//*[@id=\"customer\"]/ul/li[1]/a")).click();
    
    driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Puneet");
    driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("Sharma");
    driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("abcd@gmail.com");
    driver.findElement(By.xpath("//*[@id=\"input-telephone\"]")).sendKeys("01212111111");
    driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/button")).click();
    
    driver.quit();
	}

}

