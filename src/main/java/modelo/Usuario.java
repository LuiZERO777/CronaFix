package modelo;

public class Usuario {

    private int id;
    private String nombre;
    private String usuario;
    private String rol;

    public Usuario() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    private String contraseña;
    public String getContraseña(){return contraseña;}
    public void setContraseña(String contraseña){this.contraseña=contraseña;}
}