package cine.user;

import excepciones.EmailException;
import excepciones.LetrasException;

public abstract class Usuario {
    private String email;
    private String password;
    private String nombre;
    private String apellido;

    public Usuario(String email, String password, String nombre, String apellido) {
        this.email = email;
        this.password = password;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws EmailException{
        if (!email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
            throw new EmailException("Email inválido");
        }else{
            this.email = email;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws LetrasException{
        if (!nombre.matches("[a-zA-Z]+")) {
            throw new LetrasException("El campo debe contener solo letras");
        }else{
            this.nombre = nombre;
        }
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) throws LetrasException{
        if (!apellido.matches("[a-zA-Z]+")) {
            throw new LetrasException("El campo debe contener solo letras");
        }else{
            this.apellido = apellido;
        }
    }

    public abstract void logeo();

    @Override
    public String toString() {
        return "Informacion del usuario: { \n" +
                "Nombre y apellido: '" + nombre + apellido + "\n" +
                "Contraseña: " + password + "\n" +
                "Email: '" + nombre + '\n' + '}';
    }
}
