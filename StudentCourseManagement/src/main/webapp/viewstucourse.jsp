<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>All Courses for Students</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
        }

        h3 {
            text-align: center;
            margin-top: 20px;
            color: #333;
        }

        .table-container {
            margin: 20px auto;
            width: 80%;
            background-color: white;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
        }

        table {
            width: 100%;
            border-collapse: collapse;
        }

        th, td {
            text-align: left;
            padding: 10px;
            border-bottom: 1px solid #ddd;
        }

        th {
            background-color: #4CAF50;
            color: white;
        }

        tr:nth-child(even) {
            background-color: #f2f2f2;
        }

        tr:hover {
            background-color: #ddd;
        }

        .btn-view {
            padding: 5px 10px;
            background-color: #007BFF;
            border: none;
            border-radius: 5px;
            color: white;
            cursor: pointer;
        }

        .btn-view:hover {
            opacity: 0.8;
        }

        /* Responsive Design */
        @media (max-width: 600px) {
            .table-container {
                width: 95%;
            }

            table, th, td {
                font-size: 14px;
            }
        }
    </style>
</head>
<body>

<div class="table-container">
    <h3>View All Courses</h3>
    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Course Code</th>
            <th>Description</th>
        </tr>
        <c:forEach items="${courselist}" var="course">
            <tr>
                <td><c:out value="${course.id}"></c:out></td>
                <td><c:out value="${course.name}"></c:out></td>
                <td><c:out value="${course.code}"></c:out></td>
                <td><c:out value="${course.description}"></c:out></td>
            </tr>
        </c:forEach>
    </table>
</div>

</body>
</html>
