package com.ictak.springsecurityclient.controller;

import com.ictak.springsecurityclient.entity.Venue;
import com.ictak.springsecurityclient.service.VenueService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api/v1")
public class VenueController {
	
	@Autowired
    private VenueService venueService;
    @PostMapping("/venues")
    public Venue saveVenue(@RequestBody Venue venue){
        return venueService.saveVenue(venue);
    }
    @GetMapping("/venues")
    public List<Venue> getVenue(){
        return venueService.getAllVenue();
    }
    @GetMapping("/venues/{id}")
    public Venue getVenueById(@PathVariable("id")Long venueId){
        return venueService.getVenue_id(venueId);
    }
    @PutMapping("/venues/{id}")
    public Venue updateVenue(@PathVariable("id") int venue_id,@RequestBody Venue venue) {
        return venueService.updateVenue(venue_id, venue);
    }
    @DeleteMapping("/venues/{id}")

    public void deleteVenueById(@PathVariable("id") int value_id) {

        venueService.deleteVenueById(value_id);

    }
}
