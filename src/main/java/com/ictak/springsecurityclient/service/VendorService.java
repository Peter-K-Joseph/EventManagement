package com.ictak.springsecurityclient.service;

import com.ictak.springsecurityclient.entity.Vendors;

import java.util.List;

public interface VendorService {
    public List<Vendors> getAllVendors();
    public Vendors getVendorById(long id);
    public Vendors createVendor(Vendors vendor);
    public Vendors updateVendor(long id, Vendors vendor);
    public void deleteVendor(long id);
}
