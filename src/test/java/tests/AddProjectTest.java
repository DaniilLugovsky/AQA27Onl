package tests;

import baseEntities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddProjectTest extends BaseTest {

    @Test
    public void addProjectTest() {
        faker.number().numberBetween(0,2);
        project.setName(faker.company().name());
        project.setAnnouncement(faker.company().logo());
        project.setShowAnnouncement(random.nextBoolean());
        project.setProjectType(faker.number().numberBetween(0,2));
        project.setEnableTCApprovals(random.nextBoolean());
        userStep.successfulLogin()
                .clickAddProjectButton()
                .addProject(project)
                .createProject();
        Assert.assertTrue(projectsPage.isProjectCreated());
    }
}
