package mate.academy.cinema.dao.impl;

import mate.academy.cinema.dao.AbstractDao;
import mate.academy.cinema.dao.CinemaHallDao;
import mate.academy.cinema.model.CinemaHall;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class CinemaHallDaoImpl extends AbstractDao<CinemaHall> implements CinemaHallDao {
    public CinemaHallDaoImpl(SessionFactory factory) {
        super(factory, CinemaHall.class);
    }
}
