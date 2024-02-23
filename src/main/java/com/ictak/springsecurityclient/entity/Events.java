package com.ictak.springsecurityclient.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Events {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long event_id;
    private String name;
    private String description;
    private Date date;
    
    @Enumerated(EnumType.ORDINAL)
    private event_type type;
    private String start_time;
    private String end_time;
    private double budget;

    @Enumerated(EnumType.ORDINAL)
    private status status;

    @OneToOne
    @JoinColumn(name = "venue_id")
    @Embedded
    @Basic(fetch = FetchType.LAZY)
    private Venue venue;

    public long getEvent_id() {
        return event_id;
    }

    public void setEvent_id(long event_id) {
        this.event_id = event_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public event_type getType() {
        return type;
    }

    public void setType(event_type type) {
        this.type = type;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public status getStatus() {
        return status;
    }

    public void setStatus(status status) {
        this.status = status;
    }
}
