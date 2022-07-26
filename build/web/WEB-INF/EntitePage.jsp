<%-- 
    Document   : EntitePage
    Created on : 26 juil. 2022, 06:17:06
    Author     : dellouh
--%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!--link rel="stylesheet" href="ressources/css/bootstrap.min.css"-->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.5/dist/umd/popper.min.js" integrity="sha384-Xe+8cL9oJa6tN/veChSP7q+mnSPaj5Bcu9mPX5F5xIGE0DVittaqT5lorf0EI7Vk" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.min.js" integrity="sha384-ODmDIVzN+pFdexxHEHFBQH3/9/vQ9uori45z4JjnFsRydbmQbmL5t1tQ0culUzyK" crossorigin="anonymous"></script>
    <title>Accueil</title>
    <style>
        .header{
            background-color: rgba(2, 5,61, 0.6);
            color: white;
        }
        ul , li a {
            margin-left: 5px;
        }
       .btn-order{
        color: white;
        border-color :var(--bs-teal);
        font-size: 25px;
        font-weight: bold;
        font-style:inherit;
       }
       .btn-order:hover{
        color: white;
        background-color:var(--bs-teal) ;
       }
       .monContainer{
        background: url("ressources/images/digital.jpg") ;
        background-size: cover;
        height: 120px;
       }

    </style>
</head>
<body>
    <nav class="navbar navbar-expand-lg bg-dark navbar-dark p-fixed " >
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
                <ul class="dropdown-menu ">
                  <li><a class="dropdown-item" href="#">Direction</a></li>
               
                </ul>
              </li>
           </ul>
          </div>
        </div>
      </nav>

      <section class="main-page py-5">
        <div class="container">
                <div class="equipementlivrer">
                    <h1 class="my-5">Liste des équipements à <c:out value="${ entite.getNomEntite() }" />:</h1>
                    <table class="table table-striped">
                      <th class="my-2">Nom de l'équipement </th>
                      <th class="my-2">Catégorie</th>
                      <th class="my-2">Prix Achat</th>
                      <th class="my-2">dateAchat</th>
                      <th class="my-2">Être livré</th>
                      <c:forEach items="${ entite.getListEquipements() }" var="equipement" varStatus="status">
                        <tr>
                           <td><c:out value="${ equipement.getNomEquipement() }" /></td>
                           <td><c:out value="${ equipement.getCategoryEquipement() }" /></td>
                           <td><c:out value="${ equipement.getPrix() }" /></td>
                           <td><c:out value="${ equipement.getDateAchat() }" /></td>
                           <c:choose>
                               <c:when test="${equipement.getEtreLivre()==true}"><td> livré</td></c:when>
                               <c:when test="${ equipement.getEtreLivre()==false }"><td> Non livré</td></c:when>
                               <c:otherwise></c:otherwise>
                            </c:choose>
                        </tr>
                      </c:forEach>                    
                    </table>
                </div>
                
        </div>
      </section>


    <!--script src="ressources/js/bootstrap.min.js"></script-->
</body>
</html>
