package edu.jose.vazquez.actividades.avanceproyecto.models;

public class Users {

    private String username;
    private String password;

    
    public Users(String username, String password) {
        setUsername(username);
        setPassword(password);

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if (username == null || username.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre de usuario no puede estar vacío.");
        }
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password == null || password.trim().isEmpty()) {
            throw new IllegalArgumentException("La contraseña no puede estar vacía.");
        }
        this.password = password;
    }


}
