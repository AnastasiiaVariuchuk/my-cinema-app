package mate.academy.cinema.dao;

import java.util.List;
import mate.academy.cinema.model.Order;
import mate.academy.cinema.model.User;

public interface OrderDao {
    Order add(Order order);

    List<Order> getOrdersHistory(User user);
}
