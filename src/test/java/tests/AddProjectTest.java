package tests;

import baseEntities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AddProjectTest extends BaseTest {
    @Test
    public void addProjectTest() {
        String projectName = faker.company().name();
        String projectAnnouncement = faker.company().logo();
        int setProjectType = random.nextInt(3);

        userStep.successfulLogin()
                .clickAddProjectButton()
                .addProjectName(projectName)
                .addProjectAnnouncement(projectAnnouncement)
                .setShowAnnouncement()
                .setProjectType(setProjectType)
                .setEnableTestCase()
                .createProject();
        Assert.assertTrue(projectsPage.isProjectCreated());
    }
}
