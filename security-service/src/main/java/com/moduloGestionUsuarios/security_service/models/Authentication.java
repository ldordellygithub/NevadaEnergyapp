package com.moduloGestionUsuarios.security_service.models;


import java.util.List;
import java.util.ArrayList;

public class Authentication {

    // Lista para manejar usuarios registrados (asociación)
    private List<User> registeredUsers;
    // Lista para manejar múltiples sesiones (agregación)
    private List<Session> activeSessions;

       //  methodo  constructor
    public Authentication() {
        this.activeSessions = new ArrayList<>();
        this.registeredUsers = new ArrayList<>();
    }

    // Método para registrar un nuevo usuario
    public void registerUser(User user) {
        registeredUsers.add(user);
    }

    // Getters y setters
    public List<Session> getActiveSessions() {
        return activeSessions;
    }

    public List<User> getRegisteredUsers() {
        return registeredUsers;
    }

    /*Método para validar las credenciales de un usuario
    public User validateCredentials(String username, String password) {
        for (User user : registeredUsers) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
    */

    // Método para iniciar una sesión
    public Session login(String username, String password) {
        User user = validateCredentials(username, password);
        if (user != null) {
            Session newSession = new Session(user);
            activeSessions.add(newSession);
            return newSession;
        }
        return null;
    }

    // Método para cerrar una sesión
    public boolean logout(User user) {
        return activeSessions.removeIf(session -> session.getUser().equals(user));
    }

    // Método para eliminar un usuario
    public boolean deleteUser(User user) {
        return registeredUsers.remove(user);
    }


}
