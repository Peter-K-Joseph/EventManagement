package com.ictak.springsecurityclient.service;


import com.ictak.springsecurityclient.entity.LogisticsEntity;
import com.ictak.springsecurityclient.repository.LogisticsManagementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogisticsServiceImpl implements LogisticsService  {
    
    @Autowired
    private LogisticsManagementRepository logisticsManagementRepository;

    @Override
    public LogisticsEntity savelogistics(LogisticsEntity logistics) {
        return null;
    }

    @Override
    public LogisticsEntity getlogisticsById(Long Logistics_id) {
        return logisticsManagementRepository.findById(Logistics_id).get();
    }

    @Override
    public void deletelogisticsById(Long Logistics_id) {
        logisticsManagementRepository.deleteById(Logistics_id);
    }

    @Override
    public LogisticsEntity updatelogistics(Long Logistics_id, LogisticsEntity logistics) {
        logistics.setLogistics_id(Logistics_id);
        return logisticsManagementRepository.save(logistics);
    }
}
