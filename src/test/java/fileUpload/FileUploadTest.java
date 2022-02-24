package fileUpload;

import base.BaseTest;
import org.junit.jupiter.api.*;
import pages.FileUploadPage;

import static org.junit.jupiter.api.Assertions.*;

public class FileUploadTest extends BaseTest {

    @Test
    @DisplayName("")
    void testFileUpload() {
        FileUploadPage fileUploadPage = homePage.clickFileUpload();
        fileUploadPage.uploadFile("C:\\Projects\\selenium-web-test\\src\\main\\resources\\uploadFileTest.txt");
        assertEquals("uploadFileTest.txt", fileUploadPage.getUploadedFiles(), "Uploaded file is incorrect");
    }
}
