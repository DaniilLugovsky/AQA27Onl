package models;

import lombok.Builder;
import lombok.EqualsAndHashCode;

@Builder
public class TestCaseBuilder {
    private String title;
    private String section;
    private String template;
    private String type;
    private String priority;
    private String assignedTo;
    private String estimate;
    private String references;
    private String automationType;
    private String preconditions;
    private String steps;
    private String expectedResult;
}
