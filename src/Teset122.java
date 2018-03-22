import org.openqa.selenium.firefox.FirefoxDriver;
public class Teset122 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","V:\\Testing\\geckodriver-v0.11.0-win64\\geckodriver.exe\\" );
		
		
		FirefoxDriver driver =new FirefoxDriver();
		String expectedTitle=("Gmail");
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		String actualTitle=driver.getTitle();
		if (expectedTitle.equals(actualTitle))
		{
			System.out.println("Test passed");
			
		}
		else
		{
			System.out.println("Test failed");
			
		}
	}

}




