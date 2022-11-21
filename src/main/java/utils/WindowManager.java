package utils;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class WindowManager {

    private WebDriver driver;
    private WebDriver.Navigation navigate;

    public WindowManager(WebDriver driver){
        this.driver = driver;
        navigate = driver.navigate();
    }

    public void goForward(){
        navigate.forward();
    }

    public void refreshPage(){
        navigate.refresh();
    }

    public void goToURL(String url){
        navigate.to(url);
    }

    public void goBack(){
        navigate.back();
    }

    public void switchToTab(String tabTitle){
        var windows = driver.getWindowHandles();

        System.out.println("Number of tabs " + windows.size());
        System.out.println("Windows handles: ");
        windows.forEach(System.out::println);

        for(String window : windows){
            System.out.println("Switching to window: " + window);
            driver.switchTo().window(window);

            System.out.println("Current window is :" + driver.getTitle());

            if(tabTitle.equals(driver.getTitle())){
                break;
            }
        }
    }

    public void switchToNewTab(){
        //Get the current window handle
        String windowHandle = driver.getWindowHandle();

//Get the list of window handles
        ArrayList tabs = new ArrayList (driver.getWindowHandles());
        System.out.println(tabs.size());
//Use the list of window handles to switch between windows
        driver.switchTo().window((String) tabs.get(1));
    }


}
