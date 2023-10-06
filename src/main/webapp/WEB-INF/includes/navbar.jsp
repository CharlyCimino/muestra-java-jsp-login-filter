<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="container-fluid">
    <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
        <div class="container-fluid">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="${pageContext.request.contextPath}">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="${pageContext.request.contextPath}/info.jsp">Info</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="${pageContext.request.contextPath}/perfil">Mi perfil</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="${pageContext.request.contextPath}/restringida">Zona restringida</a>
                </li>
            </ul>
            <form class="d-flex">
                <c:choose>
                    <c:when test="${userLogueado == null}">
                        <a class="btn btn-primary" href="${pageContext.request.contextPath}/login">Login</a>
                    </c:when>
                    <c:otherwise>
                        <a class="btn btn-danger" href="${pageContext.request.contextPath}/logout">Logout</a>
                    </c:otherwise>
                </c:choose> 
            </form>
        </div>
    </nav>
</div>