<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<c:import url="WEB-INF/includes/inicioHTML.jsp">
    <c:param name="elTitulo" value="Info" />
</c:import>

<c:import url="WEB-INF/includes/navbar.jsp" />

<div class="container mt-5">
    <h1>Info</h1>
    <p>No es necesario autenticarse para estar aquí, es un simple jsp sin mucha lógica</p>
    <hr>
    <h2>Cosas a saber</h2>
    <ul>
        <li>HTTP es un protocolo sin estado. Una vez que un navegador realiza una solicitud, interrumpe la conexión con el servidor. Entonces, para mantener el estado, una aplicación web debe utilizar el seguimiento de sesiones.</li>
        <li>De forma predeterminada, la API del servlet utiliza una cookie para almacenar un ID de sesión en cada navegador.
Luego, el navegador pasa la cookie al servidor con cada solicitud.</li>
        <li>Para almacenar los datos de cada sesión, el servidor crea un objeto de sesión cuando un browser realiza la primera solicitud a un sitio. Es destruido cuando termina la sesión.</li>
        <li>Una sesión finaliza cuando transcurre un período de tiempo específico sin otra solicitud o
cuando el usuario sale del navegador.</li>
        
    </ul>
    <h2>Manejar la sesión en un servlet</h2>
    <code>
        <pre style="font-size: 1.3rem">
    // Code that gets a session object
    HttpSession session = request.getSession{);
    // Code that sets a String object as an attribute
    session.setAttribute("productCode", productCode);
    // Code that sets a user-defined object as an attribute
    Cart cart = new Cart (productCode);
    session.setAttribute("cart", cart);
    // Code that gets a String object
    String productCode = (String) session.getAttribute("productCode");
    // Code that gets a user-defined object
    Cart cart = (Cart) session.getAttribute("cart");
    if (cart == null) {
        cart = new Cart() ;
    }
    // Code that removes an object
    session.removeAttribute("productCode");
    // A method that gets all the names of the attributes for a session
    Enumeration names = session.getAttributeNames();
    while (names.hasMoreElements()) {
        System.out.println((String) names.nextElement());
    }
    // A method that gets the ID for a session
    String jSessionid = session.getid();
    // A method that sets the inactive interval (in seconds) for a session
    session.setMaxinactiveinterval(60*5); // 5 minutos
    session.setMaxinactiveinterval(60*60*24); // 24 horas
    session.setMaxinactiveinterval(-1); // No finalizará hasta que el usuario cierre el navegador 
    // A method that invalidates the session and unbinds any objects
    session.invalidate();
        </pre>        
    </code>

</div>

<c:import url="WEB-INF/includes/footer.jsp" />
<c:import url="WEB-INF/includes/finHTML.jsp" />