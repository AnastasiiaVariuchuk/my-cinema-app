package mate.academy.cinema.dao.impl;

import mate.academy.cinema.dao.AbstractDao;
import mate.academy.cinema.dao.TicketDao;
import mate.academy.cinema.model.Ticket;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class TicketDaoImpl extends AbstractDao<Ticket> implements TicketDao {
    public TicketDaoImpl(SessionFactory factory) {
        super(factory, Ticket.class);
    }
}
