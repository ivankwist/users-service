package com.pd2undav.usersservice;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    private String id_user;
    private String username;
    private String nombre;

    protected User() {}

    public User(String id_user, String username, String nombre) {
        this.id_user = id_user;
        this.username = username;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return String.format("User[id_user=%s, username=%s, nombre=%s]", id_user, username, nombre);
    }

    public String getId_user() {
        return id_user;
    }

    public String getUsername() {
        return username;
    }

    public String getNombre() {
        return nombre;
    }
}
