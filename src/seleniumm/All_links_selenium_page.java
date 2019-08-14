package seleniumm;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_links_selenium_page {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.seleniumhq.org/");
List<WebElement> allinks = driver.findElements(By.xpath("//a"));
int size=allinks.size();
System.out.println(size);

/*for(int i=0;i<size;i++)
{
WebElement get = allinks.get(i);
String s=get.getText();
System.out.println(s);
}*/


//creating a file

File f1=new File("E:\\em.try.text");
FileWriter fstream=new FileWriter(f1);
BufferedWriter out=new BufferedWriter(fstream);
for(int i=0;i<size;i++)
{
	WebElement get = allinks.get(i);
	String s=get.getText();
	out.write(s);
	
}
out.close();


}


}