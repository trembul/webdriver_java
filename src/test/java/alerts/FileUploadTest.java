package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTest extends BaseTests {

    @Test
    public void testFileUpload(){
        var fileUploadPage = homePage.clickFileUpload();
        fileUploadPage.uploadFile("E:\\jarek\\nauka\\testautomationu\\webdriver_java\\resources\\chromedriver.exe");
        assertEquals(fileUploadPage.getUploadedFiles(), "chromedriver.exe", "Incorrect file");
    }
}
