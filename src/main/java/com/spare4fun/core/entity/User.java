package com.spare4fun.core.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "user")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements UserDetails, Serializable {
    public static final long serialVersionUID = 12345L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    @JsonIgnore
    private int id;

    @Getter
    @Setter
    private String email;

    @Getter
    @Setter
    private String password;

    @Getter
    @Setter
    private boolean enabled;

    @Getter
    @Setter
    @Enumerated(EnumType.STRING)
    private Role role;

    @Transient
    private final boolean accountNonExpired = true;

    @Transient
    private final boolean accountNonLocked = true;

    @Transient
    private final boolean credentialsNonExpired = true;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return role.getGrantedAuthorities();
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return accountNonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return accountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }
}
