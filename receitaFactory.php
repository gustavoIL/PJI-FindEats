<!DOCTYPE html>
<html lang="pt" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>Feed - FindEats</title>
    <link rel="stylesheet" href="../lib/materialize/css/materialize.css">
    <link href="https://fonts.googleapis.com/css?family=PT+Sans&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="icon" type="imagem/ico" href="../img/logoIcon.png"/>
    <link href="https://fonts.googleapis.com/css?family=Cabin&display=swap" rel="stylesheet">
    <link rel="icon" type="imagem/ico" href="../img/logoIcon.png" />
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <script type="text/javascript" src="../lib/materialize/js/materialize.min.js"></script>
  </head>
  <body>

     <!-- NavBar -->
     <nav class="nav-extended" style="background-color: #af0c14;">
        <div class="nav-wrapper">
            <a href="pesquisaReceitaPag.php" class="brand-logo center " style="font-family: 'Cabin', sans-serif;">FindEats</a>
          <ul id="nav-mobile" class="right hide-on-med-and-down">
            <li><a href="./php/suportePag.php">Suporte</a></li>
            <li><a href="#configuraçõesPag">Configurações</a></li>
          </ul>
        </div>
        <div class="nav-content">
          <ul class="tabs" style="background-color: #a00c13;">
            <li class="tab"><a class="active" href="pesquisaReceitaPag.php">Pesquisar Receita</a></li>
            <li class="tab"><a class="active" href="receitaFactory.html">Criar Receita</a></li>
            <li class="tab"><a class="active" href="perfilPag.html">Perfil</a></li>
            <li class="tab"><a class="active" href="amigosPag.html">Amigos</a></li>
          </ul>
        </div>
     </nav>

     <!-- Form -->
     <br>
      <div class="container" style="border: 2px solid white ; width: 150vh; box-shadow:1px 1px 3px rgba(0,0,0,.5)">
      <br>
      <form class="col s12 container" id="formAdd" action="receitaFactory.php" style = "width: 140vh;" method="post">
         <div class="row">
            <h2 style="font-family: 'PT Sans', sans-serif;">Crie Sua Receita:</h2>
         </div>
         <section style="margin-bottom: 5%;">
          <button style = "margin-left:22%;" class="btn waves-effect waves-light" onclick="addInput()">Adicionar Ingrediente<i class="material-icons right">add_circle</i></button>
          <button class="btn waves-effect waves-light" onclick="addInputEstrela()">Adicionar Ingrediente Protagonista<i class="material-icons right">add_circle</i></button>
          <button class="btn waves-effect waves-light" type="submit" name="action">Criar<i class="material-icons right">search</i></button>
        </section>
        <div class="row">
          <label class="active" for="first_name2">Nome da Receita</label>
          <input name="nomeReceita" type="text" class="validate" placeholder="Pão com Ovo">
          <label for="exampleFormControlTextarea1">Modo de Preparo</label>
          <textarea class="materialize-textarea" name="modoPreparo" id="exampleFormControlTextarea1" rows="3" placeholder="Corte o Pão..."></textarea>
        </div>

      </form>

      <br>
    </div>
    <br>
    <br>
    <br>
    <br>

   <!-- Footer -->
   <footer class="page-footer" style="background-color: #FF8B3E;">
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
      © 2019 Copyright FindEats
      <a class="grey-text text-lighten-4 right" href="./php/suportePag.php">Feedback</a>
      </div>
      </div>
   </footer>

   <script>
      var i = 1;
      var e = 1;
      var valueI = "";
      var valueE = "";

      function createDiv() {
          document.getElementById('mainDiv').innerHTML += '<div class = "container center-align" style="margin-top:2.5%;height:60vh;width:110vh;  border-color:white;border-radius:10px;border-style: solid;box-shadow: 1px 1px 5px rgba(0,0,0,0.5);">'
      }

      function addInput() {
          //if(i-1!=0){
            //  document.getElementById("ingr" + i-1).value = document.getElementById("ingr" + i-1).value;
          //}
          
          document.getElementById("formAdd").innerHTML += '<div class="container"><br><br><label for="ingr'+ i + '">Ingrediente ' + i + ':</label><input type="text" name = "ingr' + i + '" value="'+valueI+'"></input></div>';
          document.getElementById("formAdd").innerHTML += '<div class="container"><br><br><label for="ingr'+ i + '">Porção:</label><input type="text" name = "porc' + i + '" value="'+valueI+'"></input></div>';
          i++;
      }

      function addInputEstrela() {
          document.getElementById("formAdd").innerHTML += '<div class="container"><br><br><label for="ingrEstrela'+ e + '">Ingrediente Protagonista ' + e + ':</label><input type="text" name = "ingrEstrela' + e + '"></input></div>';
          document.getElementById("formAdd").innerHTML += '<div class="container"><br><br><label for="ingrEstrela'+ e + '">Porção:</label><input type="text" name = "porcEstrela' + e + '"></input></div>';
          e++;
      }
  </script>
  <?php
  require_once "Conexao.class.php";
  $conexao = new Conexao();
  $cn = $conexao->getInstance();
  $nomeReceita;
  $modoPreparo;
  $nomeReceita = $_POST["nomeReceita"];
  $modoPreparo = $_POST["modoPreparo"];

  $stmt = $cn->prepare('INSERT INTO recipe values(:receita,:modoPreparo)');
  $stmt->bindValue(':receita', $nomeReceita);
  $stmt->bindValue(':modoPreparo', $modoPreparo);
  $stmt->execute();
  foreach ($_POST as $key => $value) {
    if(strpos($key,"ingr")!== false){
      if(strpos($key,"Estrela")!==false){
        $porc = "porcEstrela".substr($key, -1);
      }else{
        $porc = "porc".substr($key, -1);
      }

      $porcValue = $_POST[$porc];

      
      $stmt02 = $cn->prepare('SELECT nomeIngr FROM ingredientes where nomeIngr = :nomeIngr');
      $stmt02->bindValue(':nomeIngr', $value);
      $stmt02->execute();
      $result=$stmt02->fetchAll(PDO::FETCH_ASSOC);
  
      if(sizeof($result) == 0){
        $stmt03 = $cn->prepare('INSERT INTO ingredientes values(:nomeIngr)');
        $stmt03->bindValue(':nomeIngr', $value);
        $stmt03->execute();
      }

      

      $stmt04 = $cn->prepare('INSERT INTO recipe_ingr values (:nomeRec,:nomeIngr,:porcao)');
      $stmt04->bindValue(':nomeRec', $nomeReceita);
      $stmt04->bindValue(':nomeIngr', $value);
      $stmt04->bindValue(':porcao', $porcValue);
      $stmt04->execute();

  }
}
?>
   </body>
</html>