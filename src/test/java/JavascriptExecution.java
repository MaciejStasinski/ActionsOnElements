import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JavascriptExecution extends BaseSeleniumTest{

    @Test
    public void SerchWitchJavascript() throws InterruptedException {
        driver.get("https://www.google.com/");
        Thread.sleep(1000);
        WebElement agree = driver.findElement(By.xpath("//*[@id=\"zV9nZe\"]/div"));
        agree.click();

        WebElement searchInput = driver.findElement(By.name("q"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        Actions action = new Actions(driver);
        action.contextClick().build().perform();
        executor.executeScript("arguments[0].setAttribute('value', 'Selenium')",searchInput);
        searchInput.sendKeys(Keys.ENTER);
        WebElement seleniumPageLink = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/a/h3"));
        executor.executeScript("arguments[0].click()",seleniumPageLink);
        Assert.assertEquals("SeleniumHQ Browser Automation", driver.getTitle());
    }

}
// "alert('Hello World!)"
// ("arguments[0].click()",element);
// ("arguments[0].setAttribute('value', '"+longstring +"')", element);