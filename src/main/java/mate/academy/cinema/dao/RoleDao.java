package mate.academy.cinema.dao;

import java.util.Optional;
import mate.academy.cinema.model.Role;

public interface RoleDao {
    Role add(Role role);

    Optional<Role> getByName(Role.RoleName roleName);
}

