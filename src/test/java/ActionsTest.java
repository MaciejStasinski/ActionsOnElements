import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsTest extends BaseSeleniumTest {

    @Test
    public void actionTest() throws InterruptedException {

//        driver.get("C://Users//mstas//Desktop//Tests//selUdemy//Test.html");

//        WebElement clickOnMeButton = driver.findElement(By.id("clickOnMe"));
//        clickOnMeButton.click();
//        Alert alert = driver.switchTo().alert();
//        alert.accept();
//        lub prościej  - driver.switchTo().alert().accept()
//
//        WebElement firstNameInput = driver.findElement(By.id("fname"));
//        firstNameInput.sendKeys("Maciek");
//        firstNameInput.clear();
//        firstNameInput.sendKeys("Petunia");
//        System.out.println("wartość pola input to: " + firstNameInput.getText());
//        System.out.println("wartość pola input to: " + firstNameInput.getAttribute("value"));

//        WebElement label = driver.findElement(By.tagName("label"));
//        System.out.println("label to: " + label.getText());
        //get text działa dla wszystkich elementów oprócz inputa, dla którego musimy pobrać getattribute "value"

//        Select carselect = new Select(driver.findElement(By.tagName("select")));
//        carselect.selectByIndex(2);
//        carselect.selectByValue("audi");
//        carselect.selectByVisibleText("Mercedes");

//        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
//        checkbox.click();
//        // <input type="checkbox checked> - żeby zmienić w kodzie dodajemy atrybut checked
//        if (checkbox.isSelected()){
//            System.out.println("checkbox jest zaznaczony");
//            checkbox.click();
//            System.out.println("checkbox został odznaczony");
//        }else{
//            System.out.println("checkbox jest odznaczony");
//            checkbox.click();
//            System.out.println("checkbox został zaznaczony");
//        }

//        WebElement radioButton = driver.findElement(By.xpath("//input[@value='male']"));
//        radioButton.click();


//        WebElement hidden = driver.findElement(By.xpath("//p[@class='topSecret']"));
//        System.out.println("ukryty tekst to: "+ hidden.getText());//nie wyświetla
//        System.out.println("ukryty tekst to: "+ hidden.getAttribute("textContent"));
//        if (hidden.isDisplayed()){
//            System.out.println("element jest widoczny");
//            System.out.println(hidden.getText());
//        } else {
//            System.out.println("element nie jest widoczny");
//            System.out.println(hidden.getAttribute("textContent"));
//        }

//        WebElement smileImg = driver.findElement(By.id("smileImage"));
//        System.out.println(smileImg.getAttribute("naturalHeight"));//jeśli wysokośc = 0 to znaczy, że obrazek się nie wyświetla
//        System.out.println(smileImg.getSize().getHeight());//jeśli nie ma obrazka to i tak będzie się wyświetlał taka mała ikonka i ta metoda nie zwróci 0

//        WebElement firstNameInput2 = driver.findElement(By.name("fname"));
//        if (firstNameInput2.isEnabled())
//            firstNameInput2.sendKeys("Petunia");
//        else
//            System.out.println("Element jest zablokowany (atrybut disable)");

//        checkIfElementExist(By.tagName("a"), driver);
//        checkIfElementExist(By.tagName("abcd"), driver);
//        checkIfElementExist(driver, By.tagName("a"));
//        checkIfElementExist(driver,By.tagName("abcd"));

//        WebElement newPageButton = driver.findElement(By.id("newPage"));
//        newPageButton.click();
//        String currentWindowName = driver.getWindowHandle();//zwraca nazwe okna w którym obecnie jest webdriver
//        switchToNewWindow(driver, currentWindowName);
//        System.out.println("Tytuł strony to: " + driver.getTitle());
//        System.out.println("obecny URL to: " + driver.getCurrentUrl());
//        driver.switchTo().window(currentWindowName);
//        driver.findElement(By.name("username")).sendKeys(" Mouse");

        driver.get("https://www.google.com/");
        Thread.sleep(1000);
        WebElement agree = driver.findElement(By.xpath("//*[@id=\"zV9nZe\"]/div"));
        agree.click();
        Thread.sleep(1000);
        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.sendKeys("Selenium");
        Thread.sleep(1000);
        searchInput.sendKeys(Keys.ENTER);
//        searchInput.sendKeys(Keys.ESCAPE);
//        WebElement unclick = driver.findElement(By.xpath("/html/body/div[1]/div[4]"));
//        unclick.click();
//        WebElement searchButton = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]"));
//        searchButton.click();
        Thread.sleep(1000);
        WebElement seleniumPageLink = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/a/h3"));
//          WebElement seleniumPageLink = driver.findElement(By.cssSelector("#rso > div:nth-child(1) > div > div > div.yuRUbf > a > h3"));
        seleniumPageLink.click();

        String expectedTitle = "SeleniumHQ Browser Automation";
        System.out.println(driver.getTitle());
        Assert.assertEquals(expectedTitle, driver.getTitle());
//        Assert.assertTrue(driver.getTitle().equals("aaaa"), "BŁĘDNY TYTUŁ");


    }

    @Test
    public void actionTest2() throws InterruptedException {
        System.out.println("test 2");
    }

//    private void switchToNewWindow(WebDriver driver, String currentWindowName) {
//        System.out.println("Wartość dla obecnego okna to " + currentWindowName);
//        Set<String> windows = driver.getWindowHandles();
//        System.out.println("Ilość okien w przeglądarce to: " + windows.size());
//        for (String a : windows) {
//            if (!a.equals(currentWindowName)) {
//                driver.switchTo().window(a);
//            }
//        }
//    }

//    public boolean checkIfElementExist(By locator, WebDriver driver) {
//        if (driver.findElements(locator).size() > 0) {
//            System.out.println("Element istnieje na stronie");
//            return true;
//        } else
//            System.out.println("Element nie istnieje na stronie");
//        return false;
//    }
//
//    public void checkIfElementExist(WebDriver driver, By locator) {
//        try {
//            driver.findElement(locator);
//            System.out.println("element istnieje");
//        } catch (NoSuchElementException e) {
//            System.out.println("Element nie istnieje");
//        }
//    }
}
