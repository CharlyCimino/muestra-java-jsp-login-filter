/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Filter.java to edit this template
 */
package ar.charlycimino.muestra.java.jsp.login.filters;

import java.io.IOException;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

/**
 *
 * @author Charly Cimino
 */
public class AuthFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpSession session = httpRequest.getSession();
        if (session != null && session.getAttribute("userLogueado") != null) {            
            chain.doFilter(request, response); // Ir al siguiente en la cadena de filters
        } else {
            request.setAttribute("hayError", true);
            request.setAttribute("mensajeError", "Hay que autenticarse primero!");
            // httpRequest.getServletPath() me trae el servlet/jsp de origen, por ejemplo, "/perfil" o "/restringida"
            String origen = httpRequest.getServletPath();
            // Armo la queryString, por ejemplo, "?origen=/perfil" o "?origen=/restringida"
            String queryS = "?origen=" + origen;
            // Lo mando para el servlet de login con el dato de origen como parámetro
            // "/login?origen=/perfil" o "/login?origen=/restringida"
            request.getRequestDispatcher("/login" + queryS).forward(request, response);
        }
    }
}
