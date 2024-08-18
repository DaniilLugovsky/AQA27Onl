package models;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

import java.util.Calendar;
import java.util.Date;

@AllArgsConstructor
@EqualsAndHashCode(exclude = "id")
public class Milestone {
    private int id;
    private String name;
    private String references;
    private String parent;
    private String description;
    private Date startDate;
    private Date endDate;
    private boolean isThisMilestoneIsCompleted;
}
