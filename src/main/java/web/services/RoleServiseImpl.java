package web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.models.Role;
import web.repositories.RoleRepository;

import java.util.List;

@Service
public class RoleServiseImpl implements RoleService {
    private final RoleRepository roleRepository;

    @Autowired
    public RoleServiseImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

}
