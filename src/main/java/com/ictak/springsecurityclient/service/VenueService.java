package com.ictak.springsecurityclient.service;

import com.ictak.springsecurityclient.entity.Venue;

import java.util.List;

public interface VenueService {

    public Venue updateVenue(long venueId, Venue venue);

    public Venue getVenue_id(long venue_id);

    public List<Venue> getAllVenue();

    public Venue saveVenue(Venue venue);

    public void deleteVenueById(long valueId);
}
