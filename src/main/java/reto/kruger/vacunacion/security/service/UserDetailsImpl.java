package reto.kruger.vacunacion.security.service;

import net.minidev.json.annotate.JsonIgnore;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import reto.kruger.vacunacion.model.User;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class UserDetailsImpl implements UserDetails {
    private static final long serialVersionUID =1l ;
    private String id;
    private String username;
    private String email;

    @JsonIgnore
    private String password;
    private Collection<? extends  GrantedAuthority> authorities;

    public UserDetailsImpl(String id, String username, String email, String password,
                           Collection<? extends GrantedAuthority> authorities) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.authorities = authorities;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public static  UserDetailsImpl build(User user){
        List<GrantedAuthority> authorities= user.getRoles().stream()
                .map(role -> new SimpleGrantedAuthority(role.getName_rol().name()))
                .collect(Collectors.toList());
        return new UserDetailsImpl(
                user.getId(),
                user.getUsername(),
                user.getEmail(),
                user.getPassword(),
                authorities
        );
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
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

    @Override
    public  boolean equals(Object object){
        if(this == object) return true;
        if ( object == null || getClass() != object.getClass()) return  false;
        UserDetailsImpl user  = (UserDetailsImpl) object;
        return Objects.equals(id,user.id);

    }
}
