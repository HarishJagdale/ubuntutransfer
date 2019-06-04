
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;
public class App
{
 @Test

 public static void main(String[] args) 
 {


 System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\test2\\chromedriver.exe");
 ChromeOptions chromeOptions = new ChromeOptions();
 WebDriver driver = new ChromeDriver(chromeOptions);

 System.out.println("Hi This is test to check webpage");


 driver.get("http://192.168.56.102:8002/");

 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
 driver.findElement(By.id("About Us")).click();
 
 if(driver.getPageSource().contains("lorem ipsum"))
    {
      System.out.println("Present");
    }
  else {
         System.out.println("Not Present");
       }
  //Thread.sleep(5000);
 driver.quit();

 }
}

