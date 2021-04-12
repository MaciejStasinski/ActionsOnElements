import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
public class w3 extends BaseSeleniumTest{

    @Test
    public void nextTests()  {
        driver.get("https://www.w3schools.com/");
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.id("navbtn_tutorials"))).build().perform();



    }
}



