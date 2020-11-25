package com.spare4fun.core.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import java.io.Serializable;

/** Represents paymentOrder.
 * @see <a href="https://docs.google.com/document/d/1qWrp03iASz7vVdmsn8NqVpqJNkYVVl7UkUPhOUgOHDs/edit?usp=sharing">Database Doc</a>
 * @author Xinrong Zhao
 * @author www.spare4fun.com
 * @version 1.0
 * @since 1.0
 */
@Entity
@Table(name = "payment_order")
public class PaymentOrder implements Serializable {
    private static final long serialVersionUID = 1617181920L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private int id;

    @Getter
    @Setter
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    // unidrectional mapping
    @JoinColumn(name="appointment_id", referencedColumnName = "id", nullable=false)
    private Appointment appointment;

    @Getter
    @Setter
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    // unidirectional mapping
    @JoinColumn(name="offer_id", referencedColumnName = "id", nullable=false)
    private Offer offer;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name="item_id", referencedColumnName = "id", nullable=false)
    private Item item;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name="seller_id", referencedColumnName = "id", nullable=false)
    private User seller;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name="buyer_id", referencedColumnName = "id", nullable=false)
    private User buyer;

    @Getter
    @Setter
    @Column(name = "init_time", nullable = false)
    private String initTime;

    @Getter
    @Setter
    @Column(name = "expire_time", nullable = false)
    private String expireTime;

    @Getter
    @Setter
    @Column(name = "final_price", nullable = false)
    @DecimalMin(value = "1")
    private int finalPrice;

    @Getter
    @Setter
    @Column(name = "final_quantity", nullable = false)
    @DecimalMin(value = "1")
    private int finalQuantity;

    @Getter
    @Setter
    private boolean completed;
}
