<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registro de nuevo paciente</title>
</head>
<body>
	<form action="/crearpaciente.do" method="post">
		<h4>registro de nuevo paciente</h4>
		<input type="text" placeholder="Nombre y Apellido" name="txtApeyno"/><p/>
		<input type="text" placeholder="direccion" name="txtDireccion"/><p/>
		<input type="text" placeholder="dni" name="txtDni"/><p/>
		<input type="text" placeholder="direccion" name="txtDireccion"/><p/>
		
		<input type="date" placeholder="fecha de nacimiento" name="dtdFecha"/><p/>
		<input type="submit" value="crear paciente"/><p/>
	</form>
</body>
</html>