<%@ page import="java.util.List" %>
<%@ page import="com.gl.demo.Etudiant" %><%--
  Created by IntelliJ IDEA.
  User: macbookpro
  Date: 21/04/2026
  Time: 21:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/ressource/styles.css">
</head>
<body>
    <a href="accueil">Aller sur Accueil</a>
    <h1> All the Time </h1>
    <ol>



    </ol>
    <c:forEach items="${etuds}" var="e">
        <li> ${e.nom}</li>
    </c:forEach>

</body>
</html>
