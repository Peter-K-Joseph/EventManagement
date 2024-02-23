package com.ictak.springsecurityclient.service;

import java.util.List;

import com.ictak.springsecurityclient.entity.Events;

public interface EventsService {
    public List<Events> getAllEvents();
    public Events getEventById(long id);
    public Events createEvent(Events item);
    public Events updateEvent(Events item);
    public void deleteEvent(long id);
}