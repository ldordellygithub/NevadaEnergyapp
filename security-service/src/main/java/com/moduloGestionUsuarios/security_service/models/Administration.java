package com.moduloGestionUsuarios.security_service.models;

public class  Administration{
    
    // Atributo privado para la lista de usuarios
    private String userList;
    
    // Este metodo asigna el valor de userList
    public void setuserList(String userList) {
        this.userList = userList;
    }
    
    // Este metodo le devuelve el valor a userList
    public String getuserList (){
        return userList;
    }
    
    //Implementacion para asignar un rol a un usuario
    public void assignRole(User user,String role){ 
    }
    
    //Implementacion gestionar un usuario
    public void manageUser(User user){
    }
    
    //Implementacion para eliminar el usuario
    public void deleteUser(User user){
    }
}
