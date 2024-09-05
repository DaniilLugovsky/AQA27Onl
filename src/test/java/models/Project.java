package models;

import java.util.Arrays;
import java.util.Objects;

public class Project {
    private int id;
    private String name;
    private String announcement;
    private boolean isShowAnnouncement;
    private int projectType;
    private boolean isEnableTCApprovals;
    private Milestone[] milestones;

    private Project() {}

    public Project(int id, String name, String announcement, boolean isShowAnnouncement, int projectType, boolean isEnableTCApprovals, Milestone[] milestones) {
        this.id = id;
        this.name = name;
        this.announcement = announcement;
        this.isShowAnnouncement = isShowAnnouncement;
        this.projectType = projectType;
        this.isEnableTCApprovals = isEnableTCApprovals;
        this.milestones = milestones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnnouncement() {
        return announcement;
    }

    public void setAnnouncement(String announcement) {
        this.announcement = announcement;
    }

    public boolean isShowAnnouncement() {
        return isShowAnnouncement;
    }

    public void setShowAnnouncement(boolean showAnnouncement) {
        isShowAnnouncement = showAnnouncement;
    }

    public int getProjectType() {
        return projectType;
    }

    public void setProjectType(int projectType) {
        this.projectType = projectType;
    }

    public boolean isEnableTCApprovals() {
        return isEnableTCApprovals;
    }

    public void setEnableTCApprovals(boolean enableTCApprovals) {
        isEnableTCApprovals = enableTCApprovals;
    }

    public Milestone[] getMilestones() {
        return milestones;
    }

    public void setMilestones(Milestone[] milestones) {
        this.milestones = milestones;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Project project = (Project) o;
        return id == project.id && isShowAnnouncement == project.isShowAnnouncement && projectType == project.projectType && isEnableTCApprovals == project.isEnableTCApprovals && Objects.equals(name, project.name) && Objects.equals(announcement, project.announcement) && Arrays.equals(milestones, project.milestones);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, name, announcement, isShowAnnouncement, projectType, isEnableTCApprovals);
        result = 31 * result + Arrays.hashCode(milestones);
        return result;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", announcement='" + announcement + '\'' +
                ", isShowAnnouncement=" + isShowAnnouncement +
                ", projectType=" + projectType +
                ", isEnableTCApprovals=" + isEnableTCApprovals +
                ", milestones=" + Arrays.toString(milestones) +
                '}';
    }
}
