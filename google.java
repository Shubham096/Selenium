import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

    public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\DeLL\\Downloads\\Selenium\\chrome jar\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        System.out.println(driver.getCurrentUrl());

    }
}
