package com.ictak.springsecurityclient.service;

import com.ictak.springsecurityclient.entity.Attendee;
import com.ictak.springsecurityclient.repository.AttendeesManagementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttendeesServiceImpl implements AttendeesService {

    @Autowired
    private AttendeesManagementRepository attendeesManagementRepository;
    @Override
    public List getAllAttendees() {
        return attendeesManagementRepository.findAll();
    }

    @Override
    public Attendee getAttendeeById(long id) {
        return attendeesManagementRepository.findById(id).get();
    }

    @Override
    public Attendee createAttendee(Attendee attendee) {
        return attendeesManagementRepository.save(attendee);

    }

    @Override
    public Attendee updateAttendee(Attendee attendee) {
        return attendeesManagementRepository.save(attendee);
    }

    @Override
    public void deleteAttendee(long id) {
        attendeesManagementRepository.deleteById(id);
    }
}