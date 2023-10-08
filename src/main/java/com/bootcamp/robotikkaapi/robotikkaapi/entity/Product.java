package com.bootcamp.robotikkaapi.robotikkaapi.entity;

import com.bootcamp.robotikkaapi.robotikkaapi.entity.share.FileResource;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity(name = "product_table")
public class Product {

    @Id
    @Column(name = "property_id")
    private String propertyId;

    @Column(name ="display_name")
    private String displayName;

    private String description;

    @Column(name = "unit_price")
    private double unitePrice;
    private int qty;

    @OneToMany(mappedBy = "product",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private List<ProductImages > images;

    @Column(name = "selling_price")
    private double sellingPrice;

    @OneToMany(mappedBy = "productPropertyId",cascade = CascadeType.ALL)
    private List<Order>orderList;

    @OneToMany(mappedBy = "ProductPropertyId",cascade = CascadeType.ALL)
    private List<LovedProperty>lovedProperties;

}
