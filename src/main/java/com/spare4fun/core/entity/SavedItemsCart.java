package com.spare4fun.core.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/** Represents table of saved_Items_cart.
 * @author Yuhe Gu
 * @author www.spare4fun.com
 * @version 1.0
 * @since 1.0
 */

@Entity
@Table(name = "saved_items_cart")
public class SavedItemsCart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private int id;

    @Getter
    @Setter
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @Getter
    @Setter
    @OneToMany(mappedBy = "savedItemsCart",
            cascade = CascadeType.ALL, fetch=FetchType.EAGER)
    private List<Item> items;

    @Getter
    @Setter
    @Column(name = "saved_time")
    private String savedTime;


}
