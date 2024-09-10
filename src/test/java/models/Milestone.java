package models;

import java.util.Objects;

public class Milestone {
    private String name;
    private String references;
    private String parent;
    private String description;
    private String startDate;
    private String endDate;
    private boolean isMilestoneCompleted;

    public Milestone() {}

    public Milestone(String name, String references, String parent, String description, String startDate, String endDate, boolean isMilestoneCompleted) {
        this.name = name;
        this.references = references;
        this.parent = parent;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.isMilestoneCompleted = isMilestoneCompleted;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReferences() {
        return references;
    }

    public void setReferences(String references) {
        this.references = references;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public boolean isMilestoneCompleted() {
        return isMilestoneCompleted;
    }

    public void setMilestoneCompleted(boolean milestoneCompleted) {
        isMilestoneCompleted = milestoneCompleted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Milestone milestone = (Milestone) o;
        return isMilestoneCompleted == milestone.isMilestoneCompleted && Objects.equals(name, milestone.name) && Objects.equals(references, milestone.references) && Objects.equals(parent, milestone.parent) && Objects.equals(description, milestone.description) && Objects.equals(startDate, milestone.startDate) && Objects.equals(endDate, milestone.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, references, parent, description, startDate, endDate, isMilestoneCompleted);
    }

    @Override
    public String toString() {
        return "Milestone{" +
                "name='" + name + '\'' +
                ", references='" + references + '\'' +
                ", parent='" + parent + '\'' +
                ", description='" + description + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", isMilestoneCompleted=" + isMilestoneCompleted +
                '}';
    }
}
