package com.ictak.springsecurityclient.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ictak.springsecurityclient.entity.Vendors;

public interface VendorRepository extends JpaRepository<Vendors,Long> {
    
}
