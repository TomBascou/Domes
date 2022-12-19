<!DOCTYPE html>
<html lang="fr">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    
    <link rel="stylesheet"
	href="${pageContext.servletContext.contextPath}/asset/css/header.css">
<link rel="stylesheet"
	href="${pageContext.servletContext.contextPath}/asset/css/footer.css">
    <link rel="stylesheet" href="${pageContext.servletContext.contextPath}/asset/css/connexion.css">
    
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css"
        integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://getbootstrap.com/docs/5.2/assets/css/docs.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <script src="index.js" defer></script>
</head>

<body>
    <div class="header-height"></div>
   

 <jsp:include page="../component/header.jsp"/>
    
    <main class="m-auto w-75 mt-5 container d-grid formul ">
        <form class="w-100 m-auto text-dark bg-white px-5 d-flex justify-content-center login" action ="../Login" method = "POST">
            <div class="w-75 formm">
            <!-- Email input -->
            <h2 class="text-center">Connectez vous!</h2>
            <div class="form-outline mb-4 mt-auto">
              <input id="form2Example1" class="form-control" name="login" required="required" />
              <label class="form-label" for="form2Example1">Adresse Mail</label>
            </div>
          
            <!-- Password input -->
            <div class="form-outline mb-4">
              <input type="password" id="form2Example2" class="form-control" name="password" required="required"/>
              <label class="form-label" for="form2Example2">Mot de passe</label>
            </div>
          
            <!-- 2 column grid layout for inline styling -->
            <div class="row mb-4">
              <div class="col d-flex justify-content-center">
                <!-- Checkbox -->
                <div class="form-check">
                  <input class="form-check-input" type="checkbox" value="" id="form2Example31" checked />
                  <label class="form-check-label" for="form2Example31"> Se souvenir de moi </label>
                </div>
              </div>
          
              <div class="col">
                <!-- Simple link -->
                <a href="#!">Mot de passe oublié ?</a>
              </div>
            </div>
          
            <!-- Submit button -->
            <input type="submit" class="btn btn-primary btn-block mb-4" value = "Se connecter">
          
            <!-- Register buttons -->
            <div class="text-center">
         
              <p>Ou Connectez vous avec :</p>
              <button type="button" class="btn btn-link btn-floating mx-1">
                <i class="fab fa-facebook-f"></i>
              </button>
          
              <button type="button" class="btn btn-link btn-floating mx-1">
                <i class="fab fa-google"></i>
              </button>
          
              <button type="button" class="btn btn-link btn-floating mx-1">
                <i class="fab fa-twitter"></i>
              </button>
          
              <button type="button" class="btn btn-link btn-floating mx-1">
                <i class="fab fa-github"></i>
              </button>
            </div>
        </div>
        </form>
          <div class="inscript text-center d-flex">
            <div class="w-75 m-auto mt-4 align-items-center text-white">
                <h2>Pas de compte? inscrivez vous!</h2>
                <br> 
                <p>Entrez vos informations personnelles et rejoignez nous dans notre aventure!</p>
                <button type="button" class="btn btn-primary">Inscrivez vous</button>
            </div>
          </div>
    </main>
     <jsp:include page="../component/footer.jsp"/>
</body>

</html>