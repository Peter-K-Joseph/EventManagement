package com.ictak.springsecurityclient.controller;

import com.ictak.springsecurityclient.entity.Events;
import com.ictak.springsecurityclient.service.EventsService;


import java.net.http.HttpResponse;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/event")
public class EventController {  
    @Autowired
    private EventsService eventsService;
    
    @GetMapping("/events")
    public ResponseEntity<List<Events>> getAllItems() {
        return ResponseEntity.ok().body(eventsService.getAllEvents());
    }
    
    @GetMapping("/events/{id}")
    public ResponseEntity<Events> getItemById(@PathVariable long id) {
        return ResponseEntity.ok().body(eventsService.getEventById(id));
    }
    
    @PostMapping("/events")
    public ResponseEntity<Events> createItem(@RequestBody Events item) {
        return ResponseEntity.ok().body(this.eventsService.createEvent(item));
    }
    
    @PutMapping("/events/{id}")
    public ResponseEntity<Events> updateItem(@PathVariable long id, @RequestBody Events event) {
        event.setEvent_id(id);
        return ResponseEntity.ok().body(this.eventsService.updateEvent(event));
    }
    
    @DeleteMapping("/events/{id}")
    public HttpResponse deleteItem(@PathVariable long id) {
        this.eventsService.deleteEvent(id);
        return (HttpResponse) ResponseEntity.status(HttpStatus.OK);
    }
    
}
