<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<body>
<h2>Hello ${name}</h2>
<img src="/resources/img/1.jpg" style="width: 100px;height: 100px">
<c:forEach items="${list}" var="item">
    ${item}
</c:forEach>
</body>
</html>
