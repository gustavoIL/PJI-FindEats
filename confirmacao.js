$(document).ready(function() {


    $("#enviar").click(function() {
        if (($("#nome").val() == "") || ($("#email").val() == "") || ($("#senha").val() == "") || ($("#confSenha").val() == "") || ($("#username").val() == "")) {
            alert("Por favor, preencha todos os campos");
            return false;
        } else {
            if (($("#dia").val() == "none") || ($("#mes").val() == "none") || ($("#ano").val() == "none")) {
                alert("Por favor, selecione uma data válida");
                return false;
            } else {
                if ((($("#senha").val()) != ($("#confSenha").val()))) {
                    alert("Confirmação de Senha Incorreta");
                    return false;
                } else {
                    alert("Enviado com sucesso");
                }

            }
        }
    });


    $("input").blur(function() {
        if (($(this).val() == "") || ($(this).val() == "none")) {
            $(this).css({
                "border": "1px solid red"
            });
        } else {
            $(this).css({
                "border": "0px solid black"
            });
        }
    });

});