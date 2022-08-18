package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {

    private WebDriver driver;
    public KeyPressesPage(WebDriver driver){
        this.driver = driver;
    }
    public By inputField = By.id("target");
    public By result = By.id("result");

    public void enterText(String text){
        driver.findElement(inputField).sendKeys(text);
    }

    public void enterDollarSign(){
        enterText(Keys.chord(Keys.SHIFT + "4") + "=4,52");
    }

    public String getResult(){
        return driver.findElement(result).getText();
    }
}
