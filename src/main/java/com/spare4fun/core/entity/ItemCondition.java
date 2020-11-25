package com.spare4fun.core.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/** Represents table of item conditions.
 * @author Xinrong Zhao
 * @author www.spare4fun.com
 * @version 1.0
 * @since 1.0
 */
@Entity
@Table(name = "item_condition")
public class ItemCondition implements Serializable {
    private static final long serialVersionUID = 5164567L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private int id;

    @Getter
    @Setter
    private String label;

    @Getter
    @Setter
    @OneToMany(mappedBy = "condition")
    private List<Item> items;
}
