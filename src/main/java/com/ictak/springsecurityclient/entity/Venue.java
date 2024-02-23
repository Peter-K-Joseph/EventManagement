package com.ictak.springsecurityclient.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Venue {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    long venue_id;
    @Length(min = 0, max = 30)
    private String name;
    private int capacity;
    private String location;
    @Length(min = 0, max = 30)
    private String contact_name;
    @Length(min = 0, max = 30)
    private String contact_email;
    @Length(min = 0, max = 10)
    private String contact_phone;
    @Enumerated
    private VenueType type;

    public long getVenue_id() {
        return this.venue_id;
    }

    public void setVenue_id(long venue_id) {
        this.venue_id = venue_id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getContact_name() {
        return this.contact_name;
    }

    public void setContact_name(String contact_name) {
        this.contact_name = contact_name;
    }

    public String getContact_email() {
        return this.contact_email;
    }

    public void setContact_email(String contact_email) {
        this.contact_email = contact_email;
    }

    public String getContact_phone() {
        return this.contact_phone;
    }

    public void setContact_phone(String contact_phone) {
        this.contact_phone = contact_phone;
    }

    public VenueType getType() {
        return this.type;
    }

    public void setType(VenueType type) {
        this.type = type;
    }
}
