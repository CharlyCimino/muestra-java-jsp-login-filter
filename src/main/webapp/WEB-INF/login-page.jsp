<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<c:import url="includes/inicioHTML.jsp">
    <c:param name="elTitulo" value="Login" />
</c:import>

<c:import url="includes/navbar.jsp" />

<c:if test="${hayError}">
    <div class="container mt-3 p-3 bg-danger text-light">
        <h2>${mensajeError}</h2>
    </div>
</c:if>

<div class="container mt-3">
    
    <form name="elForm" action="${pageContext.request.contextPath}/login" method="post" >
        <label for="nombre">Usuario:</label> <br>
        <input type="text" id="nombre" name="nombre">
        <br/><br/>
        <label for="pass">Clave: </label> <br>
        <input type="password" id="pass" name="pass">
        <br/><br/>
        <!-- Se arma un input oculto que va a enviar no solo el user y pass, sino también de dónde viene -->
        <input type="hidden" name="deDondeViene" value="${param.origen}">
        <input type="submit" value="Iniciar sesión">
    </form>
        <p><small>Los usuarios son 'homero' y 'bart'. Ambos con clave 123456</small></p>
</div>
       
<c:import url="includes/footer.jsp" />
<c:import url="includes/finHTML.jsp" />
