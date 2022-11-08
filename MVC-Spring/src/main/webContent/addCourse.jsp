<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
 <head>
 <meta http-equiv="Content-Type"
 	content="text/html; charset=UTF-8">
 <title> Formulario Curso</title>
 </head>
 <body>
 	<h1> EMPLOYEE APP</h1>
 	<h2> Hola, por favor ingrese los datos del curso </h2>
 	<form action="AddCourse" method="post">
 		<table cellspacing="3" cellpadding="3" border="1" >
 			<tr>
 			<td align="right"> Id Asignatura: </td>
 			<td><input type="text" name="id_course"></td>
 			</tr>
 			<tr>
 			<td align="right"> Nombre Asignatura: </td>
 			<td> <input type="text" name="name_course"> </td>
 			</tr>
	 		<tr>
	 		<td align="right"> Nombre Escuela: </td>
 		<td> <input type="text" name="name_school"> </td>
	 </tr>
 		<tr>
 		<td align="right"> Nombre Profesor: </td>
		 <td> <input type="text" name="name_teacher"> </td>
		 </tr>
 		<tr>
 		<td align="right"> Intensidad horaria: </td>
 		<td> <input type="number" name="time_course"> </td>
 		</tr>
 	</table>
 <input type="submit" value="Enviar">
 </form>
 </body>
</html>
