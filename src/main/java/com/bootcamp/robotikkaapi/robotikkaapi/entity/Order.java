package com.bootcamp.robotikkaapi.robotikkaapi.entity;


import com.bootcamp.robotikkaapi.robotikkaapi.enums.OrderState;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "order_table")
public class Order {

    @Id
    @Column(name = "property_id")
    private String propertyId;

    private Date  date;

    @Column(name = "total_cost")
    private double totalCost;

    @Column(name = "shipping_address")
   private String shippingAddress;

    @Column(name = "order_state"
    )
    @Enumerated(EnumType.STRING)
   private OrderState orderState;

    @Column(name = "order_qty")
     private int orderQty;

    @ManyToOne
    @JoinColumn(name = "user_property_id")
    private User userPropertyID;

    @ManyToOne
    @JoinColumn(name = "product_property_id")
    private Product productPropertyId;

    @OneToOne(mappedBy = "paymentPropertyId",cascade = CascadeType.ALL)
    private  Payment payment;
}


