package web.security;

import org.springframework.security.core.GrantedAuthority;
import web.models.Role;

public class GrantedAuthorityImlp implements GrantedAuthority {

    public GrantedAuthorityImlp(Role role) {
        this.role = role;
    }

    private final Role role;
    @Override
    public String getAuthority() {
        return role.getName();
    }
}
