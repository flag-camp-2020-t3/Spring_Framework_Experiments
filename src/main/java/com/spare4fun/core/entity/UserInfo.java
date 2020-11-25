package com.spare4fun.core.entity;

import javax.persistence.*;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Set;
import javax.persistence.FetchType;
import lombok.Getter;
import lombok.Setter;

/** Represents an userInfo.
 * @author Haitao Gu
 * @author www.spare4fun.com
 * @version 1.0
 * @since 1.0
 */

@Entity
@Table(name="user_info")
public class UserInfo implements Serializable {
    private static final long serialVersionUID = 0L;

    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Getter
    @Setter
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @Column(name = "first_name")
    @Getter
    @Setter
    private String firstName;

    @Column(name = "last_name")
    @Getter
    @Setter
    private String lastName;

    @Getter
    @Setter
    private String phone;

    @Getter
    @Setter
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "defaultlocation_id", referencedColumnName = "id")
    private Location defaultLocation;

    @Getter
    @Setter
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "user_info_locations",
            joinColumns = {@JoinColumn(name = "user_info_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "location_id", referencedColumnName = "id")})
    private Set<Location> locations;




}