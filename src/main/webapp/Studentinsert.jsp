<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Create Customer</title>
    <style>
        .login-page {
            width: 900px;
            padding: 8% 0 0;
            margin: auto;
        }
        .form-container {
            position: relative;
            z-index: 1;
            background: #FFFFFF;
            max-width: 700px;
            margin: 0 auto 100px;
            padding: 45px;
            text-align: left;
            box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);
        }
        .form-container .form-group {
            margin: 0 0 15px;
        }
        .form-container .form-group label {
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
        .container {
            position: relative;
            z-index: 1;
            max-width: 300px;
            margin: 0 auto;
        }
        .container:before, .container:after {
            content: "";
            display: block;
            clear: both;
        }
        .container h2 {
            margin: 0 0 15px;
            padding: 0;
            font-size: 36px;
            font-weight: 300;
            color: #1a1a1a;
        }
    </style>
</head>
<body>
<!-- partial:index.partial.html -->
<div class="login-page">
    <div class="form-container">
        <center><h2>Register New Student</h2></center>
        <form action="insert" method="post">
            <div class="form-group">
                <label for="sname">Name</label>
                <input type="text" class="form-control" id="sname" name="Sname">
            </div>
            <div class="form-group">
                <label for="semail">Email</label>
                <input type="text" class="form-control" id="semail" name="Semail">
            </div>
            <div class="form-group">
                <label for="sconno">Contact No</label>
                <input type="text" class="form-control" id="sconno" name="Sconno">
            </div>
            <div class="form-group">
                <label for="snic">NIC</label>
                <input type="text" class="form-control" id="snic" name="Snic">
            </div>
            <div class="form-group">
                <label for="sdob">Date of Birth</label>
                <input type="date" class="form-control" id="sdob" name="Sdob">
            </div>
            <div class="form-group">
                <label for="sgender">Gender</label>
                <input type="text" class="form-control" id="sgender" name="Sgender">
            </div>
            <div class="form-group">
                <label for="saddress">Address</label>
                <input type="text" class="form-control" id="saddress" name="Saddress">
            </div>
            <div class="form-group">
                <label for="susername">User Name</label>
                <input type="text" class="form-control" id="susername" name="Susername">
            </div>
            <div class="form-group">
                <label for="spassword">Password</label>
                <input type="password" class="form-control" id="spassword" name="Spassword">
            </div>
            
            <div class="form-group">
                <label for="proimage">Profile Image</label>
                <input type="file" class="form-control"  name="proimage">
            </div>
  
            <button type="submit" class="btn" name="submit">Create Customer</button>
        </form>
    </div>
</div>
<!-- partial -->
</body>
</html>
