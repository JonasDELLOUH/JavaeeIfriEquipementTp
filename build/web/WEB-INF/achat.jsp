<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="ressources/css/bootstrap.min.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.5/dist/umd/popper.min.js" integrity="sha384-Xe+8cL9oJa6tN/veChSP7q+mnSPaj5Bcu9mPX5F5xIGE0DVittaqT5lorf0EI7Vk" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.min.js" integrity="sha384-ODmDIVzN+pFdexxHEHFBQH3/9/vQ9uori45z4JjnFsRydbmQbmL5t1tQ0culUzyK" crossorigin="anonymous"></script>
    
    <title>Accueil</title>
</head>
<body>
    <nav class="navbar navbar-expand-lg bg-dark navbar-dark fixed " >
        <div class="container ">
       <div class="">
            <img src="ressources/images/ifri.png" class="img-fluid" alt="" srcset="">
          </div>
          <div class="collapse navbar-collapse menu" id="navbarScroll">
           <ul  class="navbar-nav ms-auto my-2 my-lg-0 navbar-nav-scroll text-light" style="--bs-scroll-height: 100px;">
            <li class="nav-item pe-4">
                <a class="nav-link active text-light" aria-current="page" href="http://localhost:8080/ifriEquipement/Accueil">Accueil</a>
              </li>
              <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle text-light" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                    Matérielle par entité
                </a>
                <ul class="dropdown-menu text-light">
                  <li><a class="dropdown-item text-light" href="#">Direction</a></li>
                </ul>
              </li>
           </ul>
          </div>
        </div>
      </nav>
      <section class="header my-5">
        <div class="container">
            <h1>Un achat !</h1>
        </div>
      </section>
      <section class="achat">
        <div class="container">
            <div class="row">
                <div class="col">
                    <form>
                      <div class="mb-3">
                        <label for="exampleInputPassword1" class="form-label">Nom</label>
                        <input type="text" name="nom" class="form-control" id="exampleInputPassword1">
                      </div>
                      <div class="mb-3">
                        <label for="exampleInputPassword1" class="form-label">Prix</label>
                        <input type="text" name="prix" class="form-control" id="exampleInputPassword1">
                      </div>
                    <div>
                      <select class="form-select" aria-label="Default select example">
                        <option selected>SÃ©lectionner la catÃ©gorie</option>
                        <option value="Hadware">Hadware</option>
                        <option value="Software">Software</option>
                      </select>
                    </div>
                       
                        <button type="submit" class="btn btn-primary me-auto my-3 px-5">Valider</button>
                      </form>
                </div>
            </div>
        </div>
      </section>

    <!--script src="ressources/js/bootstrap.min.js"></script-->
</body>
</html>