<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head><title>Lista de Hechos</title></head>
<body>
    <h2>Hechos</h2>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Descripción</th>
            <th>Fecha</th>
            <th>Valor</th>
        </tr>
        <c:forEach var="hecho" items="${requestScope.hechos}">
            <tr>
                <td>${hecho.id}</td>
                <td>${hecho.descripcion}</td>
                <td>${hecho.fecha}</td>
                <td>${hecho.valor}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
