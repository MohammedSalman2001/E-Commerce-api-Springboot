package com.bootcamp.robotikkaapi.robotikkaapi.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "payment_table")
public class Payment {
    @Id
    @Column(name = "property_id")
    private  String propertyId;

    @Column(name = "payment_date")
     private Date paymentData;

   private double  amount;
    private String bank;


    @OneToOne()
    @JoinColumn(name = "order_property_id",unique = true)
    private Order paymentPropertyId;


}
