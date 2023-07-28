package mate.academy.cinema.service.impl;

import static org.springframework.security.core.userdetails.User.withUsername;

import mate.academy.cinema.model.Role;
import mate.academy.cinema.model.User;
import mate.academy.cinema.service.UserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsServiceImpl implements UserDetailsService {
    private final UserService userService;

    public CustomUserDetailsServiceImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {
        User user = userService.findByEmail(username).orElseThrow(()
                -> new UsernameNotFoundException("User not found by username: " + username));
        String[] roles = user.getRoles().stream()
                .map(Role::getRoleName)
                .toArray(String[]::new);
        return withUsername(username)
                .username(username)
                .password(user.getPassword())
                .authorities(roles)
                .build();
    }
}
