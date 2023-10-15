package ar.charlycimino.muestra.java.jsp.login.filters;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class UtilFilter {

    public static void generarError(HttpServletRequest request, HttpServletResponse response, String mensajeError) throws ServletException, IOException {
        request.setAttribute("hayError", true);
        request.setAttribute("mensajeError", mensajeError);
        // httpRequest.getServletPath() me trae el servlet/jsp de origen, por ejemplo, "/perfil" o "/restringida"
        String origen = request.getServletPath();
        // Armo la queryString, por ejemplo, "?origen=/perfil" o "?origen=/restringida"
        String queryS = "?origen=" + origen;
        // Lo mando para el servlet de login con el dato de origen como parámetro
        // "/login?origen=/perfil" o "/login?origen=/restringida"
        request.getRequestDispatcher("/login" + queryS).forward(request, response);
    }
}
