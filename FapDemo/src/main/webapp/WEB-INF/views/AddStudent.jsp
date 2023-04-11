<%-- 
    Document   : AddStudent
    Created on : Apr 12, 2023, 12:00:23 AM
    Author     : seoao
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>
    <head>
        <title>FPT University Academic Portal</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.2.3/css/bootstrap.min.css"/>
    </head>
    <body>
        <div class="col-md-12 d-flex justify-content-center">
            <div class="card card-body col-md-6 mt-5 mb-4">
                <h2>Student Information</h2>
                <form action="addStudent" method="post" class="mt-3">
                    <div class="form-group mb-2">
                        <label>Student ID:</label>
                        <input type="text" name="StudentID" class="form-control">
                    </div>
                    <div class="form-group mb-2">
                        <label>Student Name:</label>
                        <input type="text" name="StudentName" class="form-control">
                    </div>
                    <div class="form-group mb-2">
                        <label>Student Email:</label>
                        <input type="text" name="StudentEmail" class="form-control">
                    </div>
                    <div class="form-group mb-2">
                        <label>Day of birth:</label>
                        <input type="date" name="DOB" class="form-control">
                    </div>
                    <div class="form-group mb-2">
                        <label>Gender:</label>
                        <select name="gender" class="form-control">
                            <option value="1" selected="">Male</option>
                            <option value="0">Female</option>
                        </select>
                    </div>
                    <div class="form-group mb-2">
                        <label>Address:</label>
                        <input type="text" name="Address" class="form-control">
                    </div>
                    <div class="form-group mb-2">
                        <label>Major</label>
                        <select name="MajorID" class="form-control">
                            <c:forEach items="${item}" var="m">
                                <option value="${m.getMajorID()}">${m.getMajorTitle()}</option>
                            </c:forEach>
                        </select>
                    </div>
                    
                    <input type="submit" value="SAVE" class="btn btn-primary">
                </form>
            </div>
        </div>
    </body>
</html>
