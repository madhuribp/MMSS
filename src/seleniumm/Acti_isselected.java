package seleniumm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Acti_isselected {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
	WebElement cb=	driver.findElement(By.name("remember"));
	cb.click();
		if(cb.isSelected())
		{
			System.out.println("selected");
		}
		else
			System.out.println("not selected");
		driver.close();
	}
	}
	
