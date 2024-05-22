<%@ page language="java" contentType ="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Profile</title>

<style>
.readpage {
	width:800px;
	padding: 2%;
	margin: auto;
	align:center;
	}
	
	table{
	width: 100%;
	table-height: 100%;
	margin:15px 0;
	border-collapse: collapse;
	}
	
	table, tr, td {
	padding:80px;
	height:40px;
	border: 1px solid #dcdcdc;
	}
	
	td{
	padding: 8px;
	}
	
	.btn-container {
            text-align: center;
        }
	
	.btn {
            font-family: "Roboto", sans-serif;
            text-transform: uppercase;
            outline: 0;
            background: #4CAF50;
            border: 0;
            padding: 15px;
            color: #FFFFFF;
            font-size: 14px;
            -webkit-transition: background 0.3s ease;
            transition: background 0.3s ease;
            cursor: pointer;
        }
	
	

</style>
</head>
<body>
	<div class="readpage">
	<center><h1>My Profile</h1></center>
	<table>
	<!--  print data from loginservlet.Below Cusdetails are taken from request.setAttribute method eke 1st parameter eken.values are carried by items. -->
	<c:forEach var="std" items="${stdDetails}">
	
	<!-- update.define variables and assign values-->
	<c:set var="id" value="${std.sid}"/>
	<c:set var="name" value="${std.sname}"/>
	<c:set var="email" value="${std.semail}"/>
	<c:set var="conno" value="${std.sconno}"/>
	<c:set var="nic" value="${std.snic}"/>
	<c:set var="dob" value="${std.sdob}"/>
	<c:set var="gender" value="${std.sgender}"/>
	<c:set var="address" value="${std.saddress}"/>
	<c:set var="username" value="${std.susername}"/>
	<c:set var="password" value="${std.spassword}"/>
	
	
	<tr>
	<td>Student ID</td>
	<td>${std.sid}</td>
	</tr>
	<!--jsp internally calls getid method in customer.java.no need to mention getid-->
	
	<tr>
	<td>Name</td>
	<td> ${std.sname}</td>
	</tr>
	
	<tr>
	<td> Email</td>
	<td> ${std.semail}</td>
	</tr>
	
	<tr>
	<td>Contact NO.</td>
	<td> ${std.sconno}</td>
	</tr>
	
	<tr>
	<td> NIC</td>
	<td> ${std.snic}</td>
	</tr>
	
	<tr>
	<td> Date of Birth</td>
	<td> ${std.sdob}</td>
	</tr>
	
	<tr>
	<td> Gender</td>
	<td> ${std.sgender}</td>
	</tr>
	
	<tr>
	<td> Address</td>
	<td> ${std.saddress}</td>
	</tr>
	
	<tr>
	<td>User Name</td>
	<td>${std.susername}</td>
	</tr>
	
	<tr>
	<td>Password </td>
	<td>${std.spassword}</td>
	</tr>
	
	<tr>
	<td>Profile Image </td>
	<td> <img src="${std.proimage}"></td>
	</tr>
	
	</c:forEach>
	</table>
	
	<div class="btn-container">
	
	<!-- Here c:url is used in update to show page that we navigate to.cusupdate is a variable. thorugh c:param values are passed. here the variables declare under c:set are used as value part.-->
	<c:url value="Studentupdate.jsp" var="stdupdate"> 
	<c:param name="id" value="${id}"/>
	<c:param name="name" value="${name}"/>
	<c:param name="email" value="${email}"/>
	<c:param name="conno" value="${conno}"/>
	<c:param name="nic" value="${nic}"/>
	<c:param name="dob" value="${dob}"/>
	<c:param name="gender" value="${gender}"/>
	<c:param name="address" value="${address}"/>
	<c:param name="uname" value="${username}"/>
	<c:param name="pass" value="${password}"/>
	<c:param name="proimage" value="${proimage}"/>
	
	</c:url>
	
	<!-- here in href the data is included through the variable decalred above in c:url tag -->
	<a href="${stdupdate}">
	<input type="button" name="update" class="btn" value="Update Profile" style="float:left;">
	</a>
	</div>
	
	<!-- Delete button -->
	<div class="btn-container">
	<c:url value="Studentdelete.jsp" var="stddelete">
	<c:param name="id" value="${id}"/>
	<c:param name="name" value="${name}"/>
	<c:param name="email" value="${email}"/>
	<c:param name="conno" value="${conno}"/>
	<c:param name="nic" value="${nic}"/>
	<c:param name="dob" value="${dob}"/>
	<c:param name="gender" value="${gender}"/>
	<c:param name="address" value="${address}"/>
	<c:param name="uname" value="${username}"/>
	<c:param name="pass" value="${password}"/>
	<c:param name="proimage" value="${proimage}"/>
	<!-- parameters passed to delete-->
	
	</c:url>
	<a href="${stddelete}">
	<input type ="button" name="delete" class="btn" value="Delete Profile" style="float:right; background:red;">
	</a>
	</div>
	
	
	
	
</div>
</body>
</html>