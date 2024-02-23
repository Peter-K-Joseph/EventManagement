package com.ictak.springsecurityclient.service;
import org.springframework.stereotype.Service;

import com.ictak.springsecurityclient.entity.Venue;
import com.ictak.springsecurityclient.repository.VenueManagementRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class VenueServiceImpl implements VenueService {
    @Autowired
    private VenueManagementRepository venueRepository;
    public Venue updateVenue(long venueId, Venue venue){
        venue.setVenue_id(venueId);
        return venueRepository.save(venue);
    }

    public Venue getVenue_id(long venue_id){
        return venueRepository.findById(venue_id).get();
    }

    public List<Venue> getAllVenue(){
        return venueRepository.findAll();
    }

    public Venue saveVenue(Venue venue){
        return venueRepository.save(venue);

    }

    public void deleteVenueById(long valueId){
        venueRepository.deleteById(valueId);
    }
}
