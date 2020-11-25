package com.spare4fun.core.entity;
//use wrong package

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/** Represents a category
 * @author Qiuyu(Joanna) Deng
 * @author www.spare4fun.com
 * @version 1.0
 * @since 1.0
 */

@Entity
@Table(name="category")
public class Category implements Serializable {
    private static final long serialVersionUID = 23432L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private int id;

    @Getter
    @Setter
    private String category;

    @Getter
    @Setter
    @OneToMany(mappedBy = "category")
    private List<Item> items;
}