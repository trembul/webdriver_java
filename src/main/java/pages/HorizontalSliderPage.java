package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {

    private WebDriver driver;
    private By horizontalSlider = By.cssSelector(".sliderContainer input");
    private By sliderValue = By.id("range");

    public HorizontalSliderPage(WebDriver driver){
        this.driver = driver;
    }

    public void moveSlider(String text){
        driver.findElement(horizontalSlider).sendKeys(text);
    }

    public void getSliderValue(){
        driver.findElement(sliderValue).getText();
    }
}
