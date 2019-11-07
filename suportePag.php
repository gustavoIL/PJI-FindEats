<!DOCTYPE html>
<html lang="pt" dir="ltr">

<head>
    <meta charset="utf-8">
    <title>Suporte - FindEats</title>
    <script src="../../../lib/materialize/js/materialize.min.js"></script>
    <link rel="stylesheet" href="../../../lib/materialize/css/materialize.css">
    <link href="https://fonts.googleapis.com/css?family=PT+Sans&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="icon" type="imagem/ico" href="../img/logoIcon.png" />
</head>

<body>
    <!-- NavBar -->
    <nav class="nav-extended" style="background-color: #af0c14;">
        <div class="nav-wrapper">
            <a href="../../feed.html" class="brand-logo">FindEats</a>
            <ul id="nav-mobile" class="right hide-on-med-and-down">
                <li><a href="suportePag.php">Configurações</a></li>
                <li><a href="../../../index.html">Sair</a></li>
            </ul>
        </div>
        <div class="nav-content">
            <ul class="tabs" style="background-color: #a00c13;">
                <li class="tab"><a class="active" href="../receitaFactory.html">Criar Receita</a></li>
                <li class="tab"><a class="active" href="../pesquisaReceitaPag.html">Pesquisar Receita</a></li>
                <li class="tab"><a class="active" href="../perfilPag.html">Perfil</a></li>
                <li class="tab"><a class="active" href="../amigosPag.html">Amigos</a></li>
            </ul>
        </div>
    </nav>

    <!-- Form -->
    <br>
    <div class="container" style="border: 2px solid black;">
        <br>
        <form class="col s12" action="criarFeedback.php" method="post">
            <div class="row">
                <h2 style="font-family: 'PT Sans', sans-serif;">Informe-nos o Problema:</h2>
            </div>
            <div class="row">
                <label class="active" for="first_name2">Seu Nome</label>
                <input name="nomeSuporte" type="text" class="validate" placeholder="Joao da Silva">
            </div>
            <div class="row">
                <label class="active" for="first_name2">Seu Email:</label>
                <input name="emailSuporte" type="email" class="validate" placeholder="joaosilva@email.com">
            </div>
            <div class="row">
                <label for="descricaoProblema">Descrição do problema</label>
                <textarea class="materialize-textarea" id="descricaoProblema" rows="5" placeholder="Nao funciona o negócio ali"></textarea>
            </div>

            <button class="btn waves-effect waves-light" type="submit" name="action">Enviar</button>
        </form>
        <br>
    </div>

    <br>
    <br>
    <br>
    <br>

    <!-- Footer -->
    <footer class="page-footer" style="background-color: #5e0509;">
        <div class="container">
            <div class="row">
                <div class="col l6 s12">
                    <h5 class="white-text">FindEats</h5>
                    <p class="grey-text text-lighten-4">Facilite sua vida, poupe sua mente, inove o seu paladar desvendando horizontes com FindEats</p>
                </div>
                <div class="col l4 offset-l2 s12">
                    <h5 class="white-text">Equipe</h5>
                    <ul>
                        <li><a class="grey-text text-lighten-3" href="https://www.facebook.com/gustavolopesdelira">Gustavo Ita</a></li>
                        <li><a class="grey-text text-lighten-3" href="https://www.facebook.com/davi.cintra.9">Davi Cintra</a></li>
                        <li><a class="grey-text text-lighten-3" href="https://www.facebook.com/carlos.oliveira.524">Carlos Oliveira</a></li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="footer-copyright">
            <div class="container">
                © 2014 Copyright FindEats
                <a class="grey-text text-lighten-4 right" href="./php/suportePag.php">Feedback</a>
            </div>
        </div>
    </footer>
</body>

</html>
