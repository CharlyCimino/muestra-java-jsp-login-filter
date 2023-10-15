
package ar.charlycimino.muestra.java.jsp.login.model;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Usuario {
    private String nombre;
    private String pass;
    private String nombreFoto;
    private String rol;
    
    public Usuario(String nombre, String pass, String rol) {
        this(nombre,pass,rol,"no-user.png");
    }

    public Usuario(String nombre, String pass, String rol, String nombreFoto) {
        this.nombre = nombre;
        this.pass = pass;
        this.rol = rol;
        this.nombreFoto = nombreFoto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getNombreFoto() {
        return nombreFoto;
    }

    public void setNombreFoto(String nombreFoto) {
        this.nombreFoto = nombreFoto;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", pass=" + pass + ", nombreFoto=" + nombreFoto + ", rol=" + rol + '}';
    }    
}
