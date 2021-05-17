package com.task.app;


import com.task.app.model.BuilderPreviewView;
import com.task.app.model.CvCreationPage;
import com.task.app.model.StartingPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CvCreationTest extends TestData {

    @BeforeAll
    static void setUpTest() {
        setUpDriver();
        StartingPage startingPage = new StartingPage();
        startingPage.goToTutorial().skipTutorialByButton();
    }

    @Test
    void checkIfFilledFormIsVisibleInOverview() {
        CvCreationPage cvCreationPage = new CvCreationPage();
        BuilderPreviewView builderPreviewView = cvCreationPage.setApplicantName("Example").setApplicantLastName("Person")
                .setApplicantPhoto().savePhoto().goToBuilderPreviewView();
        Assertions.assertAll("Elements Should Be Visible in CV Overview",
                () -> Assertions.assertTrue(builderPreviewView.getUserNameAndLastName().contains("Example")),
                () -> Assertions.assertTrue(builderPreviewView.getUserNameAndLastName().contains("Person")),
                () -> Assertions.assertTrue(builderPreviewView.checkIfUserImageIsVisible()));
    }
}
