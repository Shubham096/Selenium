import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {
    static String browser;
    static WebDriver driver;

    public static void main(String[] args) {
    setBrowser();
    setBrowserConfig();
    runTest();


    }

    public static void setBrowser() {
        browser = "Chrome";
    }

    public static void setBrowserConfig() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DeLL\\Downloads\\Selenium\\chrome jar\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    public static void runTest() {
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        System.out.println(driver.getCurrentUrl());
        driver.close();


    }
}
