<?php
  class Receita {
    private $nome;
    private $ingredientes;
    private $preparo;
    private $porcoes;
    private $sabor;
    function __construct($nome, $ingredientes, $preparo, $porcoes, $sabor) {
      $this->nome = $nome;
      $this->ingredientes = $ingredientes;
      $this->preparo = $preparo;
      $this->porcoes = $porcoes;
      $this->sabor = $sabor;
    }

    public function inserirReceita() {
      $servidor = "localhost";
      $usuario = "root";
      $senha = "";
      $banco = "findEats";

      $conexao = mysqli_connect($servidor, $usuario, $senha, $banco);
      mysqli_set_charset($conexao, "utf8");
      if(!$conexao){
          die("Falha na conexão " . mysqli_connect_error());
      }
      echo "Conectado com sucesso";

      $query = "INSERT INTO receita (nome,ingredientes,preparo,porcoes,sabor) VALUES ('$this->nome','$this->ingredientes','$this->preparo', '$this->porcoes' ,'$this->sabor')";
      $resultado = mysqli_query($conexao, $query);

      if($resultado != null){
          return "Receita inserida com sucesso";
      }else{
          return "Erro!";
      }
    }
   }
 ?>
