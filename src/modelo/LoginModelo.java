package modelo;

public class LoginModelo {    
    //Ejemplo de encapsulamiento
    private final String usuario="client";          // Atributos PRIVADOS
    private final String contraseña="client546";    // Atributos PRIVADOS
    
    public boolean validarAcceso(String user, String password){ // Método PÚBLICO
        if(user.equals(usuario) && password.equals(contraseña)){
            return true;
        } else{
            return false;
        }
    }    
}
