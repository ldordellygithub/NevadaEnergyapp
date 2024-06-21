package com.moduloGestionUsuarios.security_service.models;

import lombok.Setter;
import  lombok.Getter;

public class AccountRecovery {

    private  String  email = "";
    private  String  newPasword = "";
    private  String  confirmPassword  = "";
    private  String   reseLink  = "";

    //    variables   de asociacion  con  otras  clases


    //  methodo  para  establecer  correo  de  usuario

    public  void  setEmail (String  email){
        this.email  =  email;

    }
    //  methodo  para  obtener  correo  de  usuario ingresado

    public  String  getEmail(){
        return   email;
    }

    //  mthod  para   establecer  contraseña   de usuario

    public  void setNewPasword (String  newPasword){
        this.newPasword =  newPasword;

    }

     //  methodo para  obtener  contraseñae  de usuario

    public  String  getNewPasword (){
        return   newPasword;

    }

    //  methodo  para   confirmar  contraseña  ingresada

    public  void  setConfirmPassword( String  confirmPassword){
        this.confirmPassword =  confirmPassword;
    }


    //  methodo  para    obtener   confirmacion de   contraseña

    public  String getConfirmPassword(){
        return   confirmPassword;
    }

    //  methodo  para  establcer  link  de  restablecimiento

    public  void  setReseLink( String   reseLink){
        this.reseLink  =  reseLink;

    }

    //  methodo  para  obtener  link de  restablecimiento

    public  String  getReseLink(){
        return  reseLink;
    }

    //  methdos  para   restablecer  contraseña  de  usuario  si  cumple  con  los  parametros


    public  boolean   resetPassword(  User  user,  String  email ,  String  newPasword,  String  confirmPassword){

        if (this.email.equals(email) && newPasword.equals(confirmPassword)){
            this.newPasword  =  newPasword;
            return  true;
        }
        else {
            return   false;
        }
    };

    //  methodo  para  enviar   notificacion al  usuario  en  caso  de  que  el  email  exita

    public void sendPasswordResetEmail(String email) {
        if (this.email.equals(email)) {
            System.out.println("Se ha enviado un enlace de recuperación de contraseña a " + email);
        } else {
            System.out.println("El correo electrónico no coincide  con  el  resgistrado  en  el  sistema .");
        }
    };

    // Métodos para manejar la recuperación de cuenta
    public boolean validateEmail(String email) {
        return this.email.equals(email);
    }

    public void updateEmail(String email) {
        this.email = email;
    }

    // Método para cancelar la solicitud de recuperación de cuenta
    public void cancelEmail(String email) {
        if (this.email.equals(email)) {
            this.email = null;
            this.newPasword = null;
            this.confirmPassword = null;
            this.reseLink = null;

            // Log   para  la  operacion de  cancelacion
            System.out.println("La solicitud de recuperación de cuenta para el email " + email + " ha sido cancelada.");

            //  llamda  al  metodo de  notiicacion   User

            notifyUser(email, "Su solicitud de recuperación de cuenta ha sido cancelada.");
        } else {
            System.out.println("El correo electrónico no coincide. No se pudo cancelar la solicitud.");
        }
    };

    // Método para notificar al usuario sobre la cancelación de la solicitud

    private void notifyUser(String email, String message) {
        //   logica  para   enviar un email de notificación al usuario

        System.out.println("Notificación enviada a " + email + ": " + message);
    }
};

