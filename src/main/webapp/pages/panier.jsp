<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../panier/panier.css">
    <script src="../panier/panier.js"></script>
    <title>Document</title>
</head>

<body>

    <main>
        <div class="basket">
            <div class="basket-module">
                <label for="promo-code">Entrer un code promotionnel</label>
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
                <div class="item">
                    <div class="product-image">
                        <img src="https://via.placeholder.com/120x66" alt="Placholder Image 2" class=" img product-frame">
                    </div>
                    <div class="product-details">
                        <h6><span class="item-quantity">4 x</span> Staffie</h6>
                        <p class="p">Orka, 18 mois</p>
                        <p class="p">Vacciné(e) : Oui</p>
                    </div>
                </div>
                <div class="price">750.00</div>
                <div class="quantity">
                    <input type="number" value="4" min="1" class="quantity-field">
                </div>
                <div class="subtotal">3000.00</div>
                <div class="remove">
                    <button>Supprimer</button>
                </div>
            </div>

            <div class="basket-product">
                <div class="item">
                    <div class="product-image">
                        <img src="https://via.placeholder.com/120x66" alt="Placholder Image 2" class=" img product-frame">
                    </div>
                    <div class="product-details">
                        <h6><span class="item-quantity">1 x</span> Rottweiller</h6>
                        <p class="p">Nala, 6 ans</p>
                        <p class="p">Vacciné(e) : Oui</p>
                    </div>
                </div>
                <div class="price">200.00</div>
                <div class="quantity">
                    <input type="number" value="4" min="1" class="quantity-field">
                </div>
                <div class="subtotal">200.00</div>
                <div class="remove">
                    <button>Supprimer</button>
                </div>
            </div>

            <div class="basket-product">
                <div class="item">
                    <div class="product-image">
                        <img src="https://via.placeholder.com/120x66" alt="Placholder Image 2" class=" img product-frame">
                    </div>
                    <div class="product-details">
                        <h6><span class="item-quantity">1 x</span> Staff</h6>
                        <p class="p">Izi, 3 mois</p>
                        <p class="p">Vacciné(e) : Oui</p>
                    </div>
                </div>
                <div class="price">1200.00</div>
                <div class="quantity">
                    <input type="number" value="4" min="1" class="quantity-field">
                </div>
                <div class="subtotal">1200.00</div>
                <div class="remove">
                    <button>Supprimer</button>
                </div>
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
                        <option value="collection">Livraison 1 à 2 semaines</option>
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

</body>

</html>