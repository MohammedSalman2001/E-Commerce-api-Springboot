package com.bootcamp.robotikkaapi.robotikkaapi.entity;

import com.bootcamp.robotikkaapi.robotikkaapi.entity.share.FileResource;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity(name = "product_image")
public class ProductImages {

    @Id
    @Column(name = "property_id")
    private String propertyId;

    @Embedded
    private FileResource resource;

    @ManyToOne
    private Product product;
}
