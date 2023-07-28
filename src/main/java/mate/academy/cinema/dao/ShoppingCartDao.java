package mate.academy.cinema.dao;

import mate.academy.cinema.model.ShoppingCart;
import mate.academy.cinema.model.User;

public interface ShoppingCartDao {
    ShoppingCart add(ShoppingCart shoppingCart);

    ShoppingCart getByUser(User user);

    ShoppingCart update(ShoppingCart shoppingCart);
}
