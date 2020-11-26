package com.spare4fun.core.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Builder
@Entity
@Table(name = "user")
public class User {
    private static final long serialVersionUID = 2396654715019746670L;

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Getter
    @Setter
    private String email;

    @Getter
    @Setter
    private String password;

    /*
    @Override
    public Collection<GrantedAuthority> getAuthorities() {
        return new ArrayList<>();
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
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
    */
}
