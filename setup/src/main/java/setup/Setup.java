package setup;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Setup {
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver-v0.29.1-win64\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver",".\\drivers\\\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://google.com.au");
        driver.quit();
        WebDriver driver1 = new ChromeDriver();
        driver1.get("https://google.com.au");
        driver1.quit();
    }
}
