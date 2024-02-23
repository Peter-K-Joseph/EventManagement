package com.ictak.springsecurityclient.repository;

import com.ictak.springsecurityclient.entity.LogisticsEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LogisticsManagementRepository extends JpaRepository<LogisticsEntity,Long>{

    
}
