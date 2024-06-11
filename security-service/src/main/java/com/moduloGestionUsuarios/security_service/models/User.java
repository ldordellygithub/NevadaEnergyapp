package com.moduloGestionUsuarios.security_service.models;

public class User {
    //Definición de los atributos de la clase. 
    private String Username;
    private String Email;
    private String Password; 
    private String Role;
    
    // Constructores de la clase
    public User(String username, String password, String email, String role){
        this.Username = username;
        this.Password = password;
        this.Email = email;
        this.Role = role;
    }
    //Metodos Get y Set de la clase
    public void setUsername(String Username) {
        this.Username = Username;
    }
    public String getUsername(){
        return Username;
    }
    public void setEmail(String Email) {
        this.Email = Email;
    }
    public String getEmail(){
        return Email;
    }
    public void setPassword(String Password) {
        this.Password = Password;
    }
    public String getPassword(){
        return Password;
    }
    public void setRole(String Role) {
        this.Role = Role;
    }
    public String getRole(){
        return Role;
    }
    // Método que permite el cambio de Password si oldkey concuerda con la contraseña almacenada
    private boolean changePassword(User user, String oldKey, String newKey) {
        if (user.getPassword().equals(oldKey)) {
            user.setPassword(newKey);
            return true;
        } else {
            return false;
        }
    }
}
