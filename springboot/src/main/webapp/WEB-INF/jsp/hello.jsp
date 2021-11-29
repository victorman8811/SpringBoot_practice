<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <title>Hello</title>
    </head>
    <body>
        <h1>Task List</h1>

        <table border=1>

        <tr>
            <th>Task_Seq</th>
            <th>Task_Name</th>
            <th>Description</th>
            <th>Delete</th>
        </tr>

        <c:forEach items="${tasks}" var="task">

          <tr>
            <td>${task.getSeq()}</td>
            <td>${task.getName()}</td>
            <td>${task.getDescription()}</td>
            <td><a href="<c:url value="/delete/${task.getSeq()}" />" >Delete</a></td>
          </tr>
        </c:forEach>

        </table>

        <h1>Add New Task</h1>

        <form action="/add">
            <span>Name:</span>
            <input type="text" name="name" value=""/><br/>

            <span>Description:</span>
            <input type="text" name="description" value=""/><br/>

            <input type="submit" value="save"/>
         </form>
    </body>
</html>