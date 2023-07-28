package mate.academy.cinema.service;

import mate.academy.cinema.model.MovieSession;
import mate.academy.cinema.model.ShoppingCart;
import mate.academy.cinema.model.User;

public interface ShoppingCartService {
    void addSession(MovieSession movieSession, User user);

    ShoppingCart getByUser(User user);

    void registerNewShoppingCart(User user);

    void clear(ShoppingCart shoppingCart);
}
