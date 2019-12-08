<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sistema</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.3.1/css/all.css">



</head>
<body>

<h2 class="p-3 bg-secondary text-white text-center">${msg}</h2>
	<a href="${caminho}/cadastrar.html" class="btn btn-outline-primary">Cadastrar
	<i class="far fa-plus-square"></i></a>
	
	<a href="${caminho}/" class="btn btn-outline-success">Listar
	<i class="far fa-plus-square"></i></a>
	
	<div class="col-md-6 offset-md-3 mt-3">
	<div class="card border-dark">
	
	<div class="card-body">
	<form method="post" action="gravar.html">
	<label>Nome:</label>
	<input type="text" name="nome" placeholder="Digite o nome completo" required="required"
	class="form-control form-control-sm">
	<label>Email:</label>
	<input type="text" name="email" placeholder="Digite o email completo" required="required"
	class="form-control form-control-sm">
	
	<label>Foto:</label>
	<input type="text" name="foto" placeholder="Digite o nome completo" required="required"
	class="form-control form-control-sm">
	
	<label>CEP:</label>
	<input type="text" name="cep" placeholder="Digite o cep completo" required="required"
	class="form-control form-control-sm">
	
	<label>Logradouro:</label>
	<input type="text" name="logradouro" placeholder="Digite a logradouro completo" required="required"
	class="form-control form-control-sm">
	
	<label>Cidade:</label>
	<input type="text" name="cidade" placeholder="Digite a cidade completo" required="required"
	class="form-control form-control-sm">
	
	              <label>Estado:</label> 
						<input type="text" name="estado"
						placeholder="Digite a UF" required="required"
						class="form-control form-control-sm">
						<small class="text-muted">Digite apenas 2 letras</small>
	<button type="submit" class="btn btn-success btn-block mt-2"> Gravar</button>
	
	<div class="alert alert-info alert-dismissible fade show mt-2" role="alert">${msg1}
	
	
	<button type="submit" class="close" data-dismiss="alert"><span>&times;</span>
	 </button>
	
	</div>
	</form>
	</div>
	
	</div>
	</div>
	

</body>
</html>