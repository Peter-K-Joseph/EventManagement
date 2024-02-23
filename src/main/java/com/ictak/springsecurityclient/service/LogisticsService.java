package com.ictak.springsecurityclient.service;

import com.ictak.springsecurityclient.entity.LogisticsEntity;

public interface LogisticsService {
    
    LogisticsEntity savelogistics(LogisticsEntity logistics);

    LogisticsEntity getlogisticsById(Long Logistics_id);

    void deletelogisticsById(Long Logistics_id);

    LogisticsEntity updatelogistics(Long Logistics_id, LogisticsEntity logistics);


    

}
