package com.task.app.model;


import com.task.app.TestData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TutorialPage extends TestData {
    private final WebElement SKIP_TUTORIAL_BUTTON;
    private final String NO_TUTORIAL_URL = "https://app.interviewme.pl/app/cv/4eebf930-b6f2-11eb-bbc6-22ee631a169f/content";

    public TutorialPage() {
        SKIP_TUTORIAL_BUTTON = driver.findElement(By.xpath("//span[contains(text(),'Pomiń')]"));
    }

    public CvCreationPage skipTutorialByButton(){
        SKIP_TUTORIAL_BUTTON.click();
        return new CvCreationPage();
    }

    public CvCreationPage skipTutorialByDirectURL(){
        driver.get(NO_TUTORIAL_URL);
        return new CvCreationPage();
    }
}
