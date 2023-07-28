package mate.academy.cinema.dao.impl;

import mate.academy.cinema.dao.AbstractDao;
import mate.academy.cinema.dao.MovieDao;
import mate.academy.cinema.model.Movie;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class MovieDaoImpl extends AbstractDao<Movie> implements MovieDao {
    public MovieDaoImpl(SessionFactory factory) {
        super(factory, Movie.class);
    }
}
