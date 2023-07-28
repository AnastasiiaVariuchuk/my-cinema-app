package mate.academy.cinema.service;

import java.util.List;
import mate.academy.cinema.model.Order;
import mate.academy.cinema.model.ShoppingCart;
import mate.academy.cinema.model.User;

public interface OrderService {
    Order completeOrder(ShoppingCart shoppingCart);

    List<Order> getOrdersHistory(User user);
}
