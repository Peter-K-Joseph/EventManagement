package com.ictak.springsecurityclient.controller;

import com.ictak.springsecurityclient.entity.Attendee;
import com.ictak.springsecurityclient.service.AttendeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class AttendeeController {

    @Autowired
    private AttendeesService attendeeService;

    @GetMapping("/attendees")
    public ResponseEntity<List<Attendee>> getAllAttendees() {
        return ResponseEntity.ok().body(attendeeService.getAllAttendees());
    }

    @GetMapping("/attendees/")
    public ResponseEntity<Attendee> getAttendeeById(@PathVariable long id) {
        return ResponseEntity.ok().body(attendeeService.getAttendeeById(id));
    }

    @PostMapping("/attendees")
    public ResponseEntity<Attendee> createAttendee(@RequestBody Attendee attendee) {
        return ResponseEntity.ok().body(this.attendeeService.createAttendee(attendee));
    }

    @PutMapping("/attendees/")
    public ResponseEntity<Attendee> updateAttendee(@PathVariable long id, @RequestBody Attendee attendee) {
        attendee.setAttendeeId(id);
        return ResponseEntity.ok().body(this.attendeeService.updateAttendee(attendee));
    }

    @DeleteMapping("/attendees/")
    public ResponseEntity<?> deleteAttendee(@PathVariable long id) {
        this.attendeeService.deleteAttendee(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}