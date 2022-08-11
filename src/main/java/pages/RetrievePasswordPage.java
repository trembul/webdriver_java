package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RetrievePasswordPage {

    private WebDriver driver;

    public By internalMessage = By.xpath("html/body/h1[Internal Server Error]");
    public RetrievePasswordPage(WebDriver driver) {
        this.driver = driver;
    }



}
