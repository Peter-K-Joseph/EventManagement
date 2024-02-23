package com.ictak.springsecurityclient.controller;

import com.ictak.springsecurityclient.entity.LogisticsEntity;
import com.ictak.springsecurityclient.service.LogisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/logistics")
public class LogisticsController {
    

    @Autowired
    private LogisticsService logisticservice;

    @PostMapping("/logistics")
    public LogisticsEntity saveDepartments(@RequestBody LogisticsEntity logistics) {
        return logisticservice.savelogistics(logistics);
    }

    @GetMapping("/logistics/{id}")
    public LogisticsEntity getDepartmentById(@PathVariable("id") Long Logistics_id) {
        return logisticservice.getlogisticsById(Logistics_id);
    }

//     @GetMapping("/logistics")
//     public List<LogisticsEntity> getDepartment() {
//         return logisticservice.;
//     }

    @DeleteMapping("/logistics/{id}")
    public void deleteDepartmentById(@PathVariable("id") Long Logistics_id) {
        logisticservice.deletelogisticsById(Logistics_id);

    }

    @PutMapping("/logistics/{id}")
    public LogisticsEntity updateDepartment(@PathVariable("id") Long Logistics_id, @RequestBody LogisticsEntity logistics) {
        //LOGGER.info("Inside getAllDepartments of DepartmentController ...");
        return logisticservice.updatelogistics(Logistics_id, logistics);
    }
}

    



    

