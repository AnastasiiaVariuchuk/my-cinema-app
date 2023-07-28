package mate.academy.cinema.service;

import mate.academy.cinema.model.User;

public interface AuthenticationService {
    User register(String email, String password);
}
