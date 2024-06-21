
package com.moduloGestionUsuarios.security_service.models;
import lombok.Setter;
import  lombok.Getter;
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

        // Verificar si el usuario existe en la lista
        if (!userList.contains(user)) {
            System.out.println("El usuario no está registrado en el sistema.");
            return;
        }
        // Enviar un correo de   notificacion de   con crediacles   al  usuario
        else{
            sendWelcomeEmail(user);
        }

    }

    // Método privado para enviar   notificacion al usuario   ingresado
    private void sendWelcomeEmail(User user) {

        System.out.println("¡Bienvenido, " + user.getUsername() + "! Gracias por unirte.");
    }


    // Método para eliminar un usuario
    public void deleteUser(User user) {
        userList.remove(user);
    }
}
