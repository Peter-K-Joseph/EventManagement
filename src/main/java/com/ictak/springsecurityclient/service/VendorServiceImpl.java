package com.ictak.springsecurityclient.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ictak.springsecurityclient.entity.Vendors;
import com.ictak.springsecurityclient.repository.VendorRepository;

@Service
public class VendorServiceImpl implements VendorService {
    @Autowired
    private VendorRepository vendorRepository;

    @Override
    public List<Vendors> getAllVendors() {
        return vendorRepository.findAll();
    }

    @Override
    public Vendors getVendorById(long id) {
        return vendorRepository.findById(id).get();
    }

    @Override
    public Vendors createVendor(Vendors vendor) {
        return vendorRepository.save(vendor);
    }

    @Override
    public Vendors updateVendor(long id, Vendors vendor) {
        vendor.setVendor_id(id);
        return vendorRepository.save(vendor);
        
    }

    @Override
    public void deleteVendor(long id) {
        vendorRepository.deleteById(id);
    }
    
}
