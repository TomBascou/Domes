<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="frdomeswww.service.ServicePanier"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<jsp:useBean id="sp" class="frdomeswww.service.ServicePanier" scope = "session"/>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<html lang="en">

<head>
   <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="${pageContext.servletContext.contextPath}/asset/css/panier.css">
    
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://getbootstrap.com/docs/5.2/assets/css/docs.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    
    <link rel="stylesheet" href="${pageContext.servletContext.contextPath}/asset/css/header.css">
    <link rel="stylesheet" href="${pageContext.servletContext.contextPath}/asset/css/footer.css">
    <script src="${pageContext.servletContext.contextPath}/asset/script/index.js" defer></script>
    
    <title>Domes - Panier</title>
</head>

<body>
 <jsp:include page="../component/header.jsp"/>
    <main>
        <div class="basket">

            <div class="basket-module">
                <label for="promo-code"></label>
                <input class="input promo-code-field" id="promo-code" type="text" name="promo-code" maxlength="5">
                <button class="button promo-code-cta">Valider</button>
            </div>
            <div class="basket-labels">
                <ul class="ul">
                    <li class="li item item-heading">Produit(s)</li>
                    <li class="li price">Prix</li>
                    <li class="li quantity">Quantitée(s)</li>
                    <li class="li subtotal">Sous-total</li>
                </ul>
            </div>
			 
            <div class="basket-product">
            <c:forEach var ="i" items ="${panier}">
                <div class="item">
                    <div class="product-image">
                        <img src="https://via.placeholder.com/120x66" alt="Placholder Image 2" class=" img product-frame">
                    </div>
                    <div class="product-details">
                        <h6><span class="item-quantity">1 x</span> <c:out value ="${i.breed}"/></h6>
                        <p class="p"><c:out value ="${i.name}"/>, <c:out value ="${i.coat}"/> ans</p>
                        <p class="p">VaccinÃ©(e) : Oui</p>
                    </div>
                </div>
                <div class="price"><c:out value ="${i.price}"/></div>
                <div class="quantity">
                    <input type="number" value="1" min="1" max="1" class="quantity-field">
                </div>
                <div class="remove">
                    <button>Supprimer</button>
                </div>
                </c:forEach>
            </div>
			
			
        </div>
        <aside>
            <div class="summary">
                <div class="summary-total-items"><span class="total-items"></span>Panier</div>
                <div class="summary-subtotal">
                    <div class="subtotal-title">Sous-Total</div>
                    <div class="subtotal-value final-value" id="basket-subtotal">130.00</div>
                    <div class="summary-promo hide">
                        <div class="promo-title">Promotion</div>
                        <div class="promo-value final-value" id="basket-promo"></div>
                    </div>
                </div>
                <div class="summary-delivery">
                    <select name="delivery-collection" class="summary-delivery-selection">
                        <option value="0" selected="selected">Choix livraison</option>
                        <option value="collection">Livraison 1 Ã  2 semaines</option>
                        <option value="first-class">Livraison 72h</option>
                        <option value="second-class">Livraison 48h</option>
                        <option value="signed-for">Livraison 24h</option>
                    </select>
                </div>
                <div class="summary-total">
                    <div class="total-title">Total</div>
                    <div class="total-value final-value" id="basket-total">130.00</div>
                </div>
                <div class="summary-checkout">
                    <button class="checkout-cta button">Valider le panier</button>
                </div>
            </div>
        </aside>
    </main>
 <jsp:include page="../component/footer.jsp"/>
</body>

</html>