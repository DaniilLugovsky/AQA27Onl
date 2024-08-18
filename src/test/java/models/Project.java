package models;

import lombok.*;

import java.util.Objects;

@Data
public class Project {
    private int id;
    private String name;
    private String announcement;
    private boolean isShowAnnouncement;
    private int projectType;
    private boolean isEnableTCApprovals;
}
