<html>
	<head>
		<title>Clase36 - Inicio java web</title>
	</head>
	<body>
		<h1>Clase36 Ohh siiii </h1>
		<!-- creo un formulario -->
		<form action="<%=request.getContextPath()%>/ListadoServlet"
		 	method="POST">
			<!-- con un boton dentro -->
			<input type="submit" value="Pedir Listado"/>
		</form>
		
		<!-- creo un formulario -->
		<form action="<%=request.getContextPath()%>/ListadoServlet"
		 	method="GET">
			<!-- con un boton dentro -->
			<input type="submit" value="Pedir Listado"/>
		</form>
		
	</body>
</html>