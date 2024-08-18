package tests;

import com.github.javafaker.Faker;
import models.Milestone;
import models.Project;
import models.TestCaseBuilder;
import models.User;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Date;
import java.util.Random;

public class LombokTest {
    Faker faker = new Faker();
    Random random = new Random();
    Date date = new Date();
    Project project = new Project();
    Project projectSecond = new Project();
    @Test
    public void milestoneTest() {
        String randomStr = faker.book().author();
        boolean randomBoolean = random.nextBoolean();
        Milestone milestone = new Milestone(random.nextInt(5),randomStr, randomStr, randomStr, randomStr, date, date, randomBoolean);
        Milestone milestonefirst = new Milestone(random.nextInt(5),randomStr, randomStr, randomStr, randomStr, date, date, randomBoolean);
        System.out.println(milestonefirst);
        System.out.println(milestone);
        Assert.assertEquals(milestone, milestonefirst);
    }

    @Test
    public void projectTest() {
        project.setName(faker.name().name());
        project.setId(random.nextInt(5));
        project.setProjectType(random.nextInt(5));
        projectSecond.setName(faker.name().name());
        projectSecond.setId(random.nextInt(5));
        projectSecond.setProjectType(random.nextInt(5));
        System.out.println(project);
        System.out.println(projectSecond);
        Assert.assertEquals(project, projectSecond);
    }

    @Test
    public void UserTest() {
        User user = new User();
        user.setUsername(faker.name().name());
        user.setPassword(faker.numerify("########"));
        User admin = new User();
        admin.setUsername(faker.name().name());
        admin.setPassword(faker.numerify("########"));
        System.out.println(user);
        System.out.println(admin);
        Assert.assertEquals(user, admin);
    }

    @Test
    public void TestCaseBuilderTest() {
        TestCaseBuilder testCaseBuilder = TestCaseBuilder
                .builder()
                .title(faker.company().bs())
                .section(faker.company().bs())
                .template(faker.company().bs())
                .type(faker.company().bs())
                .priority(faker.company().bs())
                .build();
        TestCaseBuilder testCaseBuilderFirst = TestCaseBuilder
                .builder()
                .title(faker.company().bs())
                .section(faker.company().bs())
                .template(faker.company().bs())
                .type(faker.company().bs())
                .priority(faker.company().bs())
                .build();
        System.out.println(testCaseBuilder);
        System.out.println(testCaseBuilderFirst);
        Assert.assertEquals(testCaseBuilder, testCaseBuilderFirst);
    }
}
