<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <!--link rel="stylesheet" href="ressources/css/bootstrap.min.css"-->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">

    <style>
        .mainpage{
            display: flex;
            justify-content: center;
            height: 100vh;
            background-color: rgba(2, 5,1, 0.2);
        }
        .header{
            background-color: rgba(2, 5,61, 0.6);
            margin-bottom: 40px;
        }
    </style>
</head>
<body class="bg-light">
    <section class="header p-4">
        <h1 class="text-center">Bienvenue sur le parc informatique de l'IFRI</h1>
    </section>

    <section class="mainpage my-2 p-3">
        <div class="container p-3">
            <div class="row justify-content-center align-items-center h100">
                <div class="col-lg-6">
                    <img src="ressources/images/digital.jpg" class="img-fluid" alt="" srcset="">
                </div>
                <div class="col-lg-6 p-3">
                    <h1>Connection</h1>
                    <form method='post' action='Connection'>
                        <div class="mb-3">
                          <label for="idifri" class="form-label">Identifiant</label>
                          <input type="text" name='login' class="form-control" id="idifri" aria-describedby="emailHelp">
                        </div>
                        <div class="mb-3">
                          <label for="exampleInputPassword1" class="form-label">Password</label>
                          <input type="password" name='password' class="form-control" id="exampleInputPassword1">
                        </div>
                      
                        <button type="submit" class="btn btn-primary me-auto">Se connecter</button>
                      </form>
                </div>
            </div>
        </div>
    </section>

    <script src="ressources/js/bootstrap.min.js"></script>
</body>
</html>