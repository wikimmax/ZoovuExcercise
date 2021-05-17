package com.task.app.model;

import com.task.app.TestData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BuilderPreviewView extends TestData {
    private final WebElement COMPONENT_CONTAINER;
    private final WebElement USER_NAME_AND_LASTNAME;
    private final WebElement APPLICANT_IMAGE;

    public BuilderPreviewView() {
        COMPONENT_CONTAINER = driver.findElement(By.xpath("//div[@data-cy='builder-preview-page-1']"));
        USER_NAME_AND_LASTNAME = COMPONENT_CONTAINER.findElement(By.xpath("./div/div[1]/div[1]/div/div[1]/div/div"));
        APPLICANT_IMAGE = COMPONENT_CONTAINER.findElement(By.xpath("./div/div[1]/div[2]/div/div/div/div/img"));
    }

    public String getUserNameAndLastName() {
        return USER_NAME_AND_LASTNAME.getText();
    }

    public boolean checkIfUserImageIsVisible() {
        return APPLICANT_IMAGE.isDisplayed();
    }
}
