package com.ictak.springsecurityclient.repository;

import com.ictak.springsecurityclient.entity.Venue;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VenueManagementRepository extends JpaRepository<Venue,Long> {
    
}
