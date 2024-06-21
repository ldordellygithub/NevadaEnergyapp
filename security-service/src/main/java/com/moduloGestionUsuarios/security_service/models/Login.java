package com.moduloGestionUsuarios.security_service.models;

public class Login {
    //Declaración de atributos
    private String Username;
    private String Email;
    private String Password; 
    // Constructores de la clase
    public Login(String username, String password, String email) {
        this.Username = username;
        this.Password = password;
        this.Email = email;
    }
    //Métodos Get y Set
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
    //Metodo que ingresa cuando Username y Password coinciden con los datos almacenados
    public boolean login(String Username, String Password) {
        return this.Username.equals(Username) &&
               this.Password.equals(Password);
    }
    //Método que permite recuperar la contraseña en caso de olvido. 
    public void recoverPassword (String email){
        if (this.Email.equals(email)) {
            System.out.println("Se ha enviado un enlace de recuperación de contraseña a " + email);
        } else {
            System.out.println("El correo electrónico no coincide.");
        }
    }
    
    // Método para validar la entrada de datos
    
    public boolean validateInput() {
        // Verificar si algún campo es nulo o está vacío
        if (Username == null || Username.isEmpty()) {
            return false;
        }
        if (Email == null || Email.isEmpty()) {
            return false;
        }
        if (Password == null || Password.isEmpty()) {
            return false;
        }
        return true;
    }   
}
