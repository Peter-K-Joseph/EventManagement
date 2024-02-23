package com.ictak.springsecurityclient.service;

import com.ictak.springsecurityclient.entity.Attendee;

import java.util.List;

public interface AttendeesService {

    public List getAllAttendees();

    public Attendee getAttendeeById(long id);

    public Attendee createAttendee(Attendee attendee);

    public Attendee updateAttendee(Attendee attendee);

    public void deleteAttendee(long id);
}