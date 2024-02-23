package com.ictak.springsecurityclient.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LogisticsEntity {
   

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long logistics_id;
    private String logistics_name;
    private String description;
    private double cost;
    @ManyToOne
    @JoinColumn(name = "event_id")
    @Embedded
    @Basic(fetch = FetchType.LAZY)
    private Events event_id;

    @ManyToOne
    @JoinColumn(name = "vendor_id")
    @Embedded
    @Basic(fetch = FetchType.LAZY)
    private Vendors vendor_id;    

    public Long getLogistics_id() {
        return logistics_id;
    }

    public void setLogistics_id(Long logistics_id) {
        this.logistics_id = logistics_id;
    }

    public String getLogistics_name() {
        return logistics_name;
    }

    public void setLogistics_name(String logistics_name) {
        this.logistics_name = logistics_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

}


