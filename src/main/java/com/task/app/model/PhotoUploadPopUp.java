package com.task.app.model;


import com.task.app.TestData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class PhotoUploadPopUp extends TestData {

    private final WebElement SAVE_APPLICANT_PHOTO;

    public PhotoUploadPopUp() {
        SAVE_APPLICANT_PHOTO = driver.findElement(By.xpath("//span[contains(text(),'Zapisz')]"));
    }

    public CvCreationPage savePhoto() {
        SAVE_APPLICANT_PHOTO.click();
        return new CvCreationPage();
    }


}
