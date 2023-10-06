
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
    
    public Usuario() {
        this("","");
    }
    
    public Usuario(String nombre, String pass) {
        this(nombre,pass,"no-user.png");
    }

    public Usuario(String nombre, String pass, String nombreFoto) {
        this.nombre = nombre;
        this.pass = pass;
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

    public String getNombreFoto() {
        return nombreFoto;
    }

    public void setNombreFoto(String nombreFoto) {
        this.nombreFoto = nombreFoto;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", pass=" + pass + '}';
    }
}
