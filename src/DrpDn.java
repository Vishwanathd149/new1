import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DrpDn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","V:\\Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.expedia.ca/");
		Select s= new Select(driver.findElement(By.id("hotel-1-adults-hp-hotel")));
		//s.selectByIndex(2);
		List <WebElement> ele =s.getOptions();
		
		/*for(WebElement eleme: ele) {
			String st= ele.getText();
			System.out.println(st);
		}*/
		
         int sizeof= ele.size();
         System.out.println(sizeof);
         for(int i=0;i<sizeof;i++) {
        	
        	 String s1=ele.get(i).getText();
          
        		 
        	  
        	 
        	 System.out.println(s1);
        	
         }
         }
}
