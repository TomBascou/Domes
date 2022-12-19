<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Domes - Nos produits</title>
<link
	href="${pageContext.servletContext.contextPath}/asset/css/product.css"
	rel="stylesheet">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
	
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="https://getbootstrap.com/docs/5.2/assets/css/docs.css" rel="stylesheet">
<script	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>

<link rel="stylesheet" href="${pageContext.servletContext.contextPath}/asset/css/header.css">
<script	src="${pageContext.servletContext.contextPath}/asset/js/index.js" defer></script>
<script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
<script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
<link rel="stylesheet" href="${pageContext.servletContext.contextPath}/asset/css/footer.css">
</head>

	
<body>
	<jsp:include page="../component/header.jsp" />
	<main>
		<div class="container my-5">

			<div class="card details-card p-0">
				<div class="row">

					<div class="col-md-6 col-sm-12">
						<!--  <img class="img-fluid details-img" src="https://source.unsplash.com/5Tm4YRqnNcM" alt=""> -->
					</div>
					<div class="col-md-6 col-sm-12 description-container p-5">
						<div class="main-description">
							<p class="product-category mb-0">Chien</p>
							<h3>Paf le chien</h3>
							<hr>
							<p class="product-price">1199.00</p>
							<form action="../Panier" class="add-inputs" method="post" >
                            <input type="number" class="form-control" id="cart_quantity" name="idProduit" value="1">
                            <button type="submit" class="mt-2 btn btn-primary btn-lg">Ajouter au panier</button>
                        </form>
							<br>
							<form class="add-inputs" method="post">
								<button name="add_to_cart" type="submit"
									class="btn btn-primary btn-lg">Ajouter aux favoris</button>
							</form>
							<div style="clear: both"></div>

							<hr>


							<p class="product-title mt-4 mb-1">A propos de Paf</p>
							<p class="product-description mb-4">Lorem ipsum dolor sit
								amet consectetur, adipisicing elit. Quis assumenda voluptatem
								tempore dolor quod. Expedita, id, minus similique dolor sed
								adipisci aliquam natus amet doloremque delectus cupiditate?
								Sint, quasi, ad necessitatibus omnis quaerat tenetur corporis
								porro aut, natus ex ab id vel odit veniam fugiat temporibus
								aperiam quia rem minima!</p>

							<hr>
							<ul class="social-list">
								<li><a href="#"><i class="fa-brands fa-facebook"></i></a></li>
								<li><a href="#"><i class="fa-brands fa-twitter"></i></a></li>
								<li><a href="#"><i
										class="fa-brands fa-square-instagram"></i></a></li>

							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
	</main>
	<jsp:include page="../component/footer.jsp" />
</body>
</html>