

package com.moduloGestionUsuarios.security_service.models;
import java.util.Date;
import lombok.Setter;
import  lombok.Getter;

public class Session {
    private User username; //   relacion   Composición: Session contiene a un User
    private String sessionStatus;
    private Date startTime;
    private Date endTime;

    // Constructor que inicializa la sesión con un usuario
    public Session(User user) {
        this.username = user;
        this.sessionStatus = "activa"; // Estado inicial de la sesión
        this.startTime = new Date(); // La sesión comienza a
    }


    // Método para verificar si la sesión está activa
    public boolean isActive() {
        Date currentTime = new Date();
        if (endTime == null || currentTime.before(endTime)) {
            return !"finalizada".equalsIgnoreCase(sessionStatus);
        }
        return false;
    }

    // Método para finalizar la sesión
    public void endSession() {
        this.endTime = new Date(); // Establece el tiempo de finalización
        this.sessionStatus = "finalizada"; // Actualiza el estado de la sesión
    }

    // Método para obtener el usuario asociado con la sesión
    public User getUser() {
        return this.username;
    }

    // Otros getters y setters  apra  verificas  detalles  de  la  session active.!

    public  String  getSessionStatus(){
        return  sessionStatus;
    }

    public Date getStartTime(){
        return   startTime;
    }

    public Date  getEndTime(){
        return   endTime;
    }
}




