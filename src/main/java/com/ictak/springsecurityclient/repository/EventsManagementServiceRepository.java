package com.ictak.springsecurityclient.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ictak.springsecurityclient.entity.Events;

public interface EventsManagementServiceRepository  extends JpaRepository<Events, Long>  {
    
}
