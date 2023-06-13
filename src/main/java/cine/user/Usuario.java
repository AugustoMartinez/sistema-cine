package cine.user;

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

    public void setEmail(String email) {
        this.email = email;
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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
