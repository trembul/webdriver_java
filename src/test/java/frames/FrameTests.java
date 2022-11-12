package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTests {

    @Test
    public void testWysiwyg(){
        var wysiwygEditorPage = homePage.clickWysiwygEditorLink();
        wysiwygEditorPage.clearTextArea();
        String text1 = "hello ";
        String text2 = "world";
        wysiwygEditorPage.sendTextToTextArea(text1);
        wysiwygEditorPage.increaseIndent();
        wysiwygEditorPage.sendTextToTextArea(text2);

        assertEquals(wysiwygEditorPage.getTextFromEditor(), text1+text2, "Text is incorrect");
    }
}
