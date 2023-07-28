package mate.academy.cinema.dao.impl;

import java.util.Optional;
import mate.academy.cinema.dao.AbstractDao;
import mate.academy.cinema.dao.RoleDao;
import mate.academy.cinema.exception.DataProcessingException;
import mate.academy.cinema.model.Role;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class RoleDaoImpl extends AbstractDao<Role> implements RoleDao {
    public RoleDaoImpl(SessionFactory sessionFactory) {
        super(sessionFactory, Role.class);
    }

    @Override
    public Optional<Role> getByName(Role.RoleName roleName) {
        try (Session session = factory.openSession()) {
            return session.createQuery("from Role r where r.roleName = :roleName", Role.class)
                    .setParameter("roleName", roleName)
                    .uniqueResultOptional();
        } catch (Exception e) {
            throw new DataProcessingException("Can`t find role with name: "
                    + roleName, e);
        }
    }
}
