<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Index</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.3.1/css/all.css">

<%@ page import="entity.*,java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="caminho" value="${pageContext.request.contextPath}" />

</head>
<body>
	<h2 class="p-3 bg-secondary text-white text-center">${msg}</h2>
	<a href="${caminho}/cadastrar.html" class="btn btn-outline-primary">Cadastrar
	<i class="far fa-plus-square"></i></a>
	
	<a href="${caminho}/listar.html" class="btn btn-outline-success">Listar
	<i class="far fa-plus-square"></i></a>
	
	<c:out value="${caminho}" />

	<div class="container-fluid">

		<div class="row card-group mt-3">
			<c:forEach items="${lista}" var="linha">
				<div class="col-md-4">
					<div class="card shadow border-dark bg-light mb-3">
						<div class="card-img-top mt-3">
							<img src="${linha.foto}" style="width: 100px; border-radius: 50%"
								class="d-block mx-auto img-thumbnail shadow border-dark">

						</div>
						
						
						<div class="card-body">
						
						<i class="far fa-id-card"></i><b>Nome:</b>${linha.nome}<br> 
						<i class="fas fa-envelope"></i><b>Email:</b>${linha.email}<br>
						<hr>
						<i class="fas fa-home"></i><b>Logradouro:</b>${linha.endereco.logradouro}<br>
						<i class="fas fa-street-view"></i><b>Bairro:</b>${linha.endereco.bairro}<br>
						<i class="fas fa-city"></i><b>Cidade:</b>${linha.endereco.cidade}<br>
						<i class="fas fa-flag"></i><b>Estado:</b>${linha.endereco.estado}<br>
						<i class="fas fa-globe-americas"></i><b>CEP:</b>${linha.endereco.cep}<br>
						</div>
						
						
						
					</div>

				</div>



			</c:forEach>


		</div>



	</div>


</body>
</html>