<%@page import="java.text.SimpleDateFormat"%>
<%@page import="practicasemana15.Formulario"%>
<html>
	<head>
		<meta charset="utf-8">
		<title>Success</title>
	</head>
	<body>
		<header>
			<h2>El registro fue exitoso</h2>
		</header>
		<main>
			<table border="1">
				<%
					Formulario form = (Formulario)request.getAttribute("formulario");
				%>
				<tr>
					<td>
						Nombre
					</td>
					<td>
						<%=form.getNombre()%>
					</td>
				</tr>
				<tr>
					<td>
						Apellido
					</td>
					<td>
						<%=form.getApellido()%>
					</td>
				</tr>
				<tr>
					<td>
						Documento
					</td>
					<td>
						<%=form.getDocumento()%>
					</td>
				</tr>
				<tr>
					<td>
						Edad
					</td>
					<td>
						<%=form.getEdad()%>
					</td>
				</tr>
				<tr>
					<td>
						Ocupacion
					</td>
					<td>
						<%=form.getOcupacion()%>
					</td>
				</tr>
				<tr>
					<td>
						Fecha de Nacimiento
					</td>
					<td>
						<%
							SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
							String fechaStr = formato.format(form.getFechaNacimiento());
						%>
						<%=fechaStr%>
					</td>
				</tr>
			</table>
		</main>
		<nav>
			<a href="practicasemana15/form.jsp">Volver al formulario</a>
		</nav>
	</body>
</html>



