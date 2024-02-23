
package com.ictak.springsecurityclient.repository;

import com.ictak.springsecurityclient.entity.Attendee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendeesManagementRepository  extends JpaRepository<Attendee, Long>  {
    
}
