package es.virtualhit.virtualusersapi;

import java.util.UUID;

public interface User {

    UUID getUuid();
    String getUsername();
    String getLowerCaseUsername();
    boolean isOnline();
}
