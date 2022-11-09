package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload(){
        var fileUploadPage = homePage.clickFileUploadLink();
        fileUploadPage.uploadFile("E:\\jarek\\nauka\\testautomationu\\webdriver_java\\resources\\chromedriver.exe");
        String text = fileUploadPage.getUploadedFileName();
        assertEquals(text, "chromedriver.exe", "File name is incorrect");
    }
}
