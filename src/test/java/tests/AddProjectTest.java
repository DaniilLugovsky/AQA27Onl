package tests;

import baseEntities.BaseTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddProjectTest extends BaseTest {
    Logger logger = LogManager.getLogger(AddProjectTest.class);

    @Test
    public void addProjectTest() {
        faker.number().numberBetween(0,2);
        project.setName(faker.company().name());
        project.setAnnouncement(faker.book().title());
        project.setShowAnnouncement(random.nextBoolean());
        project.setProjectType(faker.number().numberBetween(0,2));
        project.setEnableTCApprovals(random.nextBoolean());
        logger.info(project.toString());
        userStep.successfulLogin()
                .clickAddProjectButton()
                .addProject(project)
                .createProject();
        Assert.assertTrue(projectsPage.isProjectCreated(), "Project is not created");
    }
}
