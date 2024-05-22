<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Update Customer</title>
    <style>
        .login-page {
            width: 800px;
            padding: 2% 0 0;
            margin: auto;
        }
        .form-container {
            position: relative;
            background: #FFFFFF;
            max-width: 800px;
            padding: 45px;
            text-align: center;
            box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);
        }
        .form-container table {
            width: 100%;
        }
        .form-container tr {
            margin: 0 0 15px;
        }
        .form-container td {
            color: #1a1a1a;
        }
        .form-container .form-control {
            font-family: "Roboto", sans-serif;
            outline: 0;
            background: #f2f2f2;
            width: 100%;
            border: 0;
            margin: 0 0 15px;
            padding: 15px;
            box-sizing: border-box;
            font-size: 14px;
        }
        .form-container .btn {
            font-family: "Roboto", sans-serif;
            text-transform: uppercase;
            outline: 0;
            background: #4CAF50;
            width: 100%;
            border: 0;
            padding: 15px;
            color: #FFFFFF;
            font-size: 14px;
            -webkit-transition: all 0.3s ease;
            transition: all 0.3s ease;
            cursor: pointer;
        }
        .form-container .btn:hover, .form-container .btn:active, .form-container .btn:focus {
            background: #43A047;
        }
    </style>
</head>
<body>

<!-- write java code in html to catch data coming from useraccount.jsp-->
 <!-- here the c:param name is given as parameters below(as id,name etc) -->
 <%
 	
 	String id = request.getParameter("id");
	String name = request.getParameter("name");
 	String email = request.getParameter("email");
 	String conno = request.getParameter("conno");
	String nic = request.getParameter("nic");
	String dob = request.getParameter("dob");
	String gender = request.getParameter("gender");
	String address = request.getParameter("address");
 	String username = request.getParameter("uname");
 	String password = request.getParameter("pass");
 	String proimage = request.getParameter("proimage");
 	
 %>
<!-- partial:index.partial.html -->
<div class="login-page">
    <div class="form-container">
        <form action="update" method="post">
            <table>
            <!-- assign values here.oranfe clr tags are used to write javain jsp file.here above decalred variables are used as values to get values.-->
                <tr>
                    <td>Customer Id</td>
                    <td><input type="text" name="cusid" class="form-control" value="<%= id %>"></td>
                </tr>
                <tr>
                    <td>Name</td>
                    <td><input type="text" name="name" class="form-control" value="<%= name %>"></td>
                </tr>
                <tr>
                    <td>Email</td>
                    <td><input type="text" name="email" class="form-control" value="<%= email %>"></td>
                </tr>
                <tr>
                    <td>Contact No</td>
                    <td><input type="text" name="conno" class="form-control" value="<%= conno %>"></td>
                </tr>
                <tr>
                    <td>NIC</td>
                    <td><input type="text" name="nic" class="form-control" value="<%= nic %>"></td>
                </tr>
                <tr>
                    <td>Date of Birth</td>
                    <td><input type="text" name="dob" class="form-control" value="<%= dob %>"></td>
                </tr>
                <tr>
                    <td>Gender</td>
                    <td><input type="text" name="gender" class="form-control" value="<%= gender %>"></td>
                </tr>
                <tr>
                    <td>Address</td>
                    <td><input type="text" name="address" class="form-control" value="<%= address %>"></td>
                </tr>
                <tr>
                    <td>User Name</td>
                    <td><input type="text" name="uname" class="form-control" value="<%= username %>"></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" name="pass" class="form-control" value="<%= password %>"></td>
                </tr>
                
                <tr>
					<td>Profile Image</td>
					<td><input type="file" name="proimage" value="<%= proimage %>"></td>
                
            </table>
            <br>
            <input type="submit" name="submit" class="btn" value="Update my data"><br>
        </form>
    </div>
</div>
<!-- partial -->
</body>
</html>
