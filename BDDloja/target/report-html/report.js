$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature/loginLoja.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 5,
  "name": "Fazer login",
  "description": "",
  "id": "fazer-login",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 2,
      "name": "@funcionais"
    },
    {
      "line": 4,
      "name": "@tag"
    }
  ]
});
formatter.background({
  "line": 7,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 9,
  "name": "que estou na tela de login da Loja Selenium",
  "keyword": "Dada "
});
formatter.step({
  "line": 11,
  "name": "preencho os campos email \"curso_teste_2@gmail.com\" e senha\"abc.123\"",
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "aciono o botao Sign in",
  "keyword": "Quando "
});
formatter.match({
  "location": "StepesLoginLoja.que_estou_na_tela_de_login_da_Loja_Selenium()"
});
formatter.result({
  "duration": 8294406400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "curso_teste_2@gmail.com",
      "offset": 26
    },
    {
      "val": "abc.123",
      "offset": 59
    }
  ],
  "location": "StepesLoginLoja.preencho_os_campos_email_e_senha(String,String)"
});
formatter.result({
  "duration": 135787400,
  "status": "passed"
});
formatter.match({
  "location": "StepesLoginLoja.aciono_o_botao_Sign_in()"
});
formatter.result({
  "duration": 1484892700,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Fazer login",
  "description": "",
  "id": "fazer-login;fazer-login",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 16,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "o sistem apresenta tela inicial com usuario Ramon Logado",
  "keyword": "Entao "
});
formatter.match({
  "location": "StepesLoginLoja.o_sistem_apresenta_tela_inicial_com_usuario_Ramon_Logado()"
});
formatter.result({
  "duration": 676426600,
  "status": "passed"
});
});