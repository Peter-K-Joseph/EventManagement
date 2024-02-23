package com.ictak.springsecurityclient.controller;

import com.ictak.springsecurityclient.entity.Vendors;
import com.ictak.springsecurityclient.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class VendorController {

    @Autowired
    private VendorService vendorService;

    @GetMapping("/vendors")
    public ResponseEntity<List<Vendors>> getAllVendors() {
        return ResponseEntity.ok().body(vendorService.getAllVendors());
    }

    @GetMapping("/vendors/{id}")
    public ResponseEntity<Vendors> getVendorById(@PathVariable long id) {
        return ResponseEntity.ok().body(vendorService.getVendorById(id));
    }

    @PostMapping("/vendors")
    public ResponseEntity<Vendors> createVendor(@RequestBody Vendors attendee) {
        return ResponseEntity.ok().body(this.vendorService.createVendor(attendee));
    }

    @PutMapping("/vendors/{id}")
    public ResponseEntity<Vendors> updateVendor(@PathVariable long id, @RequestBody Vendors attendee) {
        return ResponseEntity.ok().body(this.vendorService.updateVendor(id, attendee));
    }

    @DeleteMapping("/vendors/{id}")
    public ResponseEntity<?> deleteVendor(@PathVariable long id) {
        this.vendorService.deleteVendor(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}