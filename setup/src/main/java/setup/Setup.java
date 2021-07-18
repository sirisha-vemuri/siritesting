package setup;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Setup {
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver-v0.29.1-win64\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver_win32\\chromedriver.exe");
        System.setProperty("webdriver.ie.driver",".\\drivers\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://google.com.au");
        driver.quit();
        WebDriver driver1 = new ChromeDriver();
        driver1.get("https://google.com.au");
        driver1.quit();
        WebDriver driver2 = new InternetExplorerDriver();
        driver2.get("https://google.com.au");
        driver2.quit();
    }
}
