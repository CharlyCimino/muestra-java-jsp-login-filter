<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<c:import url="includes/inicioHTML.jsp">
    <c:param name="elTitulo" value="Perfil de ${userLogueado.nombre}" />
</c:import>

<c:import url="includes/navbar.jsp" />

<div class="container mt-5">
    <h1>Perfil de ${userLogueado.nombre}</h1>
    
    <img src="img/perfiles/${userLogueado.nombreFoto}" alt="alt"/>
</div>

<c:import url="includes/footer.jsp" />
<c:import url="includes/finHTML.jsp" />
