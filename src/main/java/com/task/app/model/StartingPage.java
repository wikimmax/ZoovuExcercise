package com.task.app.model;


import com.task.app.TestData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class StartingPage extends TestData {

    private final WebElement START_TUTORIAL_BUTTON;

    public StartingPage() {
        START_TUTORIAL_BUTTON = driver.findElement(By.xpath("//a[@data-cy='how-it-works-cta']"));
    }

    public TutorialPage goToTutorial() {
        START_TUTORIAL_BUTTON.click();
        return new TutorialPage();
    }


}
