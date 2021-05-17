package com.task.app.model;

import com.task.app.TestData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.File;


public class CvCreationPage extends TestData {
    private final WebElement NAME_TEXT_FIELD;
    private final WebElement LASTNAME_TEXT_FIELD;
    private final WebElement FILE_UPLOAD;

    public CvCreationPage() {
        NAME_TEXT_FIELD = driver.findElement(By.name("firstName"));
        LASTNAME_TEXT_FIELD = driver.findElement(By.name("lastName"));
        FILE_UPLOAD = driver.findElement(By.xpath("//input[@type='file']"));
    }

    public CvCreationPage setApplicantName(String name) {
        NAME_TEXT_FIELD.clear();
        NAME_TEXT_FIELD.sendKeys(name);
        return this;
    }

    public CvCreationPage setApplicantLastName(String lastName) {
        LASTNAME_TEXT_FIELD.clear();
        LASTNAME_TEXT_FIELD.sendKeys(lastName);
        return this;
    }

    public PhotoUploadPopUp setApplicantPhoto() {
        File file = new File("src/main/resources/Kermit_the_Frog.jpg");
        FILE_UPLOAD.sendKeys(file.getAbsolutePath());
        return new PhotoUploadPopUp();
    }

    public BuilderPreviewView goToBuilderPreviewView() {
        return new BuilderPreviewView();
    }

}
