<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<c:import url="includes/inicioHTML.jsp">
    <c:param name="elTitulo" value="Zona restringida" />
</c:import>

<c:import url="includes/navbar.jsp" />

<div class="container mt-5">
    <h1>Zona restringida</h1>
    <img src="img/permitido.png" alt="alt"/>
    <p>Podés estar aquí (por un rato...)</p>
    <p>Actualmente la sesión dura ${pageContext.session.maxInactiveInterval} segundos</p>
</div>

<c:import url="includes/footer.jsp" />
<c:import url="includes/finHTML.jsp" />
