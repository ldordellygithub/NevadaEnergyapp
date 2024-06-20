package com.moduloGestionUsuarios.security_service.models;

import java.util.List;
import java.util.ArrayList;
 
public class Administration extends User {
    private List<User> userList;
 
    // Constructor
    public Administration(String username, String email, String password, String role) {
        super(username, email, password, role);
        this.userList = new ArrayList<>();
    }
 
    // Método para establecer la lista de usuarios
    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
 
    // Método para obtener la lista de usuarios
    public List<User> getUserList() {
        return userList;
    }
 
    // Método para asignar un rol a un usuario
    public void assignRole(User user, String role) {
        if (userList.contains(user)) {
            user.setRole(role);
        }
    }
 
    // Método para gestionar usuarios 
    public void manageUser(User user) {
        // Lógica para gestionar usuarios
    }
 
    // Método para eliminar un usuario
    public void deleteUser(User user) {
        userList.remove(user);
    }
}