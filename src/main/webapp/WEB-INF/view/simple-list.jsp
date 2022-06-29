<%@ page language="java" contentType="text/html;charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
    <html>
        <head>
            <title><spring:message code="get_list" /></title>
        </head>
        <body>
            <a href="${pageContext.request.contextPath}/simple">GET Transaction</a>
            <br/>
            <form action="${pageContext.request.contextPath}/simple" method="post">
                <input type="submit" value="POST Transaction"/>
            </form>
        </body>
    </html>