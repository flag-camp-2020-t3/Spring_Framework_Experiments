package com.spare4fun.core.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/** Represents table of authorities.
 * @author Xinrong Zhao
 * @author www.spare4fun.com
 * @version 1.0
 * @since 1.0
 */
@Entity
@Table(name = "authorities")
public class Authorities implements Serializable {
    private static final long serialVersionUID = 5453453534357612158L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private int id;

    @Getter
    @Setter
    private String authroities;

    @Getter
    @Setter
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;


}

