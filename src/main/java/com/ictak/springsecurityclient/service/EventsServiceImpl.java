package com.ictak.springsecurityclient.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ictak.springsecurityclient.entity.Events;
import com.ictak.springsecurityclient.repository.EventsManagementServiceRepository;

@Service
public class EventsServiceImpl implements EventsService {   

    @Autowired
    private EventsManagementServiceRepository itemManagementServiceRepository;

    @Override
    public List<Events> getAllEvents() {
        return itemManagementServiceRepository.findAll();
    }

    @Override
    public Events getEventById(long id) {
        return itemManagementServiceRepository.findById(id).get();
    }

    @Override
    public Events createEvent(Events item) {
        return itemManagementServiceRepository.save(item);
    }

    @Override
    public Events updateEvent(Events item) {
        return itemManagementServiceRepository.save(item);
    }

    @Override
    public void deleteEvent(long id) {
        itemManagementServiceRepository.deleteById(id);
    }
}
