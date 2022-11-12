package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage {

    private WebDriver driver;
    private By nestedFramesPageLink = By.linkText("Nested Frames");

    public FramesPage(WebDriver driver){
        this.driver = driver;
    }

    public NestedFramesPage clickNestedFramesPageLink(){
        driver.findElement(nestedFramesPageLink).click();
        return new NestedFramesPage(driver);
    }
}
