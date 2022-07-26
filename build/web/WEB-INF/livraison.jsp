<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="ressources/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.5/dist/umd/popper.min.js" integrity="sha384-Xe+8cL9oJa6tN/veChSP7q+mnSPaj5Bcu9mPX5F5xIGE0DVittaqT5lorf0EI7Vk" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.min.js" integrity="sha384-ODmDIVzN+pFdexxHEHFBQH3/9/vQ9uori45z4JjnFsRydbmQbmL5t1tQ0culUzyK" crossorigin="anonymous"></script>
    <title>Livraison</title>
</head>
<body>
    <nav class="navbar navbar-expand-lg bg-dark navbar-dark fixed " >
        <div class="container ">
          <a class="navbar-brand text-uppercase py-3 mx-4 text-light" href="#">IFRI</a>
          <div class="collapse navbar-collapse menu" id="navbarScroll">
           <ul  class="navbar-nav ms-auto my-2 my-lg-0 navbar-nav-scroll text-light" style="--bs-scroll-height: 100px;">
            <li class="nav-item pe-4">
                <a class="nav-link active text-light" aria-current="page" href="http://localhost:8080/ifriEquipement/Accueil">Accueil</a>
              </li>
              <li class="nav-item">
                <div class="dropdown">
                    <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    Matériel par entité
                    </button>
                    <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                      <a class="dropdown-item" href="#">Direction</a>
                    </div>
                  </div>
              </li>
           </ul>
          </div>
        </div>
      </nav>
      <section class="header my-5">
        <div class="container">
            <h1>Une livraison</h1>
        </div>
      </section>
      <section class="achat">
        <div class="container">
            <div class="row">
                <div class="col">
                    <form>
                          <div class="my-3 p-2">
                              <label for="forSelect" class="form-label">Nom de l'équipement</label>
                      <select class="form-select" aria-label="Default select example">
                          <c:forEach items="${ equipementsNonLivres }" var="equipement" varStatus="status">
                              <option value="Choisissez un équipement" selected><c:out value="${ equipement.getNomEquipement() }" /></option>
                        </c:forEach>
                       
                    </select>
                </div>
                        <div class="my-3 p-2">
                              <label for="forSelect" class="form-label">Nom de l'entité</label>
                      <select class="form-select" aria-label="Default select example">
                          <c:forEach items="${ entites }" var="entite" varStatus="status">
                              <option value="Choisissez une entité" selected><c:out value="${ entite.getNomEntite() }" /></option>
                          </c:forEach>
                        <option value="Software">Sérétariat</option>
                    </select>
                </div >
                   
                    <button type="submit" class="btn btn-primary me-auto my-3 px-5">Valider</button>
                  </form>
            </div>
        </div>
    </div>
  </section>

<!--script src="ressources/js/bootstrap.min.js"></script-->
</body>
</html>