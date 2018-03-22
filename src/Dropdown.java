import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Dropdown {
WebDriver driver;

	@Test
	public void login() throws Exception{
		

		System.setProperty("webdriver.chrome.driver","V:\\Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	
	driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("raja");
	driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("wss");
	
	}
	
	

}
