package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {

    private WebDriver driver;
    public ContextMenuPage(WebDriver driver){
        this.driver = driver;
    }
    public By boxField = By.id("hot-spot");


    public void clickContextMenu(){
        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(boxField)).perform();
    }
}
