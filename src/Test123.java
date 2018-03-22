import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "V:\\Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		
		Driver.get("http://jsbin.com/usidix/1");
		Driver.findElement(By.tagName("input")).click();
		Driver.switchTo().alert();
		Alert ale=Driver.switchTo().alert();
		ale.accept();
		Driver.close();

	}

}
