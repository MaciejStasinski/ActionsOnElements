import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public abstract class BaseSeleniumTest {

    protected WebDriver driver;

    @BeforeTest
    public void setUp() {
        System.out.println("wykonuje się przed testem");
        String driverPath = "D:\\Programowanie\\JAVA\\Nowy folder\\Selenium\\findById\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @AfterTest
    public void tearDown() {
        System.out.println("Wykonuje się po teście");
        driver.quit();
    }
}
