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

@Entity(name = "loved_property_table")
public class LovedProperty {
   @Id
   @Column(name = "property_id")
   private String propertyId;

   @Column(name = "save_data")
   private Date saveDate;

   @ManyToOne
   @JoinColumn(name = "user_property_id")
   private User userPropertyId;


   @ManyToOne
   @JoinColumn(name = "property_product_id")
   private Product ProductPropertyId;

}

