/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package ar.charlycimino.muestra.java.jsp.login;

import ar.charlycimino.muestra.java.jsp.login.model.Usuario;
import ar.charlycimino.muestra.java.jsp.login.model.UsuarioDAO;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Si viene de un filter, será con una ruta como "/login?origen=/perfil" o "/login?origen=/restringida"
        String origen = request.getParameter("origen"); // Obtengo el origen
        request.setAttribute("deDondeViene", origen); // Lo seteo como valor para poner en el form del .jsp (ir a verlo)
        request.getRequestDispatcher("/WEB-INF/login-page.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String n = request.getParameter("nombre");
        String p = request.getParameter("pass");
        Usuario user = new UsuarioDAO().autenticar(n, p);
        if (user != null) {
            // ¿Recordás el input oculto en el .jsp? Lo obtengo y lo guardo
            String haciaDondeIba = request.getParameter("deDondeViene");
            HttpSession session = request.getSession(); // Pido la sesión actual
            session.setMaxInactiveInterval(10); // Seteo tiempo máximo de inactividad (en segundos)
            session.setAttribute("userLogueado", user); // Asigno la info del usuario a la sesión
            // Lo mando hacia donde quería ir
            response.sendRedirect(request.getContextPath() + haciaDondeIba);
        } else {
            request.setAttribute("hayError", true);
            request.setAttribute("mensajeError", "Credenciales incorrectas!");
            doGet(request, response);
        }
    }
}
