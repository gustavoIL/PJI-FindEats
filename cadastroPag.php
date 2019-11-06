<!DOCTYPE html>
<html lang="pt" dir="ltr">

<head>
    <meta charset="utf-8">
    <title>FindEats - Cadastro</title>
    <link rel="stylesheet" href="../../css/materialize.css">
    <link rel="stylesheet" href="../../css/style.css">
    <link rel="icon" type="imagem/ico" href="../img/logoIcon.png" />
    <script src="js/jquery-3.3.1.min.js"></script>
    <script src="js/confirmacao.js"></script>
</head>

<body class="centralizar">
    <div class="bk-imgCadastro">
    </div>
    <div class="valign-wrapper box">
        <h4>Crie Uma Conta</h4>
        <div class="row">
            <form class="col s12" action="cadastrarUsuario.php" method="POST">
                <div class="row">
                    <div class="input-field col s6">
                        <input type="text" class="validate" placeholder="Primeiro Nome" name="nome">
                    </div>
                    <div class="input-field col s6">
                        <input type="text" class="validate" placeholder="Sobrenome" name="sobrenome">
                    </div>
                </div>
                <div class="row">
                    <div class="input-field col s12">
                        <input type="password" class="validate" placeholder="Senha" name="senha">
                    </div>
                </div>
                <div class="row">
                    <div class="input-field col s12">
                        <input type="password" class="validate" placeholder="Confirme a Senha">
                    </div>
                </div>
                <div class="row">
                    <div class="input-field col s12">
                        <input type="email" class="validate" placeholder="E-mail" name="email">
                    </div>
                </div>
                <div class="row">
                    <div class="input-field col s8">
                        <input type="text" class="validate" placeholder="Nome de Usuário">
                    </div>
                </div>
                <p>
                    <label>
                        <input name="group1" type="radio" checked />
                        <span>Masculino</span>
                    </label>
                </p>
                <p>
                    <label>
                        <input name="group1" type="radio" />
                        <span>Feminino</span>
                    </label>
                </p>
        </div>
        <div class="dataform">
            <select class="browser-default" id="dia">
                <option value="none">Dia</option>
                <option value="1">01</option>
                <option value="2">02</option>
                <option value="3">03</option>
                <option value="4">04</option>
                <option value="5">05</option>
                <option value="6">06</option>
                <option value="7">07</option>
                <option value="8">08</option>
                <option value="9">09</option>
                <option value="10">10</option>
                <option value="11">11</option>
                <option value="12">12</option>
                <option value="13">13</option>
                <option value="14">14</option>
                <option value="15">15</option>
                <option value="16">16</option>
                <option value="17">17</option>
                <option value="18">18</option>
                <option value="19">19</option>
                <option value="20">20</option>
                <option value="21">21</option>
                <option value="22">22</option>
                <option value="23">23</option>
                <option value="24">24</option>
                <option value="25">25</option>
                <option value="26">26</option>
                <option value="27">27</option>
                <option value="28">28</option>
                <option value="29">29</option>
                <option value="30">30</option>
                <option value="31">31</option>
            </select>
            <select class="browser-default" id="mes">
                <option value="none">Mês</option>
                <option value="1">01</option>
                <option value="2">02</option>
                <option value="3">03</option>
                <option value="4">04</option>
                <option value="5">05</option>
                <option value="6">06</option>
                <option value="7">07</option>
                <option value="8">08</option>
                <option value="9">09</option>
                <option value="10">10</option>
                <option value="11">11</option>
                <option value="12">12</option>
            </select>
            <select class="browser-default" id="ano">
                <option value="none">Ano</option>
                <option value="2019">2019</option>
                <option value="2018">2018</option>
                <option value="2017">2017</option>
                <option value="2016">2016</option>
                <option value="2015">2015</option>
                <option value="2014">2014</option>
                <option value="2013">2013</option>
                <option value="2012">2012</option>
                <option value="2011">2011</option>
                <option value="2010">2010</option>
                <option value="2009">2009</option>
                <option value="2008">2008</option>
                <option value="2019">2007</option>
                <option value="2018">2006</option>
                <option value="2017">2005</option>
                <option value="2016">2004</option>
                <option value="2015">2003</option>
                <option value="2014">2002</option>
                <option value="2013">2001</option>
                <option value="2012">2000</option>
                <option value="2011">1999</option>
                <option value="2010">1998</option>
                <option value="2009">1997</option>
                <option value="2008">1996</option>
            </select>
        </div>
        <button class="btn waves-effect waves-light" style="margin-left: 40%; margin-top: 2%;" type="submit">Criar</button>
        </form>
    </div>
</body>

</html>
