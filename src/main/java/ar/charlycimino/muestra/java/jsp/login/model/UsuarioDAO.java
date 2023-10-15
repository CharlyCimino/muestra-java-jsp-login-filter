package ar.charlycimino.muestra.java.jsp.login.model;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class UsuarioDAO {

    // Esto es de mentira. El verdadero 'autenticar' se fija en la base de datos...
    public Usuario autenticar(String nombre, String pass) {
        Usuario u = null;
        if (pass.equals("123456")) {
            switch (nombre) {
                case "homero":
                    u = new Usuario(nombre, pass, "ADMIN", nombre + ".jpg");
                    break;
                case "bart":
                    u = new Usuario(nombre, pass, "USER");
                    break;
                case "lisa":
                    u = new Usuario(nombre, pass, "USER", nombre + ".jpg");
            }
        }
        return u;
    }
}
