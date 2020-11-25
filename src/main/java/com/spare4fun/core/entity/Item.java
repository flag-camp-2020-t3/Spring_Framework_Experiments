package com.spare4fun.core.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

/** Represents an user.
 * @author Jin Zhang
 * @author www.spare4fun.com
 * @version 1.0
 * @since 1.0
 */
@Entity
@Table(name = "item")
public class Item implements Serializable {
    private static final long serialVersionUID = 0L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private int id;

    @Getter
    @Setter
    private String title;

    @Getter
    @Setter
    private String description;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "seller_id", referencedColumnName = "id")
    private User seller;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "location_id", referencedColumnName = "id")
    private Location location;

    @Getter
    @Setter
    @Column(name = "hide_location")
    private boolean hideLocation;

    @Getter
    @Setter
    private int quantity;

    @Getter
    @Setter
    @Column(name = "quantity_on_hold")
    private int quantityOnHold;

    @Getter
    @Setter
    @Column(name = "quantity_sold")
    private int quantitySold;

    @Getter
    @Setter
    @Column(name = "listing_price")
    private int listingPrice;

    @Getter
    @Setter
    @Column(name = "fixed_price")
    private boolean fixedPrice;

    @Getter
    @Setter
    @Column(name = "availability_time")
    private String availabilityTime;

    @Getter
    @Setter
    private boolean enabled;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private Category category;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "condition_id", referencedColumnName = "id")
    private ItemCondition condition;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "saved_items_cart_id", referencedColumnName = "id")
    private SavedItemsCart savedItemsCart;

    @Getter
    @Setter
    @OneToOne(mappedBy = "item")
    private Offer offer;

    @Getter
    @Setter
    @OneToOne(mappedBy = "item")
    private Appointment appointment;

    @Getter
    @Setter
    @OneToMany(mappedBy = "item")
    private List<PaymentOrder> paymentOrders;
}

