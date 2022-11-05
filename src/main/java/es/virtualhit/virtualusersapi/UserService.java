package es.virtualhit.virtualusersapi;

import java.util.UUID;

public interface UserService {

    User get(String username);
    User get(UUID uuid);

    boolean exists(String username);
    boolean exists(UUID uuid);
}
